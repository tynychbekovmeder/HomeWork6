package org.example.dao;

import java.sql.SQLException;
import java.util.List;

public interface CountryDao {
    List<Country> listForCountry(List<Country> list) throws SQLException;
}
