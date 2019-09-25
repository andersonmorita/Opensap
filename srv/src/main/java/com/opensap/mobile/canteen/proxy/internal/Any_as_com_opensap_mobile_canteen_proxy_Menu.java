//# xsc 19.6.0-a27f20-20190621

package com.opensap.mobile.canteen.proxy.internal;

public abstract class Any_as_com_opensap_mobile_canteen_proxy_Menu
{
    public static com.opensap.mobile.canteen.proxy.Menu cast(final Object value)
    {
        //# /usr/sap/ljs/xs-temp/2cb4083d-8567-49f9-bddd-72117117aa35/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:1112:32 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:88:16 => /usr/sap/ljs/xs-temp/xs-home/templates/Any.as.xs:7:12
        if (value instanceof com.opensap.mobile.canteen.proxy.Menu)
        {
            final com.opensap.mobile.canteen.proxy.Menu var_value = ((com.opensap.mobile.canteen.proxy.Menu)value);
            return var_value;
        }
        else
        {
            throw com.sap.cloud.server.odata.core.CastException.cannotCast(value, "com.opensap.mobile.canteen.proxy.Menu");
        }
    }
}
