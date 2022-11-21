import java.time.LocalDate;

public class Human {

    private int yearOfBirth;
    private String name;
    private String town;
    private String jobTitle;

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getTown() {
        return town;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public Human(int yearOfBirth, String name, String town, String jobTitle) {
        if (yearOfBirth < 0) {
            this.yearOfBirth = Math.abs(yearOfBirth);
        } else {
            this.yearOfBirth = yearOfBirth;
        }
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        } else {
            this.name = "Информация не указана";
        }
        if (town != null && !town.isEmpty() && !town.isBlank()) {
            this.town = town;
        } else {
            this.town = "Информация не указана";
        }
        if (jobTitle != null && !jobTitle.isEmpty() && !jobTitle.isBlank()) {
            this.jobTitle = jobTitle;
        }else {
        this.jobTitle = "Информация не указана";}


    }

    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + getTown() + ". Я родился в " + getYearOfBirth() + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!";
    }


}
