package com.opensap.mobile.canteen.listener;

import com.sap.cloud.server.odata.*;

public class MenuListener extends com.sap.cloud.server.odata.DefaultEntityListener {
    private com.opensap.mobile.canteen.MainServlet servlet;
    private com.opensap.mobile.canteen.proxy.CanteenService service;

    public MenuListener(com.opensap.mobile.canteen.MainServlet servlet, com.opensap.mobile.canteen.proxy.CanteenService service) {
        super();
        this.servlet = servlet;
        this.service = service;
    }

    @Override public void beforeQuery(DataQuery query) {
    }

    public void beforeSave(EntityValue entityValue) {
        com.opensap.mobile.canteen.proxy.Menu entity = (com.opensap.mobile.canteen.proxy.Menu)entityValue;
        // Shared code for beforeCreate / beforeUpdate.
        
        // Check if the price of a menu is below 100 to generate a business rule validation
 if (entity.getPrice().compareTo(new java.math.BigDecimal(100.0)) == 1) {
     throw DataServiceException.validationError("Menu price needs to be under 100. Value was: " + entity.getPrice());
  } 
        
    }

    @Override public void beforeCreate(EntityValue entityValue) {
        com.opensap.mobile.canteen.proxy.Menu entity = (com.opensap.mobile.canteen.proxy.Menu)entityValue;
        beforeSave(entity);
    }

    @Override public void beforeUpdate(EntityValue entityValue) {
        com.opensap.mobile.canteen.proxy.Menu entity = (com.opensap.mobile.canteen.proxy.Menu)entityValue;
        beforeSave(entity);
    }

    @Override public void beforeDelete(EntityValue entityValue) {
        com.opensap.mobile.canteen.proxy.Menu entity = (com.opensap.mobile.canteen.proxy.Menu)entityValue;
    }

    public void afterSave(EntityValue entityValue) {
        // Shared code for afterCreate / afterUpdate.
        com.opensap.mobile.canteen.proxy.Menu entity = (com.opensap.mobile.canteen.proxy.Menu)entityValue;
    }

    @Override public void afterCreate(EntityValue entityValue) {
        com.opensap.mobile.canteen.proxy.Menu entity = (com.opensap.mobile.canteen.proxy.Menu)entityValue;
        afterSave(entity);
    }

    @Override public void afterUpdate(EntityValue entityValue) {
        com.opensap.mobile.canteen.proxy.Menu entity = (com.opensap.mobile.canteen.proxy.Menu)entityValue;
        afterSave(entity);
    }

    @Override public void afterDelete(EntityValue entityValue) {
        com.opensap.mobile.canteen.proxy.Menu entity = (com.opensap.mobile.canteen.proxy.Menu)entityValue;
    }
}
