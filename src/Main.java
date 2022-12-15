import Transport.Car;
import Transport.Bus;
import Transport.Train;



public class Main {
    public static void main(String[] args) {
        Car ladaGranda = new Car("Lada", "Granda", 90, "чёрный",
                0, "России","бензиновый");
        Car AudiA8_50LTDI = new Car("Audi", "A8  50 L TDI",
                3, "чёрного цвета", 2020,
                "Германии","электрический");
        Car BMWZ8 = new Car("BMW", "Z8", 3, "чёрного цвета",
                2018, "Германии","дизельный");
        System.out.println(ladaGranda);
       // Train train1=new Train();
        Bus bus1=new Bus("df","sd",45,"sdf",78,"dfgdf",67);
        System.out.println(bus1);

    }
}