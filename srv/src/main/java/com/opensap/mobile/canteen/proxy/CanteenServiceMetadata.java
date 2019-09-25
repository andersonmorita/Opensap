//# xsc 19.6.0-a27f20-20190621

package com.opensap.mobile.canteen.proxy;

public abstract class CanteenServiceMetadata
{
    public static final com.sap.cloud.server.odata.csdl.CsdlDocument document = com.opensap.mobile.canteen.proxy.CanteenServiceMetadata.resolve();

    private static com.sap.cloud.server.odata.csdl.CsdlDocument resolve()
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:549:12
        com.opensap.mobile.canteen.proxy.internal.CanteenServiceFactory.registerAll();
        com.opensap.mobile.canteen.proxy.internal.CanteenServiceMetadataParser.parsed.setGeneratedProxies(true);
        return com.opensap.mobile.canteen.proxy.internal.CanteenServiceMetadataParser.parsed;
    }

    public abstract static class EntityTypes
    {
        public static final com.sap.cloud.server.odata.EntityType booking = com.opensap.mobile.canteen.proxy.internal.CanteenServiceMetadataParser.parsed.getEntityType("com.opensap.mobile.canteen.Booking");

        public static final com.sap.cloud.server.odata.EntityType canteen = com.opensap.mobile.canteen.proxy.internal.CanteenServiceMetadataParser.parsed.getEntityType("com.opensap.mobile.canteen.Canteen");

        public static final com.sap.cloud.server.odata.EntityType menu = com.opensap.mobile.canteen.proxy.internal.CanteenServiceMetadataParser.parsed.getEntityType("com.opensap.mobile.canteen.Menu");
    }

    public abstract static class EntitySets
    {
        public static final com.sap.cloud.server.odata.EntitySet bookingSet = com.opensap.mobile.canteen.proxy.internal.CanteenServiceMetadataParser.parsed.getEntitySet("BookingSet");

        public static final com.sap.cloud.server.odata.EntitySet canteenSet = com.opensap.mobile.canteen.proxy.internal.CanteenServiceMetadataParser.parsed.getEntitySet("CanteenSet");

        public static final com.sap.cloud.server.odata.EntitySet menuSet = com.opensap.mobile.canteen.proxy.internal.CanteenServiceMetadataParser.parsed.getEntitySet("MenuSet");
    }

    public abstract static class FunctionImports
    {
        public static final com.sap.cloud.server.odata.DataMethod bookLunch = com.opensap.mobile.canteen.proxy.internal.CanteenServiceMetadataParser.parsed.getDataMethod("BookLunch");
    }
}
