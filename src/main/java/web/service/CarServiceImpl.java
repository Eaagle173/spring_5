package web.service;

import web.Car;

import java.util.List;

public class CarServiceImpl implements CarService {
    @Override
    public List<Car> count(List list, Integer count) {
        return list.stream().limit(count).toList();
    }
}
