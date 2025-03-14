package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    private final List<Car> cars;

    public CarDaoImpl() {
        this.cars = Arrays.asList(
                new Car("BMW", 320, 32000),
                new Car("Lada", 150, 4500),
                new Car("Opel", 180, 9300),
                new Car("Kia", 220, 12400),
                new Car("Scoda", 250, 15700)
        );
    }

    @Override
    public List<Car> count(Integer count) {
        if (count == null || count >= cars.size()) {
            return cars;
        }
        return cars.stream().limit(count).toList();
    }
}
