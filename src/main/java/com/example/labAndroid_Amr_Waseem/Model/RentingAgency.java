package com.example.labAndroid_Amr_Waseem.Model;

import javax.persistence.*;

@Entity
@Table(name ="RentingAgency")
public class RentingAgency {
    @Id
    @GeneratedValue
    @Column(name="id")
    private Long id;
    @Column(name = "AgencyName")
    private  String Agency_name;
    @Column(name = "Email")
    private  String Email;
    @Column(name = "password")
    private String password;
    @Column(name = "Country")
    private String Country;
    @Column(name = "City")
    private  String City;
    @Column(name = "phone")
    private String phone;

    public RentingAgency() {
    }

    public RentingAgency(String agency_name, String email, String password, String country, String city, String phone) {
        this.Agency_name = agency_name;
        this.Email = email;
        this.password = password;
        this. Country = country;
        this.City = city;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public String getAgency_name() {
        return Agency_name;
    }

    public void setAgency_name(String agency_name) {
        this.Agency_name = agency_name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
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
        this.Country = country;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        this.City = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
