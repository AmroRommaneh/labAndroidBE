package com.example.labAndroid_Amr_Waseem.DTO;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class HouseDto {

        private int Age ;
        private String City ;
        private double size ;
        private int numberOfRooms ;
        private double price ;
        private boolean parking ;


        private String status;

        private boolean balcony;

        private boolean garden ;

        public HouseDto(int age, String city, double size, int numberOfRooms, double price, boolean parking, String status, boolean balcony, boolean garden) {
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

        public HouseDto() {

        }

        public int getAge() {
            return Age;
        }

        public void setAge(int age) {
            this.Age = age;
        }

        public String getCity() {
            return City;
        }

        public void setCity(String city) {
            this.City = city;
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
