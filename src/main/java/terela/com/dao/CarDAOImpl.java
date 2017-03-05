package terela.com.dao;// Created by tolik on 28.02.2017.

import org.hibernate.Session;
import terela.com.model.Car;
import terela.com.util.HibernateUtil;

import java.sql.SQLException;

public class CarDAOImpl implements CarDAO {

    public void addCar(Car car) throws SQLException {
        Session session;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(car);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            HibernateUtil.shutDown();
        }
    }

    public void updateCar(Car car) throws SQLException {

    }

    public Car getCarByID(Long car_id) throws SQLException {
        Session session = null;
        Car car = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            car = session.get(Car.class, car_id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                HibernateUtil.shutDown();
            }
        }
        return car;
    }

    public void deleteCar(Long car_id) throws SQLException {

    }
}
