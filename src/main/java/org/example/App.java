package org.example;

import org.example.dao.*;
import org.example.service.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws SQLException {
        CitiesService citiesService = new CitiesServiceImpl();
        CountryService countryService = new CountryServiceImpl();
        FindByIdService findByIdService = new FindByIdServiceImpl();

        List<Country> listForCountry = new ArrayList<>();
        List<Cities> listForCities = new ArrayList<>();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("===================== Commands ====================");
            System.out.println("Нажмите 1 чтобы получить информацию о городах");
            System.out.println("Нажмите 2 чтобы получить информацию о странах");
            System.out.println("Нажмите 3 чтобы получчить город по ID");
            int choose = scanner.nextInt();
            if (choose == 1) {
                System.out.println(citiesService.listForCities(listForCities));
            } else if (choose == 2) {
                System.out.println(countryService.listForCountry(listForCountry));
            } else if (choose == 3) {
                findByIdService.findById();
            }
        }
    }
}
