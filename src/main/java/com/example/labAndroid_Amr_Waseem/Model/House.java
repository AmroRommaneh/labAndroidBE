package com.example.labAndroid_Amr_Waseem.Model;

import javax.persistence.*;

@Entity
@Table(name = "house")
public class House {

    @GeneratedValue
    @Id
    @Column(name = "Id")
    private Long id;
    @Column(name = "Age")
    private int Age ;
    @Column(name = "City")
    private String City ;
    @Column(name = "size")
    private double size ;
    @Column(name = "numberOfRooms")
    private int numberOfRooms ;
    @Column(name = "price")
    private double price ;
    @Column(name = "parking")
    private boolean parking ;
    @Column(name = "status")
    private String status;
    @Column(name = "balcony")
    private boolean balcony;
    @Column(name = "garden")
    private boolean garden ;

    public House(int age, String city, double size, int numberOfRooms, double price, boolean parking, String status, boolean balcony, boolean garden) {
        Age = age;
        City = city;
        this.size = size;
        this.numberOfRooms = numberOfRooms;
        this.price = price;
        this.parking = parking;
        this.status = status;
        this.balcony = balcony;
        this.garden = garden;
    }

    public House() {

    }

    public Long getId() {
        return id;
    }



    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isParking() {
        return parking;
    }

    public void setParking(boolean parking) {
        this.parking = parking;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }

    public boolean isGarden() {
        return garden;
    }

    public void setGarden(boolean garden) {
        this.garden = garden;
    }
}
