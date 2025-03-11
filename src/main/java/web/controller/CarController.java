package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping(value = "/cars")
public class CarController {

    @GetMapping
    public String cars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        CarService carService = new CarServiceImpl();
        List<Car> cars = Arrays.asList(
                new Car("BMW", 320, 32000),
                new Car("Lada", 150, 4500),
                new Car("Opel", 180, 9300),
                new Car("Kia", 220, 12400),
                new Car("Scoda", 250, 15700)
        );
        if (count == null) {
            model.addAttribute("cars", cars);
        } else {
            cars = carService.count(cars, count);
            model.addAttribute("cars", cars);
        }
        return "cars";
    }
}
