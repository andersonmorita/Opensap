//# xsc 19.6.0-a27f20-20190621

package com.opensap.mobile.canteen.proxy.internal;

public abstract class CanteenServiceMetadataText
{
    public static final String XML = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<edmx:Edmx Version=\"1.0\" xmlns:edmx=\"http://schemas.microsoft.com/ado/2007/06/edmx\" xmlns:edmx4=\"http://docs.oasis-open.org/odata/ns/edmx\" xmlns:m=\"http://schemas.microsoft.com/ado/2007/08/dataservices/metadata\">\n<edmx4:Reference Uri=\"vocabularies/com.sap.cloud.server.odata.sql.v1.xml\">\n<edmx4:Include Namespace=\"com.sap.cloud.server.odata.sql.v1\" Alias=\"SQL\"/>\n</edmx4:Reference>\n<edmx:DataServices m:DataServiceVersion=\"2.0\">\n<Schema Namespace=\"com.opensap.mobile.canteen\" Alias=\"canteen\" xmlns=\"http://schemas.microsoft.com/ado/2008/09/edm\">\n<EntityType Name=\"Booking\">\n<Key>\n<PropertyRef Name=\"BookingID\"/>\n</Key>\n<Property Name=\"BookingDate\" Type=\"Edm.DateTimeOffset\" Nullable=\"false\"/>\n<Property Name=\"BookingID\" Type=\"Edm.Int64\" Nullable=\"false\"/>\n<Property Name=\"BookingsID\" Type=\"Edm.Int64\" Nullable=\"true\"/>\n<Property Name=\"MenuID\" Type=\"Edm.Int64\" Nullable=\"false\"/>\n<Property Name=\"Price\" Type=\"Edm.Decimal\" Nullable=\"false\" Precision=\"10\" Scale=\"2\"/>\n<Property Name=\"Status\" Type=\"Edm.String\" Nullable=\"false\" MaxLength=\"20\"/>\n<Property Name=\"User\" Type=\"Edm.String\" Nullable=\"false\" MaxLength=\"100\"/>\n<NavigationProperty Name=\"MenuBooked\" Relationship=\"canteen.Booking_to_MenuBooked\" FromRole=\"BookingDependent\" ToRole=\"MenuPrincipal\"/>\n</EntityType>\n<EntityType Name=\"Canteen\">\n<Key>\n<PropertyRef Name=\"CanteenID\"/>\n</Key>\n<Property Name=\"CanteenID\" Type=\"Edm.Int64\" Nullable=\"false\"/>\n<Property Name=\"Location\" Type=\"Edm.String\" Nullable=\"false\" MaxLength=\"100\"/>\n<NavigationProperty Name=\"serveMenus\" Relationship=\"canteen.Menu_to_InCanteen\" FromRole=\"CanteenPrincipal\" ToRole=\"MenuDependent\"/>\n</EntityType>\n<EntityType Name=\"Menu\">\n<Key>\n<PropertyRef Name=\"MenuID\"/>\n</Key>\n<Property Name=\"BookingID\" Type=\"Edm.Int64\" Nullable=\"false\"/>\n<Property Name=\"CanteenID\" Type=\"Edm.Int64\" Nullable=\"false\"/>\n<Property Name=\"DateOfLunch\" Type=\"Edm.DateTimeOffset\" Nullable=\"false\"/>\n<Property Name=\"Dessert\" Type=\"Edm.String\" Nullable=\"true\" MaxLength=\"100\"/>\n<Property Name=\"KcalForMain\" Type=\"Edm.Int32\" Nullable=\"true\"/>\n<Property Name=\"MainDish\" Type=\"Edm.String\" Nullable=\"false\" MaxLength=\"100\"/>\n<Property Name=\"MenuID\" Type=\"Edm.Int64\" Nullable=\"false\"/>\n<Property Name=\"Price\" Type=\"Edm.Decimal\" Nullable=\"false\" Precision=\"10\" Scale=\"2\"/>\n<Property Name=\"Sides\" Type=\"Edm.String\" Nullable=\"true\" MaxLength=\"100\"/>\n<Property Name=\"Soup\" Type=\"Edm.String\" Nullable=\"true\" MaxLength=\"100\"/>\n<Property Name=\"veggie\" Type=\"Edm.Boolean\" Nullable=\"true\"/>\n<NavigationProperty Name=\"Bookings\" Relationship=\"canteen.Booking_to_MenuBooked\" FromRole=\"MenuPrincipal\" ToRole=\"BookingDependent\"/>\n<NavigationProperty Name=\"inCanteen\" Relationship=\"canteen.Menu_to_InCanteen\" FromRole=\"MenuDependent\" ToRole=\"CanteenPrincipal\"/>\n</EntityType>\n<Association Name=\"Booking_to_MenuBooked\">\n<End Type=\"canteen.Booking\" Multiplicity=\"*\" Role=\"BookingDependent\"/>\n<End Type=\"canteen.Menu\" Multiplicity=\"1\" Role=\"MenuPrincipal\"/>\n<ReferentialConstraint>\n<Principal Role=\"MenuPrincipal\">\n<PropertyRef Name=\"MenuID\"/>\n</Principal>\n<Dependent Role=\"BookingDependent\">\n<PropertyRef Name=\"MenuID\"/>\n</Dependent>\n</ReferentialConstraint>\n</Association>\n<Association Name=\"Menu_to_InCanteen\">\n<End Type=\"canteen.Menu\" Multiplicity=\"*\" Role=\"MenuDependent\"/>\n<End Type=\"canteen.Canteen\" Multiplicity=\"1\" Role=\"CanteenPrincipal\"/>\n<ReferentialConstraint>\n<Principal Role=\"CanteenPrincipal\">\n<PropertyRef Name=\"CanteenID\"/>\n</Principal>\n<Dependent Role=\"MenuDependent\">\n<PropertyRef Name=\"CanteenID\"/>\n</Dependent>\n</ReferentialConstraint>\n</Association>\n<EntityContainer Name=\"CanteenService\" m:IsDefaultEntityContainer=\"true\">\n<Annotation Term=\"SQL.TrackChanges\" xmlns=\"http://docs.oasis-open.org/odata/ns/edm\"/>\n<EntitySet Name=\"BookingSet\" EntityType=\"canteen.Booking\"/>\n<EntitySet Name=\"CanteenSet\" EntityType=\"canteen.Canteen\"/>\n<EntitySet Name=\"MenuSet\" EntityType=\"canteen.Menu\"/>\n<AssociationSet Name=\"BookingSet_to_MenuSet\" Association=\"canteen.Booking_to_MenuBooked\">\n<End EntitySet=\"BookingSet\" Role=\"BookingDependent\"/>\n<End EntitySet=\"MenuSet\" Role=\"MenuPrincipal\"/>\n</AssociationSet>\n<AssociationSet Name=\"MenuSet_to_CanteenSet\" Association=\"canteen.Menu_to_InCanteen\">\n<End EntitySet=\"MenuSet\" Role=\"MenuDependent\"/>\n<End EntitySet=\"CanteenSet\" Role=\"CanteenPrincipal\"/>\n</AssociationSet>\n<FunctionImport Name=\"BookLunch\" m:HttpMethod=\"GET\" ReturnType=\"Edm.Boolean\">\n<Parameter Name=\"MenuID\" Type=\"Edm.Int64\" Nullable=\"false\"/>\n<Parameter Name=\"UserID\" Type=\"Edm.String\" Nullable=\"false\" MaxLength=\"100\"/>\n</FunctionImport>\n</EntityContainer>\n</Schema>\n</edmx:DataServices>\n</edmx:Edmx>\n";
}
