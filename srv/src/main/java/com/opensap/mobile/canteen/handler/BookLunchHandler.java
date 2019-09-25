package com.opensap.mobile.canteen.handler;

import com.sap.cloud.server.odata.*;
import com.opensap.mobile.canteen.proxy.*;

public class BookLunchHandler extends com.sap.cloud.server.odata.DefaultMethodHandler {
    private com.opensap.mobile.canteen.MainServlet servlet;
    private com.opensap.mobile.canteen.proxy.CanteenService service;

    public BookLunchHandler(com.opensap.mobile.canteen.MainServlet servlet, com.opensap.mobile.canteen.proxy.CanteenService service) {
        super(servlet, service);
        this.servlet = servlet;
        this.service = service;
    }

    @Override public DataValue executeMethod(DataMethod method, ParameterList parameters) {
        long MenuID = LongValue.unwrap(parameters.getRequired("MenuID"));
        String UserID = StringValue.unwrap(parameters.getRequired("UserID"));
        boolean result = bookLunch(MenuID, UserID);
        return BooleanValue.of(result);
    }

    public boolean bookLunch(long MenuID, String UserID) {
        // Method implementation code should be placed here...
    //    throw DataServiceException.notImplemented("BookLunch");
        
//Load Lunch to retrieve Price
Menu m = service.getMenuWithKey(MenuID);

Booking booking = new Booking();
booking.setMenuID(m.getMenuID());
booking.setPrice(m.getPrice());
booking.setBookingDate(this.servlet.backendTimeNow());
booking.bindEntity(m, Booking.menuBooked);
booking.setUser(UserID);
booking.setStatus("booked");
service.createEntity(booking); //this acutally touches the DB

//Response handling         
return true; 
        
    }

	
	
}
