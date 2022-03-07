package com.example.labAndroid_Amr_Waseem.DTO;

import javax.persistence.Column;
import javax.persistence.Id;

public class RentingAgencyDto {

    private  String Agency_name;
    private  String Email;
    private String password;
    private String Country;
    private  String City;
    private String phone;

    public RentingAgencyDto() {
    }

    public RentingAgencyDto(String agency_name, String email, String password, String country, String city, String phone) {
        Agency_name = agency_name;
        Email = email;
        this.password = password;
        Country = country;
        City = city;
        this.phone = phone;
    }

    public String getAgency_name() {
        return Agency_name;
    }

    public void setAgency_name(String agency_name) {
        Agency_name = agency_name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
