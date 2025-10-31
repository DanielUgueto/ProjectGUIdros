package com.example.projektguidros.models;

import java.time.LocalDate;

public class Modtager {

    // Felter
    private int id;
    private String name;
    private String chipId;
    private int dailyMealLimit;
    private LocalDate registeredDate;
    private String area; // fx by / distrikt hvor personen opholder sig

    // Constructor
    public Modtager(int id,
                    String name,
                    String chipId,
                    int dailyMealLimit,
                    LocalDate registeredDate,
                    String area) {
        this.id = id;
        this.name = name;
        this.chipId = chipId;
        this.dailyMealLimit = dailyMealLimit;
        this.registeredDate = registeredDate;
        this.area = area;
    }

    // Getters & setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChipId() {
        return chipId;
    }

    public void setChipId(String chipId) {
        this.chipId = chipId;
    }

    public int getDailyMealLimit() {
        return dailyMealLimit;
    }

    public void setDailyMealLimit(int dailyMealLimit) {
        this.dailyMealLimit = dailyMealLimit;
    }

    public LocalDate getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(LocalDate registeredDate) {
        this.registeredDate = registeredDate;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}

