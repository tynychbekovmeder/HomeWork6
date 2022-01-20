package org.example.dao;

import org.example.util.Util;

import java.sql.*;
import java.util.List;
import java.util.Scanner;

public class CountryDaoImpl implements CountryDao {

    @Override
    public  List listForCountry(List<Country> list) throws SQLException {
        String SQL = "SELECT * FROM country";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какой страну хотите выбрать?");
        int choose = scanner.nextInt();

        try(Connection connection = Util.connect();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQL)){
                while (resultSet.next()){
                    if (resultSet.getInt("id") == choose) {
                        Country country = new Country();
                        country.setId(resultSet.getInt("id"));
                        country.setName(resultSet.getString("name"));
                        country.setLanguage(resultSet.getString("language"));
                        country.setMoney(resultSet.getString("money"));
                        country.setPopulation(resultSet.getString("population"));
                        System.out.println();
                        list.add(country);
                    }
                }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
