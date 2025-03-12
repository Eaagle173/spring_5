package web.dao;

import web.Car;

import java.util.Arrays;
import java.util.List;

public class CarDaoImpl implements CarDao {
    @Override
    public List<Car> count(Integer count) {
        List<Car> cars = Arrays.asList(
                new Car("BMW", 320, 32000),
                new Car("Lada", 150, 4500),
                new Car("Opel", 180, 9300),
                new Car("Kia", 220, 12400),
                new Car("Scoda", 250, 15700)
        );
        if (count == null || count >= cars.size()) {
            return cars;
        }
        return cars.stream().limit(count).toList();
    }
}
