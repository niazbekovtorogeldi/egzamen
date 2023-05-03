package org.example.repository;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "cars")
@ToString
@NoArgsConstructor
public class Car {
    @Id
    @GeneratedValue(
            generator = "car_gen",
            strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(
            name = "car_gen",
            sequenceName = "car_seq",
            allocationSize = 1)
    private Long id;
    private String name ;
   private int price;
    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.REFRESH})
   private AftoShop aftoShops;

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
