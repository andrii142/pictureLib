package com.main;

import java.util.Date;

public class User {
    private long id;
    private String city;
    Date dateCreated;
    int price;

    public User(long id, int price, Date dateCreated, String city) {
        this.id = id;
        this.price = price;
        this.dateCreated = dateCreated;
        this.city = city;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", dateCreated=" + dateCreated +
                ", price=" + price +
                '}';
    }

    public long getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public String getCity() {
        return city;
    }
}
