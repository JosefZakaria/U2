//Josef Zakaria
//aq1637
//SYS

package partyModel;

public class Address {
   /* Declare instance variables for street, city, zip code as String-objects
      and country by using the enum Countries
    */
 private String street;
 private String city;
 private Countries country;
 private String zip;

  /* Write a default constructor (with no parameters) that gives default values for instance variables.
     Set default values for instance variables by calling the other constructor
     below using the this reserved word and:
     - Alternative 1: with arguments that are default values
       of your choice that will inform a user that this value isn't really set.
     - Alternative 2: Use null for all arguments and call the constructor below and handle that there.
   */
    public Address () {
        this("Unknown Street", "Unknown City", "00000", Countries.Unknown);
    }

  /* Write a constructor with parameters for all instance variables
     given above. Set instance variables to values from parameters.

     Check that the values for the parameters street, zipCode and city
     isn't empty strings or null before assigning the values to the
     corresponding instance variables.

     If any value is empty or null assign a default value of your choice
     that will inform a user that this value isn't really set.

     If the parameter country is null set this to Countries.Unknown
   */
    public Address (String street, String city, String zipCode, Countries country) {
        this.street = (street == null || street.isEmpty()) ? "Unknown Street" : street;
        this.city = (city == null || city.isEmpty()) ? "Unknown City" : city;
        this.zip = (zipCode == null || zipCode.isEmpty()) ? "Unknown ZipCode" : zipCode;
        this.country = (country == null) ? Countries.Unknown : country;
    }

  /* Implement get- and set-methods for all instance variables.
     Remember to check parameters in set-methods with the same
     rules as in the constructor above.
   */
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = (street == null || street.isEmpty()) ? "Unknown Street" : street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = (city == null || city.isEmpty()) ? "Unknown City" : city;
    }

    public String getZipCode() {
        return zip;
    }

    public void setZipCode(String zipCode) {
        this.zip = (zipCode == null || zipCode.isEmpty()) ? "Unknown ZipCode" : zipCode;
    }

    public Countries getCountry() {
        return country;
    }

    public void setCountry(Countries country) {
        this.country = (country == null) ? Countries.Unknown : country;
    }

    @Override
    public String toString() {
        return "Address [Street = " + street + ", City = " + city + " Zipcode = " + zip + ", Country = " + country + "]";
    }
  /* Write a toString method to return a String-object made of the address details,
     formatted as one line (this will be shown in the window under "Guest Register" ).
   */

}
