package model;

public class Addres {

    private String firstName;
    private String lastName;
    private String company;
    private String address;
    private String zip;
    private String city;
    private String homePhone;
    private String country;
    private String state ;
    private String addressTitle;

    public Addres(String firstName, String lastName, String company, String address, String zip, String city, String homePhone, String country, String state,String addressTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.address = address;
        this.zip = zip;
        this.city = city;
        this.homePhone = homePhone;
        this.country = country;
        this.state = state;
        this.addressTitle = addressTitle;
    }

    public String getAddressTitle() {
        return addressTitle;
    }

    public void setAddressTitle(String addressTitle) {
        this.addressTitle = addressTitle;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }

    public String getZip() {
        return zip;
    }

    public String getCity() {
        return city;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public String getCountry() {
        return country;
    }

    public String getState() {
        return state;
    }
}
