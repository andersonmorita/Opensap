//# xsc 19.6.0-a27f20-20190621

package com.opensap.mobile.canteen.proxy;

public class Canteen
    extends com.sap.cloud.server.odata.EntityValue
{
    public static final com.sap.cloud.server.odata.Property canteenID = com.opensap.mobile.canteen.proxy.CanteenServiceMetadata.EntityTypes.canteen.getProperty("CanteenID");

    public static final com.sap.cloud.server.odata.Property location = com.opensap.mobile.canteen.proxy.CanteenServiceMetadata.EntityTypes.canteen.getProperty("Location");

    public static final com.sap.cloud.server.odata.Property serveMenus = com.opensap.mobile.canteen.proxy.CanteenServiceMetadata.EntityTypes.canteen.getProperty("serveMenus");

    public Canteen()
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:201:5
        this(true);
    }

    public Canteen(final boolean withDefaults)
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:201:5
        super(withDefaults, com.opensap.mobile.canteen.proxy.CanteenServiceMetadata.EntityTypes.canteen);
    }

    public com.opensap.mobile.canteen.proxy.Canteen copy()
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:186:5
        return com.opensap.mobile.canteen.proxy.internal.Any_as_com_opensap_mobile_canteen_proxy_Canteen.cast(this.copyEntity());
    }

    public long getCanteenID()
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:220:5
        return com.sap.cloud.server.odata.LongValue.unwrap(this.getDataValue(com.opensap.mobile.canteen.proxy.Canteen.canteenID));
    }

    public String getLocation()
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:233:5
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.opensap.mobile.canteen.proxy.Canteen.location));
    }

    public com.opensap.mobile.canteen.proxy.Canteen getOld()
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:181:5
        return com.opensap.mobile.canteen.proxy.internal.Any_as_com_opensap_mobile_canteen_proxy_Canteen.cast(this.getOldEntity());
    }

    public com.opensap.mobile.canteen.proxy.MenuList getServeMenus()
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:246:5
        return com.opensap.mobile.canteen.proxy.MenuList.share(com.sap.cloud.server.odata.EntityValueList.castRequired(this.getDataValue(com.opensap.mobile.canteen.proxy.Canteen.serveMenus)));
    }

    @java.lang.Override public boolean isProxy()
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:174:5
        return true;
    }

    public static com.sap.cloud.server.odata.EntityKey key(final long canteenID)
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:191:12
        return new com.sap.cloud.server.odata.EntityKey().with("CanteenID", com.sap.cloud.server.odata.LongValue.of(canteenID));
    }

    public static com.opensap.mobile.canteen.proxy.CanteenList list(final com.sap.cloud.server.odata.EntityValueList from)
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:196:12
        return com.opensap.mobile.canteen.proxy.CanteenList.share(from);
    }

    public void setCanteenID(final long value)
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:225:5
        this.setDataValue(com.opensap.mobile.canteen.proxy.Canteen.canteenID, com.sap.cloud.server.odata.LongValue.of(value));
    }

    public void setLocation(final String value)
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:238:5
        this.setDataValue(com.opensap.mobile.canteen.proxy.Canteen.location, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setServeMenus(final com.opensap.mobile.canteen.proxy.MenuList value)
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:251:5
        com.opensap.mobile.canteen.proxy.Canteen.serveMenus.setEntityList(this, com.sap.cloud.server.odata.EntityValueList.share(value));
    }
}
