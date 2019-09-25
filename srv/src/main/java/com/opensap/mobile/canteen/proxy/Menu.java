//# xsc 19.6.0-a27f20-20190621

package com.opensap.mobile.canteen.proxy;

public class Menu
    extends com.sap.cloud.server.odata.EntityValue
{
    public static final com.sap.cloud.server.odata.Property bookingID = com.opensap.mobile.canteen.proxy.CanteenServiceMetadata.EntityTypes.menu.getProperty("BookingID");

    public static final com.sap.cloud.server.odata.Property canteenID = com.opensap.mobile.canteen.proxy.CanteenServiceMetadata.EntityTypes.menu.getProperty("CanteenID");

    public static final com.sap.cloud.server.odata.Property dateOfLunch = com.opensap.mobile.canteen.proxy.CanteenServiceMetadata.EntityTypes.menu.getProperty("DateOfLunch");

    public static final com.sap.cloud.server.odata.Property dessert = com.opensap.mobile.canteen.proxy.CanteenServiceMetadata.EntityTypes.menu.getProperty("Dessert");

    public static final com.sap.cloud.server.odata.Property kcalForMain = com.opensap.mobile.canteen.proxy.CanteenServiceMetadata.EntityTypes.menu.getProperty("KcalForMain");

    public static final com.sap.cloud.server.odata.Property mainDish = com.opensap.mobile.canteen.proxy.CanteenServiceMetadata.EntityTypes.menu.getProperty("MainDish");

    public static final com.sap.cloud.server.odata.Property menuID = com.opensap.mobile.canteen.proxy.CanteenServiceMetadata.EntityTypes.menu.getProperty("MenuID");

    public static final com.sap.cloud.server.odata.Property price = com.opensap.mobile.canteen.proxy.CanteenServiceMetadata.EntityTypes.menu.getProperty("Price");

    public static final com.sap.cloud.server.odata.Property sides = com.opensap.mobile.canteen.proxy.CanteenServiceMetadata.EntityTypes.menu.getProperty("Sides");

    public static final com.sap.cloud.server.odata.Property soup = com.opensap.mobile.canteen.proxy.CanteenServiceMetadata.EntityTypes.menu.getProperty("Soup");

    public static final com.sap.cloud.server.odata.Property veggie = com.opensap.mobile.canteen.proxy.CanteenServiceMetadata.EntityTypes.menu.getProperty("veggie");

    public static final com.sap.cloud.server.odata.Property bookings = com.opensap.mobile.canteen.proxy.CanteenServiceMetadata.EntityTypes.menu.getProperty("Bookings");

    public static final com.sap.cloud.server.odata.Property inCanteen = com.opensap.mobile.canteen.proxy.CanteenServiceMetadata.EntityTypes.menu.getProperty("inCanteen");

    public Menu()
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:292:5
        this(true);
    }

    public Menu(final boolean withDefaults)
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:292:5
        super(withDefaults, com.opensap.mobile.canteen.proxy.CanteenServiceMetadata.EntityTypes.menu);
    }

    public com.opensap.mobile.canteen.proxy.Menu copy()
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:277:5
        return com.opensap.mobile.canteen.proxy.internal.Any_as_com_opensap_mobile_canteen_proxy_Menu.cast(this.copyEntity());
    }

    public long getBookingID()
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:331:5
        return com.sap.cloud.server.odata.LongValue.unwrap(this.getDataValue(com.opensap.mobile.canteen.proxy.Menu.bookingID));
    }

    public com.opensap.mobile.canteen.proxy.BookingList getBookings()
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:474:5
        return com.opensap.mobile.canteen.proxy.BookingList.share(com.sap.cloud.server.odata.EntityValueList.castRequired(this.getDataValue(com.opensap.mobile.canteen.proxy.Menu.bookings)));
    }

    public long getCanteenID()
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:344:5
        return com.sap.cloud.server.odata.LongValue.unwrap(this.getDataValue(com.opensap.mobile.canteen.proxy.Menu.canteenID));
    }

    public com.sap.cloud.server.odata.GlobalDateTime getDateOfLunch()
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:357:5
        return com.sap.cloud.server.odata.GlobalDateTime.castRequired(this.getDataValue(com.opensap.mobile.canteen.proxy.Menu.dateOfLunch));
    }

    public String getDessert()
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:370:5
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.opensap.mobile.canteen.proxy.Menu.dessert));
    }

    public com.opensap.mobile.canteen.proxy.Canteen getInCanteen()
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:487:5
        return com.opensap.mobile.canteen.proxy.internal.Any_as_com_opensap_mobile_canteen_proxy_Canteen.cast(this.getDataValue(com.opensap.mobile.canteen.proxy.Menu.inCanteen));
    }

    public Integer getKcalForMain()
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:383:5
        return com.sap.cloud.server.odata.IntValue.toNullable(this.getDataValue(com.opensap.mobile.canteen.proxy.Menu.kcalForMain));
    }

    public String getMainDish()
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:396:5
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.opensap.mobile.canteen.proxy.Menu.mainDish));
    }

    public long getMenuID()
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:409:5
        return com.sap.cloud.server.odata.LongValue.unwrap(this.getDataValue(com.opensap.mobile.canteen.proxy.Menu.menuID));
    }

    public com.opensap.mobile.canteen.proxy.Menu getOld()
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:272:5
        return com.opensap.mobile.canteen.proxy.internal.Any_as_com_opensap_mobile_canteen_proxy_Menu.cast(this.getOldEntity());
    }

    public java.math.BigDecimal getPrice()
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:422:5
        return com.sap.cloud.server.odata.DecimalValue.unwrap(this.getDataValue(com.opensap.mobile.canteen.proxy.Menu.price));
    }

    public String getSides()
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:435:5
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.opensap.mobile.canteen.proxy.Menu.sides));
    }

    public String getSoup()
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:448:5
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.opensap.mobile.canteen.proxy.Menu.soup));
    }

    public Boolean getVeggie()
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:461:5
        return com.sap.cloud.server.odata.BooleanValue.toNullable(this.getDataValue(com.opensap.mobile.canteen.proxy.Menu.veggie));
    }

    @java.lang.Override public boolean isProxy()
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:265:5
        return true;
    }

    public static com.sap.cloud.server.odata.EntityKey key(final long menuID)
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:282:12
        return new com.sap.cloud.server.odata.EntityKey().with("MenuID", com.sap.cloud.server.odata.LongValue.of(menuID));
    }

    public static com.opensap.mobile.canteen.proxy.MenuList list(final com.sap.cloud.server.odata.EntityValueList from)
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:287:12
        return com.opensap.mobile.canteen.proxy.MenuList.share(from);
    }

    public void setBookingID(final long value)
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:336:5
        this.setDataValue(com.opensap.mobile.canteen.proxy.Menu.bookingID, com.sap.cloud.server.odata.LongValue.of(value));
    }

    public void setBookings(final com.opensap.mobile.canteen.proxy.BookingList value)
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:479:5
        com.opensap.mobile.canteen.proxy.Menu.bookings.setEntityList(this, com.sap.cloud.server.odata.EntityValueList.share(value));
    }

    public void setCanteenID(final long value)
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:349:5
        this.setDataValue(com.opensap.mobile.canteen.proxy.Menu.canteenID, com.sap.cloud.server.odata.LongValue.of(value));
    }

    public void setDateOfLunch(final com.sap.cloud.server.odata.GlobalDateTime value)
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:362:5
        this.setDataValue(com.opensap.mobile.canteen.proxy.Menu.dateOfLunch, value);
    }

    public void setDessert(final String value)
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:375:5
        this.setDataValue(com.opensap.mobile.canteen.proxy.Menu.dessert, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setInCanteen(final com.opensap.mobile.canteen.proxy.Canteen value)
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:492:5
        this.setDataValue(com.opensap.mobile.canteen.proxy.Menu.inCanteen, value);
    }

    public void setKcalForMain(final Integer value)
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:388:5
        this.setDataValue(com.opensap.mobile.canteen.proxy.Menu.kcalForMain, com.sap.cloud.server.odata.IntValue.ofNullable(value));
    }

    public void setMainDish(final String value)
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:401:5
        this.setDataValue(com.opensap.mobile.canteen.proxy.Menu.mainDish, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setMenuID(final long value)
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:414:5
        this.setDataValue(com.opensap.mobile.canteen.proxy.Menu.menuID, com.sap.cloud.server.odata.LongValue.of(value));
    }

    public void setPrice(final java.math.BigDecimal value)
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:427:5
        this.setDataValue(com.opensap.mobile.canteen.proxy.Menu.price, com.sap.cloud.server.odata.DecimalValue.of(value));
    }

    public void setSides(final String value)
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:440:5
        this.setDataValue(com.opensap.mobile.canteen.proxy.Menu.sides, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setSoup(final String value)
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:453:5
        this.setDataValue(com.opensap.mobile.canteen.proxy.Menu.soup, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setVeggie(final Boolean value)
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:466:5
        this.setDataValue(com.opensap.mobile.canteen.proxy.Menu.veggie, com.sap.cloud.server.odata.BooleanValue.ofNullable(value));
    }
}
