//# xsc 19.6.0-a27f20-20190621

package com.opensap.mobile.canteen.proxy;

public class CanteenList
    extends com.sap.cloud.server.odata.ListBase
    implements java.lang.Iterable<com.opensap.mobile.canteen.proxy.Canteen>
{
    public static final com.opensap.mobile.canteen.proxy.CanteenList empty = new com.opensap.mobile.canteen.proxy.CanteenList(java.lang.Integer.MIN_VALUE);

    public CanteenList()
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:1098:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:13:5
        this(4);
    }

    public CanteenList(final int capacity)
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:1098:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:13:5
        super(capacity);
    }

    public void add(final com.opensap.mobile.canteen.proxy.Canteen item)
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:1098:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:50:5
        this.getUntypedList().add(this.validate(((Object)item)));
    }

    public void addAll(final com.opensap.mobile.canteen.proxy.CanteenList list)
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:1098:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:59:5
        this.getUntypedList().addAll(list.getUntypedList());
    }

    public com.opensap.mobile.canteen.proxy.CanteenList addThis(final com.opensap.mobile.canteen.proxy.Canteen item)
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:1098:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:70:5
        this.add(item);
        return this;
    }

    public com.opensap.mobile.canteen.proxy.CanteenList copy()
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:1098:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:78:5
        return this.slice(0);
    }

    public com.opensap.mobile.canteen.proxy.Canteen first()
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:1098:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:86:5
        return com.opensap.mobile.canteen.proxy.internal.Any_as_com_opensap_mobile_canteen_proxy_Canteen.cast(this.getUntypedList().first());
    }

    public static com.opensap.mobile.canteen.proxy.CanteenList from(final java.util.List<com.opensap.mobile.canteen.proxy.Canteen> list)
    {
        return CanteenList.share(new com.sap.cloud.server.odata.core.GenericList<com.opensap.mobile.canteen.proxy.Canteen>(list).toAnyList());
    }

    public com.opensap.mobile.canteen.proxy.Canteen get(final int index)
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:1098:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:96:5
        return com.opensap.mobile.canteen.proxy.internal.Any_as_com_opensap_mobile_canteen_proxy_Canteen.cast(this.getUntypedList().get(index));
    }

    public boolean includes(final com.opensap.mobile.canteen.proxy.Canteen item)
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:1098:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:104:5
        return this.indexOf(item) != -1;
    }

    public int indexOf(final com.opensap.mobile.canteen.proxy.Canteen item)
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:1098:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:113:5
        return this.indexOf(item, 0);
    }

    public int indexOf(final com.opensap.mobile.canteen.proxy.Canteen item, final int start)
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:1098:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:113:5
        return this.getUntypedList().indexOf(((Object)item), start);
    }

    public void insertAll(final int index, final com.opensap.mobile.canteen.proxy.CanteenList list)
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:1098:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:135:5
        this.getUntypedList().insertAll(index, list.getUntypedList());
    }

    public void insertAt(final int index, final com.opensap.mobile.canteen.proxy.Canteen item)
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:1098:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:124:5
        this.getUntypedList().insertAt(index, ((Object)item));
    }

    public java.util.Iterator<com.opensap.mobile.canteen.proxy.Canteen> iterator()
    {
        return this.toGeneric().iterator();
    }

    public com.opensap.mobile.canteen.proxy.Canteen last()
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:1098:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:143:5
        return com.opensap.mobile.canteen.proxy.internal.Any_as_com_opensap_mobile_canteen_proxy_Canteen.cast(this.getUntypedList().last());
    }

    public int lastIndexOf(final com.opensap.mobile.canteen.proxy.Canteen item)
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:1098:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:152:5
        return this.lastIndexOf(item, 2147483647);
    }

    public int lastIndexOf(final com.opensap.mobile.canteen.proxy.Canteen item, final int start)
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:1098:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:152:5
        return this.getUntypedList().lastIndexOf(((Object)item), start);
    }

    public void set(final int index, final com.opensap.mobile.canteen.proxy.Canteen item)
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:1098:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:162:5
        this.getUntypedList().set(index, ((Object)item));
    }

    public static com.opensap.mobile.canteen.proxy.CanteenList share(final com.sap.cloud.server.odata.ListBase list)
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:1098:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:24:12
        final com.sap.cloud.server.odata.core.UntypedList items = list.getUntypedList();
        final int n = items.length();
        final com.opensap.mobile.canteen.proxy.CanteenList result = new com.opensap.mobile.canteen.proxy.CanteenList(n);
        boolean replace = false;
        {
            int i = 0;
            for (; (i < n); i++)
            {
                final Object item = items.get(i);
                if (item instanceof com.opensap.mobile.canteen.proxy.Canteen)
                {
                    final com.opensap.mobile.canteen.proxy.Canteen var_item = ((com.opensap.mobile.canteen.proxy.Canteen)item);
                    result.add(var_item);
                }
                else
                {
                    replace = true;
                }
            }
        }
        result.shareWith(list, replace);
        return result;
    }

    public com.opensap.mobile.canteen.proxy.Canteen single()
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:1098:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:171:5
        return com.opensap.mobile.canteen.proxy.internal.Any_as_com_opensap_mobile_canteen_proxy_Canteen.cast(this.getUntypedList().single());
    }

    public com.opensap.mobile.canteen.proxy.CanteenList slice(final int start)
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:1098:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:180:5
        return this.slice(start, 2147483647);
    }

    public com.opensap.mobile.canteen.proxy.CanteenList slice(final int start, final int end)
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:1098:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:180:5
        final com.sap.cloud.server.odata.core.UntypedList list = this.getUntypedList();
        final int var_start = list.startRange(start);
        final int var_end = list.endRange(end);
        final com.opensap.mobile.canteen.proxy.CanteenList result = new com.opensap.mobile.canteen.proxy.CanteenList(var_end - var_start);
        result.getUntypedList().addRange(list, var_start, var_end);
        return result;
    }

    @java.lang.Override public com.sap.cloud.server.odata.ListBase toDynamic()
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:1100:5
        return this.toEntityList();
    }

    public com.sap.cloud.server.odata.EntityValueList toEntityList()
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:1105:5
        return com.sap.cloud.server.odata.EntityValueList.share(this).withItemType(com.opensap.mobile.canteen.proxy.CanteenServiceMetadata.EntityTypes.canteen);
    }

    public java.util.List<com.opensap.mobile.canteen.proxy.Canteen> toGeneric()
    {
        return new com.sap.cloud.server.odata.core.GenericList<com.opensap.mobile.canteen.proxy.Canteen>(this);
    }
}
