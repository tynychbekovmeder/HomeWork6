package org.example.dao;

import org.example.util.Util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class FindByIdDaoImpl implements FindByIdDao {
    @Override
    public void findById() {
        String SQL = "SELECT * FROM cities";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите по ID");
        int choose = scanner.nextInt();
        try (Connection connection = Util.connect();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(SQL)){
            System.out.println("_______________________________________________________");
            System.out.println("| id   | name  |  population  |  cities_id  | location");
            System.out.println("-------------------------------------------------------");
            while (resultSet.next()){
                if (resultSet.getInt("id")==choose){
                    System.out.printf(
                            "|     %s",resultSet.getInt("id"));
                    System.out.printf(
                            "|   %s",resultSet.getString("name"));
                    System.out.printf(
                            "|  %s",resultSet.getString("population"));
                    System.out.printf(
                            "|           %s",resultSet.getInt("cities_id"));
                    System.out.printf(
                            "|  %s",resultSet.getString("location"));
                    System.out.println();
                }
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
