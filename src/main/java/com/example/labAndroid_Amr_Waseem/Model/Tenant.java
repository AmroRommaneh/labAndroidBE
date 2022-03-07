package com.example.labAndroid_Amr_Waseem.Model;

import javax.persistence.*;

@Entity
@Table(name = "Tenant")
public class Tenant {
    @Id
    @GeneratedValue
    @Column(name="id")
    private Long id;
    @Column(name = "firstName")
    private  String first_name;
    @Column(name = "SecondName")
    private  String second_name;
    @Column(name = "Gender")
    private String Gender;
    @Column(name = "email")
    private  String email;
    @Column(name = "password")
    private String password;
    @Column(name = "Nationality")
    private String Nationality;
    @Column(name = "GMS")
    private double GMS;
    @Column(name = "Occupation")
    private String Occupation;
    @Column(name = "familySize")
    private int familySize;
    @Column(name = "CRC")
    private String CRC;
    @Column(name = "City")
    private  String City;
    @Column(name = "Phone")
    private String phone;

    public Tenant(String first_name, String second_name, String gender, String email, String password, String nationality, double GMS, String occupation, int familySize, String CRC, String city, String phone) {
        this.first_name = first_name;
        this.second_name = second_name;
        this.Gender = gender;
        this.email = email;
        this.password = password;
        this.Nationality = nationality;
        this.GMS = GMS;
        this.Occupation = occupation;
        this.familySize = familySize;
        this.CRC = CRC;
        this.City = city;
        this.phone = phone;
    }

    public Tenant() {
    }

    public Long getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        this.Gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String nationality) {
        this.Nationality = nationality;
    }

    public double getGMS() {
        return GMS;
    }

    public void setGMS(double GMS) {
        this.GMS = GMS;
    }

    public String getOccupation() {
        return Occupation;
    }

    public void setOccupation(String occupation) {
        this.Occupation = occupation;
    }

    public int getFamilySize() {
        return familySize;
    }

    public void setFamilySize(int familySize) {
        this.familySize = familySize;
    }

    public String getCRC() {
        return CRC;
    }

    public void setCRC(String CRC) {
        this.CRC = CRC;
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
