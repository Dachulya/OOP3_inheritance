import Transport.Car;
import Transport.Train;


public class Main {
    public static void main(String[] args) {
        Car ladaGranda = new Car("Lada", "Granda", 90, "чёрный",
                0, "России");
        Car AudiA8_50LTDI = new Car("Audi", "A8  50 L TDI",
                3, "чёрного цвета", 2020,
                "Германии");
        Car BMWZ8 = new Car("BMW", "Z8", 3, "чёрного цвета",
                2018, "Германии");
        System.out.println(ladaGranda);
       // Train train1=new Train();
    }
}