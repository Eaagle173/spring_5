package web.service;

import web.Car;
import web.dao.CarDao;
import web.dao.CarDaoImpl;

import java.util.List;

public class CarServiceImpl implements CarService {
    CarDao carDao = new CarDaoImpl();

    @Override
    public List<Car> count(Integer count) {
        return carDao.count(count);
    }
}
