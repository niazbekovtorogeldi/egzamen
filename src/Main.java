import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Car car = new Car("Mers", LocalDate.of(2000, 8, 6), 49999, Kuzov.SEDAN);
        Car car1 = new Car("bmw", LocalDate.of(1990, 4, 1), 500000, Kuzov.HEDCHBEK);
        Car car2 = new Car("volvo", LocalDate.of(1995, 5, 15), 120000, Kuzov.CROSSOVER);
        Car car3 = new Car("kia", LocalDate.of(1990, 4, 4), 25000, Kuzov.VNEDOROJNIC);
        Car car4 = new Car("toyota", LocalDate.of(2022, 5, 2), 560000, Kuzov.YNIVERSAL);

        Car[] cars = {car, car1, car2, car3, car4};

        Scanner scanner = new Scanner(System.in);
//        String b = scanner.nextLine();
        car.method(cars, scanner.nextLine());
        car.jasalgan();





        }
    }
