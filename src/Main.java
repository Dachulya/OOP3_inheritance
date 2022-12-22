import Transport.Car;
import Transport.Bus;
import Transport.Train;


//
public class Main {
    public static void main(String[] args) {
        Car ladaGranda = new Car("Lada", "Granda", 90, "чёрный",
                0, "России","бензиновый",56.5f);
        Car AudiA8_50LTDI = new Car("Audi", "A8  50 L TDI",
                3, "чёрного цвета", 2020,
                "Германии","электрический",78.9f);
        Car BMWZ8 = new Car("BMW", "Z8", 3, "чёрного цвета",
                2018, "Германии","дизельный",45.6f);
        System.out.println(ladaGranda);
       // Train train1=new Train();
        Bus bus1=new Bus("df","sd",45,"sdf",78,"dfgdf",67,"gh",67);
        System.out.println(bus1);
        Train lastochka=new Train("Ласточка","B-901",301,"",
                2011,"Россия",3500,0,
                "Беллорусский вокзал","Минск-пассажирский",11,
                "дизель",45.8f);
        Train leningrad=new Train("Ленинград","D-125",270,"",
                2019,"Россия",1700,0,
                "Ленинградский вокзал","Лнинград-пассажирский",8,
                "дзель",85.1f);
        System.out.println(lastochka);
        System.out.println(leningrad);

    }
}