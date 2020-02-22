package week_7_object_containers;

class Address {

    private String country;
    private String city;
    private String address;


    public Address(String country, String city, String address) {
        this.country = (country != null) ? country : "Missing_country";
        this.city = (city != null) ? city : "Missing_city";
        this.address = (address != null) ? address : "Missing_address";
    }


    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }
}
