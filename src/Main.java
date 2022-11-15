public class Main {
    public static Human[] human;
    public static void main(String[] args) {

        human = new Human[4];
        human[0] = new Human(1988, "Максим", "Минск", "бренд-менеджер");
        human[1] = new Human(1993, "Аня", "Москва", "методист образовательных программ");
        human[2] = new Human(1992, "Катя", "Калининград", "продакт-менеджер");
        human[3] = new Human(1995, "Артем", "Москва", "директор по развитию бизнеса");
        printHumans();
    }
    public static void printHumans() {
        for (int i = 0; i < human.length; i++) {
            if (human[i] != null) {
                System.out.println(human[i].toString());
            }
        }
    }
}