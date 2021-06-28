package domain;

public class Address {

    private String street;
    private Integer home;
    private Integer flat;
    private Integer postCode;

    public Address(String street, Integer home, Integer flat, Integer postCode) {
        this.street = street;
        this.home = home;
        this.flat = flat;
        this.postCode = postCode;
    }

    public Address(String street, Integer home, Integer postCode) {
        this.street = street;
        this.home = home;
        this.postCode = postCode;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHome(Integer home) {
        this.home = home;
    }

    public void setFlat(Integer flat) {
        this.flat = flat;
    }

    public void setPostCode(Integer postCode) {
        this.postCode = postCode;
    }

    public String getStreet() {
        return street;
    }

    public Integer getHome() {
        return home;
    }

    public Integer getFlat() {
        return flat;
    }

    public Integer getPostCode() {
        return postCode;
    }

}
