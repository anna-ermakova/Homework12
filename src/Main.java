import java.time.LocalDate;

public class Main {
    public static Human[] human;
    public static Flower[] flowers;
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
        flowers[0]= new Flower("Роза обыкновеная", "", "Голландия", 35.59, 0 );
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



    }
}