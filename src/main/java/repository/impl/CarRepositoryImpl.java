package repository.impl;

import jakarta.persistence.EntityManager;
import org.example.confic.Confic;
import org.example.repository.AftoShop;
import org.example.repository.Car;
import repository.AftoShopRepository;
import repository.CarRepository;

import java.util.List;

public class CarRepositoryImpl implements CarRepository {
    private final EntityManager entityManager = Confic.getEntityManagerFactory();

    public Car saveCar(Long AftoShop_id, Car car) {
        entityManager.getTransaction().begin();

        AftoShop car1 = entityManager.find(AftoShop.class, AftoShop_id);
        car.setAftoShops(car1);
        entityManager.persist(car);
        entityManager.getTransaction().commit();

        return car;
    }

    public Car getCarById(Long id) {
        entityManager.getTransaction().begin();
        Car car = entityManager.createQuery("select c from Car  c where c.id=:id", Car.class).setParameter("id", id).getSingleResult();
        entityManager.getTransaction().commit();
        entityManager.close();
        return car;
    }

    public List<Car> getAllCar() {
        entityManager.getTransaction().begin();
        List<Car>list = entityManager.createQuery("select c from Car  c ",Car.class).getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        return list;
    }

    public String updateCar(Long id, Car car) {
        entityManager.getTransaction().begin();

        Car courseToUpdate = entityManager.find(Car.class, id);
        if (courseToUpdate == null) {

        }
        courseToUpdate.setName(car.getName());
        courseToUpdate.setPrice(car.getPrice());
        entityManager.merge(courseToUpdate);
        entityManager.getTransaction().commit();
        entityManager.close();

        return "update.....";
    }
    public void deleteCarId(Long id) {
        entityManager.getTransaction().begin();
        entityManager.remove(entityManager.find(Car.class, id));
        entityManager.getTransaction().commit();
        entityManager.close();

    }
}
