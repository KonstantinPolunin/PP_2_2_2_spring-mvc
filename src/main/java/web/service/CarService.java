package web.service;

import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarService {



    public static List<Car> getCountCars(List<Car> carList, Integer size) {
        return carList.stream()
                .limit(size)
                .collect(Collectors.toList());
    }

}

