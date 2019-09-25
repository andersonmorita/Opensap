// Note: Customizations placed in this file might be lost if the OData service is regenerated!
// Please place any customizations of handler registration in the ProviderSettings class.

package com.opensap.mobile.canteen.base;

import com.sap.cloud.server.odata.*;

class RegisterHandlers {
    private static EntityHandler handler_Booking;
    private static EntityHandler handler_Canteen;
    private static EntityHandler handler_Menu;

    public static void withServlet(com.opensap.mobile.canteen.MainServlet servlet) {
        com.opensap.mobile.canteen.proxy.CanteenService service = (com.opensap.mobile.canteen.proxy.CanteenService)servlet.getDataService();
        handler_Booking = new com.opensap.mobile.canteen.handler.BookingHandler(servlet, service);
        handler_Canteen = new com.opensap.mobile.canteen.handler.CanteenHandler(servlet, service);
        handler_Menu = new com.opensap.mobile.canteen.handler.MenuHandler(servlet, service);
        servlet.registerEntityHandler(com.opensap.mobile.canteen.proxy.CanteenServiceMetadata.EntityTypes.booking, handler_Booking);
        servlet.registerEntityHandler(com.opensap.mobile.canteen.proxy.CanteenServiceMetadata.EntityTypes.canteen, handler_Canteen);
        servlet.registerEntityHandler(com.opensap.mobile.canteen.proxy.CanteenServiceMetadata.EntityTypes.menu, handler_Menu);
        servlet.registerMethodHandler(com.opensap.mobile.canteen.proxy.CanteenServiceMetadata.FunctionImports.bookLunch, new com.opensap.mobile.canteen.handler.BookLunchHandler(servlet, service));
    }
}
