package terela.com;// Created by tolik on 28.02.2017.

import terela.com.dao.CarDAO;
import terela.com.dao.CarDAOImpl;
import terela.com.model.Car;

import java.sql.SQLException;

public class Test {
    private static CarDAO carDAO = new CarDAOImpl();

    public static void main(String[] args) {
        Car carForAdd = new Car();
//        carForAdd.setModel("Quashcai");
//        carForAdd.setMake("Nissan");
//        carForAdd.setId_engine(1234);
//        carForAdd.setPrice(10422);
//        Calendar calendar = new GregorianCalendar(2010,05,15);
//        carForAdd.setDate(calendar.getTime());
        try {
//            carDAO.addCar(carForAdd);
            System.out.println(carDAO.getCarByID((long) 10));
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
