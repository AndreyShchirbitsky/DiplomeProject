package model;

public class Addres {
    public static final String ADDRESS_PAGE_URL = "http://prestashop.qatestlab.com.ua/ru/address";
    public static final String ADDRESSES_PAGE_URL = "http://prestashop.qatestlab.com.ua/ru/addresses";

    private final String firstName;
    private final String lastName;
    private final String company;
    private final String address;
    private final String zip;
    private final String city;
    private final String homePhone;
    private final String country;
    private final String state ;
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
