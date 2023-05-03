package repository;

import org.example.repository.AftoShop;
import org.example.repository.Car;

import java.util.List;

public interface CarRepository {
    Car saveCar(Long AftoShop_id,Car car);
    Car getCarById(Long id);
    List<Car> getAllCar();
    String updateCar(Long id,Car car);
    void deleteCarId(Long id);
}
