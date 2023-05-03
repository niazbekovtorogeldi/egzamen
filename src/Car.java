import java.time.LocalDate;
import java.time.Period;

public class Car {
    private String marka;
    private LocalDate jyl;
    private long baa;

    private Kuzov kuzov;

    public Car(String marka,LocalDate localDate, long baa, Kuzov kuzov) {
        this.marka = marka;
        this.jyl=localDate;
        this.baa = baa;
        this.kuzov = kuzov;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public LocalDate getLocalDate() {
        return jyl;
    }

    public void setLocalDate(LocalDate localDate) {
        this.jyl= localDate;
    }

    public long getBaa() {
        return baa;
    }

    public void setBaa(long baa) {
        this.baa = baa;
    }

    public Kuzov getKuzov() {
        return kuzov;
    }

    public void setKuzov(Kuzov kuzov) {
        this.kuzov = kuzov;
    }

    public void   jasalgan() {
      Period period=Period.between(getLocalDate(),LocalDate.now());
//        LocalDate currentDate = LocalDate.now();
//        LocalDate oneYearAgo = currentDate.minusYears(1);
        System.out.println(period.getYears());





    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", localDate=" + jyl +
                ", baa=" + baa +
                ", kuzov=" + kuzov +
                '}';
    }

    public void method(Car[]cars, String name) {

        for (Car c :cars) {
            if (c.marka.equals(name)){
                 if (c.kuzov==Kuzov.VNEDOROJNIC) {
                     System.out.println("внедорожник классындагы машина");
                 }else if (c.kuzov==Kuzov.YNIVERSAL) {
                     System.out.println("универсал классындагы машина");
                 }else if (c.kuzov==Kuzov.CROSSOVER) {
                     System.out.println("внедорожник классындагы машина");
                 }else if (c.kuzov==Kuzov.SEDAN) {
                     System.out.println("легковой классындагы машина");
                 }else if (c.kuzov==Kuzov.HEDCHBEK){
                     System.out.println("дорогая машина");
        }

//        switch (kuzov) {
//            case SEDAN -> {
//                System.out.println("легковой классындагы машина" + "УШУНЧА ЖЫЛ БОЛДУ" + determinationoYearOfManufacture());
//            }
//            case HEDCHBEK -> {
//
//
//                System.out.println("легковой классындагы машина" + "\nУШУНЧА ЖЫЛ БОЛДУ ЧЫКАНЫНА" + determinationoYearOfManufacture());
//            }
//            case CROSSOVER, VNEDOROJNIC -> {
//                System.out.println("внедорожник классындагы машина" + "\nушунча жыл болду чыканына" + determinationoYearOfManufacture());
//            }
//            case YNIVERSAL -> {
//
//                System.out.println("универсал классындагы машина" + "\nушунча болду чыкканына" + determinationoYearOfManufacture());
//

            }
        }
    }


    }

