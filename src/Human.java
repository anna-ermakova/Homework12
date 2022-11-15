
public class Human {


    private int yearOfBirth;
    private String name;
    private String town;
    private String jobTitle;


    public Human(int yearOfBirth, String name, String town, String jobTitle) {
        if (yearOfBirth<0) {
            yearOfBirth = 0;
        }
            this.yearOfBirth = yearOfBirth;
       if (name=="" || name==null){
           name = "Информация не указана";
       }
           this.name = name;
        if (town=="" || town==null) {
            town="Информация не указана";
        }
       this.town = town;
        if (jobTitle=="" || jobTitle==null) {
            jobTitle="Информация не указана";
        }
       this.jobTitle = jobTitle;
    }


    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!";
    }


}
