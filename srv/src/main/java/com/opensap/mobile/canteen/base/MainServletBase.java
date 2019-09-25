// Note: Customizations placed in this file might be lost if the OData service is regenerated!
// Please place your customizations in the MainServlet class in the parent folder.

package com.opensap.mobile.canteen.base;

import com.sap.cloud.server.odata.*;

public abstract class MainServletBase extends DataServlet {
    private static final long serialVersionUID = 1L;

    public InMemoryDatabase provider;

    public com.opensap.mobile.canteen.proxy.CanteenService service;

    public org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(com.opensap.mobile.canteen.LogSettings.LOGGER_NAME);

    public void init(javax.servlet.ServletConfig config) throws javax.servlet.ServletException {
        super.init(config);
        this.setTraceRequests(logger.isDebugEnabled() | com.opensap.mobile.canteen.LogSettings.LOG_DEBUG | com.opensap.mobile.canteen.LogSettings.LOG_TRACE);
        this.setTraceWithData(logger.isTraceEnabled() | com.opensap.mobile.canteen.LogSettings.LOG_TRACE);
        this.setPrettyTracing(com.opensap.mobile.canteen.LogSettings.PRETTY_TRACING);
        this.setDefaultPageSize(1000);
        this.setMaximumGraphSize(10000);
        this.setAllowNestedPaging(false);
        this.setAllowNonPatchUpdates(false);
        this.setTrackChangesByDefault(true);
        this.setRequiresAuthentication(false);
        this.setSupportsRepeatability(true);
        this.setSupportsTransaction(false);
        provider = new InMemoryDatabase("CanteenService");
        com.opensap.mobile.canteen.ProviderSettings.init((com.opensap.mobile.canteen.MainServlet)this);
        com.opensap.mobile.canteen.ProviderSettings.init(provider);
        service = new com.opensap.mobile.canteen.proxy.CanteenService(provider);
        RegisterHandlers.withServlet((com.opensap.mobile.canteen.MainServlet)this);
        RegisterListeners.withServlet((com.opensap.mobile.canteen.MainServlet)this);
        service.getMetadata().addRepeatability();
        service.getMetadata().inheritAnnotations();
        service.getMetadata().applyAnnotations();
        service.getMetadata().removeServerOnly("SQL");
        service.getMetadata().removeReferences("SQL");
        provider.createSchema();
        this.loadInitialData(com.opensap.mobile.canteen.TestSettings.TEST_MODE);
        logger.info("Started " + service.getName());
    }

    public void destroy() {
        logger.info("Stopped " + service.getName());
    }

    public DataService getDataService() {
        return service;
    }
}
