package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {

    @Test
    public void testHasCity(){
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "Alberta");
        list.addCity(calgary);

        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCity(){
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "Alberta");
        list.addCity(calgary);

        list.deleteCity(calgary);
        assertFalse(list.hasCity(calgary));
    }

    @Test
    public void testCountCities(){
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "Alberta");
        City toronto = new City("Toronto", "Ontario");

        list.addCity(calgary);
        list.addCity(toronto);

        assertEquals(2, list.countCities());
    }
}
