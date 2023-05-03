package org.example.repository;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "aftoshop")
@NoArgsConstructor
public class AftoShop {
    @Id
    @GeneratedValue(
            generator = "AftoShop_gen",
            strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(
            name = "AftoShop_gen",
            sequenceName = "AftoShop_seq",
            allocationSize = 1)
    private Long id ;
    private String name ;
    private String adress;


@OneToMany(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
    private List<Car> cars;


    public AftoShop(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "AftoShop{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
