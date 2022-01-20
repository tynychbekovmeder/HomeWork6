package org.example.dao;

public class Cities {
    private int id;
    private String name;
    private String population;
    private int citiesId;
    private String location;

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

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public int getCitiesId() {
        return citiesId;
    }

    public void setCitiesId(int citiesId) {
        this.citiesId = citiesId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "\nCities:" +
                "\n     id:" + id +
                "\n     name='" + name +
                "\n     population='" + population +
                "\n     citiesId=" + citiesId +
                "\n     location='" + location ;
    }
}
