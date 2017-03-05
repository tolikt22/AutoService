package terela.com.dao;// Created by tolik on 28.02.2017.

import terela.com.model.Car;

import java.sql.SQLException;

public interface CarDAO {
    void addCar(Car car) throws SQLException;

    void updateCar(Car car) throws SQLException;

    Car getCarByID(Long car_id) throws SQLException;

    void deleteCar(Long car_id) throws SQLException;

}

