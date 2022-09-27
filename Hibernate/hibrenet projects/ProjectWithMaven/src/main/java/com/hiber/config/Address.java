package com.hiber.config;
// use  of basic annotation

import javax.persistence.*;
import java.util.Arrays;
import java.util.Date;

@Entity
@Table(name = "student_address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private int adressId;
    @Column(length = 50, name = "STREET")
    private String street;
    @Column(length = 100, name = "CITY")
    private String city;
    @Column(name = "is_Open")
    private boolean isOpen;
    @Transient
    private double x;
    @Column(name = "Add_date")
    @Temporal(TemporalType.DATE)
    private Date addedDate;
    @Lob
    private byte[] image;

    public Address() {
    }

    public Address(int adressId, String street, String city, boolean isOpen, double x, Date addedDate, byte[] image) {
        this.adressId = adressId;
        this.street = street;
        this.city = city;
        this.isOpen = isOpen;
        this.x = x;
        this.addedDate = addedDate;
        this.image = image;
    }

    @Override
    public String toString() {
        return "Address{" +
                "adressId=" + adressId +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", isOpen=" + isOpen +
                ", x=" + x +
                ", addedDate=" + addedDate +
                ", image=" + Arrays.toString(image) +
                '}';
    }

    public int getAdressId() {
        return adressId;
    }

    public void setAdressId(int adressId) {
        this.adressId = adressId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
