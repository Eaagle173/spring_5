package web.dao;

import web.Car;

import java.util.List;

public class CarDaoImpl implements CarDao {
    @Override
    public List<Car> count(List list, Integer count) {
        return list.stream().limit(count).toList();
    }
}
