package org.example;

import org.example.repository.AftoShop;
import org.example.repository.Car;
import repository.impl.AftoShopImpl;
import repository.impl.CarRepositoryImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        AftoShopImpl aftoShop = new AftoShopImpl();
//        System.out.println(aftoShop.saveAftoShop(new AftoShop("chek", "ahunbaev")));
//        System.out.println(aftoShop.saveAftoShop(new AftoShop("sto", "chuy")));
        System.out.println(aftoShop.getalldataviaid(1L));
//        System.out.println(aftoShop.getAllAftoShop());
//        System.out.println(aftoShop.updateAftoShop(1L, new AftoShop("moment", "archa-beshic")));
//        aftoShop.deleteAftoShopById(1L);
        CarRepositoryImpl carRepository = new CarRepositoryImpl();
//        System.out.println(carRepository.saveCar(1L, new Car("BMW", 122222)));
//        System.out.println(carRepository.saveCar(2L, new Car("MERS", 123344)));
//        System.out.println(carRepository.saveCar(1L, new Car("VOLVO", 444444)));
    }
}
