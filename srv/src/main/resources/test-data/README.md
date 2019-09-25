For each entity set, test data can optionally be provided in a file *EntitySetName.json*.

Test data is available only in "test mode", not in production mode.

Please refer to the generated TestSettings class to see the options for enabling test mode.

Sample test data for file BookingSet.json:

''' JSON
[
    {
        "BookingDate": "2019-09-24T01:06:10.437Z",
        "BookingID": "101",
        "BookingsID": "1234567890123",
        "MenuID": "301",
        "Price": "12345678.12",
        "Status": "ABCDEFGHIJKLMNOPQRST",
        "User": "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    },
    {
        "BookingDate": "2019-09-24T01:06:10.437Z",
        "BookingID": "102",
        "BookingsID": null,
        "MenuID": "302",
        "Price": "98765432.98",
        "Status": "XYZ",
        "User": "XYZ"
    }
]
'''

Sample test data for file CanteenSet.json:

''' JSON
[
    {
        "CanteenID": "201",
        "Location": "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    },
    {
        "CanteenID": "202",
        "Location": "XYZ"
    }
]
'''

Sample test data for file MenuSet.json:

''' JSON
[
    {
        "BookingID": "1234567890123",
        "CanteenID": "201",
        "DateOfLunch": "2019-09-24T01:06:10.437Z",
        "Dessert": "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
        "KcalForMain": 123,
        "MainDish": "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
        "MenuID": "301",
        "Price": "12345678.12",
        "Sides": "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
        "Soup": "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
        "veggie": false
    },
    {
        "BookingID": "9876543210987",
        "CanteenID": "202",
        "DateOfLunch": "2019-09-24T01:06:10.438Z",
        "Dessert": null,
        "KcalForMain": null,
        "MainDish": "XYZ",
        "MenuID": "302",
        "Price": "98765432.98",
        "Sides": null,
        "Soup": null,
        "veggie": null
    }
]
'''
