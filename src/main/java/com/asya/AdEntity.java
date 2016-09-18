package com.asya;

import java.util.Date;

/**
 * Created by Asenka on 18.09.16.
 */
public class AdEntity {

    private long id;
    private String city;
    private String typeOfAd;
    private Date dateCreated;
    private int price;

    public AdEntity(long id, String city, String typeOfAd, Date dateCreated, int price) {
        this.id = id;
        this.city = city;
        this.typeOfAd = typeOfAd;
        this.dateCreated = dateCreated;
        this.price = price;
    }

    public AdEntity() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTypeOfAd() {
        return typeOfAd;
    }

    public void setTypeOfAd(String typeOfAd) {
        this.typeOfAd = typeOfAd;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "AdEntity{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", typeOfAd='" + typeOfAd + '\'' +
                ", dateCreated=" + dateCreated +
                ", price=" + price +
                '}';
    }
}
