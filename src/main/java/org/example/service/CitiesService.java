package org.example.service;

import org.example.dao.Cities;

import java.sql.SQLException;
import java.util.List;

public interface CitiesService {
    List<Cities> listForCities(List<Cities> list) throws SQLException;

}
