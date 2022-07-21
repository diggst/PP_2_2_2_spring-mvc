package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String printCarTable(@RequestParam(value = "count", defaultValue = "5") int stringCount, Model model){

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Gaz", "21", 1312));
        cars.add(new Car("Porshe", "718", 5431));
        cars.add(new Car("Huyndai", "Solaris", 4123));
        cars.add(new Car("Lada", "Largus", 3423));
        cars.add(new Car("Toyota", "Camry", 3489));
        model.addAttribute("list", cars.stream().limit(stringCount).collect(Collectors.toList()));

        return "car_table";
    }
}
