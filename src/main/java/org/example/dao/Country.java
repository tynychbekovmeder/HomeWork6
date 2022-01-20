package org.example.dao;

public class Country {
    private int id;
    private String name;
    private String language;
    private String money;
    private String population;


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

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "\nCountry:" +
                "\n     id:" + id +
                "\n     name:" + name +
                "\n     language:" + language +
                "\n     money:" + money +
                "\n     population='" + population;
    }
}
