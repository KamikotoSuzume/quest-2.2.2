package web.service;

import org.springframework.stereotype.Service;
import web.car.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {
    private List<Car> cars = List.of(new Car("Aston Martin", "DB11", 2017),
            new Car("Chevrolet", "Corvette ZR-1", 1970),
            new Car("Ferrari", "F12tdf", 2015),
            new Car("Nissan", "GT-R Nismo", 2024),
            new Car("Porsche", "911 GT3", 2021));


    @Override
    public List<Car> getCarsByCount(int count) {
        List<Car> carByCount = new ArrayList<>();
        for (int i = 0; i < count && i < cars.size(); i++) {
            carByCount.add(cars.get(i));
        }
        return carByCount;
    }
}
