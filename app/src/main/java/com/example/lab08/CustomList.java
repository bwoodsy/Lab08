package com.example.lab08;

import java.util.ArrayList;
import java.util.List;

public class CustomList {
    private List<City> cities;

    public CustomList() {
        this.cities = new ArrayList<>();
    }

    public void addCity(City city) {
        cities.add(city);
    }

    // Will be implemented later using TDD (leave blank for now)
    public boolean hasCity(City city) { return (cities.contains(city));}

    // delete city method
    public void deleteCity(City city) {
        cities.remove(city);
    }

    // count cities method
    public int countCities() {
        return cities.size();
    }
}
