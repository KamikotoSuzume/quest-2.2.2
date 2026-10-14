package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarServiceImp;


@Controller
public class CarsController {

    private CarServiceImp carServiceImp;

    @Autowired
    public CarsController(CarServiceImp carServiceImp) {
        this.carServiceImp = carServiceImp;
    }

    @GetMapping(value = "/cars")
    public String showCars(@RequestParam(defaultValue = "5") int count,
                           ModelMap model) {
        model.addAttribute("cars", carServiceImp.getCarsByCount(count));
        return "cars";
    }
}
