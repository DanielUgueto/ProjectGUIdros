package com.example.projektguidros.models;

public class Restaurant {

    // Felter
    private String name;
    private String address;
    private String cvrNumber;
    private String contactPerson;
    private String phoneNumber;
    private String email;

    // Constructor
    public Restaurant(String name,
                      String address,
                      String cvrNumber,
                      String contactPerson,
                      String phoneNumber,
                      String email) {
        this.name = name;
        this.address = address;
        this.cvrNumber = cvrNumber;
        this.contactPerson = contactPerson;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Getters & setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCvrNumber() {
        return cvrNumber;
    }

    public void setCvrNumber(String cvrNumber) {
        this.cvrNumber = cvrNumber;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
