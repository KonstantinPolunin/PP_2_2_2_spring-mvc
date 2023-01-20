package web.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.Arrays;
import java.util.List;


@Controller
public class CarController {
    private static final List<Car> carsList = Arrays.asList(
            new Car("VAZ", "o111oo", 2010),
            new Car("UAZ", "o112oo", 2010),
            new Car("LIAZ", "o113oo", 2010),
            new Car("KRAZ", "o114oo", 2010),
            new Car("KAMAZ", "o115oo", 2010));


    @GetMapping(value = "/cars")
    public String printCarTable(Model model, @RequestParam(value = "count", required = false) Integer count) {
        if (count != null) {
            model.addAttribute("carsList", CarService.getCountCars(carsList, count));
        } else {
            model.addAttribute("carsList", carsList);
        }
        return "cars";
    }

}
