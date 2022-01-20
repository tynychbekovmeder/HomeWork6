package org.example.dao;

import java.sql.SQLException;
import java.util.List;

public interface CitiesDao {
    List<Cities> listForCities(List<Cities> list) throws SQLException;
}
