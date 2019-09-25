// Note: Customizations placed in this file might be lost if the OData service is regenerated!
// Please place any customizations of listener registration in the ProviderSettings class.

package com.opensap.mobile.canteen.base;

import com.sap.cloud.server.odata.*;

class RegisterListeners {
    private static EntityListener bookingListener;
    private static EntityListener canteenListener;
    private static EntityListener menuListener;

    public static void withServlet(com.opensap.mobile.canteen.MainServlet servlet) {
        com.opensap.mobile.canteen.proxy.CanteenService service = (com.opensap.mobile.canteen.proxy.CanteenService)servlet.getDataService();
        bookingListener = new com.opensap.mobile.canteen.listener.BookingListener(servlet, service);
        canteenListener = new com.opensap.mobile.canteen.listener.CanteenListener(servlet, service);
        menuListener = new com.opensap.mobile.canteen.listener.MenuListener(servlet, service);
        servlet.registerEntityListener(com.opensap.mobile.canteen.proxy.CanteenServiceMetadata.EntityTypes.booking, bookingListener);
        servlet.registerEntityListener(com.opensap.mobile.canteen.proxy.CanteenServiceMetadata.EntityTypes.canteen, canteenListener);
        servlet.registerEntityListener(com.opensap.mobile.canteen.proxy.CanteenServiceMetadata.EntityTypes.menu, menuListener);
    }
}
