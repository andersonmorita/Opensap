package com.opensap.mobile.canteen.listener;

import com.sap.cloud.server.odata.*;

public class BookingListener extends com.sap.cloud.server.odata.DefaultEntityListener {
    private com.opensap.mobile.canteen.MainServlet servlet;
    private com.opensap.mobile.canteen.proxy.CanteenService service;

    public BookingListener(com.opensap.mobile.canteen.MainServlet servlet, com.opensap.mobile.canteen.proxy.CanteenService service) {
        super();
        this.servlet = servlet;
        this.service = service;
    }

    @Override public void beforeQuery(DataQuery query) {
    }

    public void beforeSave(EntityValue entityValue) {
        com.opensap.mobile.canteen.proxy.Booking entity = (com.opensap.mobile.canteen.proxy.Booking)entityValue;
        // Shared code for beforeCreate / beforeUpdate.
    }

    @Override public void beforeCreate(EntityValue entityValue) {
        com.opensap.mobile.canteen.proxy.Booking entity = (com.opensap.mobile.canteen.proxy.Booking)entityValue;
        beforeSave(entity);
    }

    @Override public void beforeUpdate(EntityValue entityValue) {
        com.opensap.mobile.canteen.proxy.Booking entity = (com.opensap.mobile.canteen.proxy.Booking)entityValue;
        beforeSave(entity);
    }

    @Override public void beforeDelete(EntityValue entityValue) {
        com.opensap.mobile.canteen.proxy.Booking entity = (com.opensap.mobile.canteen.proxy.Booking)entityValue;
    }

    public void afterSave(EntityValue entityValue) {
        // Shared code for afterCreate / afterUpdate.
        com.opensap.mobile.canteen.proxy.Booking entity = (com.opensap.mobile.canteen.proxy.Booking)entityValue;
    }

    @Override public void afterCreate(EntityValue entityValue) {
        com.opensap.mobile.canteen.proxy.Booking entity = (com.opensap.mobile.canteen.proxy.Booking)entityValue;
        afterSave(entity);
    }

    @Override public void afterUpdate(EntityValue entityValue) {
        com.opensap.mobile.canteen.proxy.Booking entity = (com.opensap.mobile.canteen.proxy.Booking)entityValue;
        afterSave(entity);
    }

    @Override public void afterDelete(EntityValue entityValue) {
        com.opensap.mobile.canteen.proxy.Booking entity = (com.opensap.mobile.canteen.proxy.Booking)entityValue;
    }
}
