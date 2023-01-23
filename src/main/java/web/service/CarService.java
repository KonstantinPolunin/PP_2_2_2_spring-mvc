package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class CarService {
    private final List<Car> carsList = Arrays.asList(
            new Car("VAZ", "o111oo", 2010),
            new Car("UAZ", "o112oo", 2010),
            new Car("LIAZ", "o113oo", 2010),
            new Car("KRAZ", "o114oo", 2010),
            new Car("KAMAZ", "o115oo", 2010));

    public List<Car> getCarsList() {
        return carsList;
    }

    public List<Car> getCountCars(List<Car> carList, Integer size) {
        return carList.stream()
                .limit(size)
                .collect(Collectors.toList());
    }


}

