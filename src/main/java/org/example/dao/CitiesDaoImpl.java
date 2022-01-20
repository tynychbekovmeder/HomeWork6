package org.example.dao;

import org.example.util.Util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

public class CitiesDaoImpl implements CitiesDao{
    @Override
    public List<Cities> listForCities(List<Cities> list) throws SQLException {
        String SQl = "SELECT * FROM cities";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какой город хотите выбрать?");
        int choose = scanner.nextInt();
        try(Connection connection = Util.connect();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQl)){
            while (resultSet.next()) {
                if (resultSet.getInt("id") == choose) {
                    Cities cities = new Cities();
                    cities.setId(resultSet.getInt("id"));
                    cities.setName(resultSet.getString("name"));
                    cities.setPopulation(resultSet.getString("population"));
                    cities.setCitiesId(resultSet.getInt("cities_id"));
                    cities.setLocation(resultSet.getString("location"));
                    System.out.println();
                    list.add(cities);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
