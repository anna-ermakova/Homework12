import Transport.Car;

import java.time.LocalDate;

import static Transport.Car.changeCarWheelSeason;


public class Main {

    public static Human[] human;
    public static Flower[] flowers;
    public static Car[] car;

    public static void main(String[] args) {


        human = new Human[5];
        human[0] = new Human(1988, "Максим", "Минск", "");
        human[1] = new Human(1993, "Аня", "Москва", "методист образовательных программ");
        human[2] = new Human(1992, "Катя", "Калининград", "продакт-менеджер");
        human[3] = new Human(1995, "Артем", "Москва", "директор по развитию бизнеса");
        human[4] = new Human((LocalDate.now().getYear() - 21), "Владимир", "Казань", "нигде не работаю");
        printHumans();

        System.out.println();
        flowers = new Flower[5];
        flowers[0] = new Flower("Роза обыкновеная", "", "Голландия", 35.59, 0);
        flowers[1] = new Flower("Хризантема", "", "", 15, 5);
        flowers[2] = new Flower("Пион", "", "Англия", 69.9, 1);
        flowers[3] = new Flower("Гипсофила", "", "Турция", 19.5, 10);
        printFlowers();
    }

    public static void printHumans() {
        for (int i = 0; i < human.length; i++) {
            if (human[i] != null) {
                System.out.println(human[i].toString());
            }
        }
    }

    public static void printFlowers() {
        for (int i = 0; i < flowers.length; i++) {
            if (flowers[i] != null) {
                System.out.println(flowers[i].toString());
            }
        }
        System.out.println();
        car = new Car[5];


        car[0] = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия",
                "механическая", "седан", "р123хх134", 5, "зимняя");
        car[1] = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия",
                "автоматическая", "хэтчбек", "o480ув38", 5, "летняя");
        car[2] = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия",
                "автоматическая", "родстер", "н637пв161", 2, "летняя");
        car[3] = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея",
                "автоматическая", "кроссовер", "а035мр761", 5, "зимняя");
        car[4] = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея",
                "автоматическая", "седан", "у001ук161", 5, "");


        printCars();
        changeCarWheelSeason();

        Car mazda = new Car("mazda", "Z6", 1.3, "черный", 2000, "Россия", "автомат",
                "авс", "", 5, "");
        Car.Key mazdaKey = mazda.new Key("да", "да");
        Car.Insurance mazdaInsurance = mazda.new Insurance(LocalDate.of(2023, 8, 23), 1000.5, "999999");
        mazda.setKey(mazdaKey);
        System.out.println(mazda);
    }


    public static void printCars() {
        for (int i = 0; i < car.length; i++) {
            if (car[i] != null) {
                System.out.println(car[i].toString());
            }
        }
    }


}
