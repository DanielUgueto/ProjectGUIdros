package com.example.projektguidros.models;

public class Boks {

    // Felter
    private String boxId;
    private String locationDescription; // fx "Ved siden af indgangen, Istedgade 45"
    private double gpsLat;
    private double gpsLng;
    private boolean active; // kan boksen bruges lige nu?
    private String restaurantCvr; // reference til hvilken restaurant den hører til
    private int capacity; // antal måltider der kan ligge i boksen

    // Constructor
    public Boks(String boxId,
               String locationDescription,
               double gpsLat,
               double gpsLng,
               boolean active,
               String restaurantCvr,
               int capacity) {
        this.boxId = boxId;
        this.locationDescription = locationDescription;
        this.gpsLat = gpsLat;
        this.gpsLng = gpsLng;
        this.active = active;
        this.restaurantCvr = restaurantCvr;
        this.capacity = capacity;
    }

    // Getters & setters
    public String getBoxId() {
        return boxId;
    }

    public void setBoxId(String boxId) {
        this.boxId = boxId;
    }

    public String getLocationDescription() {
        return locationDescription;
    }

    public void setLocationDescription(String locationDescription) {
        this.locationDescription = locationDescription;
    }

    public double getGpsLat() {
        return gpsLat;
    }

    public void setGpsLat(double gpsLat) {
        this.gpsLat = gpsLat;
    }

    public double getGpsLng() {
        return gpsLng;
    }

    public void setGpsLng(double gpsLng) {
        this.gpsLng = gpsLng;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getRestaurantCvr() {
        return restaurantCvr;
    }

    public void setRestaurantCvr(String restaurantCvr) {
        this.restaurantCvr = restaurantCvr;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
