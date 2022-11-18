package Transport;

import java.time.LocalDate;
import java.util.Calendar;

public class Car {

    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;
    private String transmission;
    private String typeOfBody;
    private String registrationNumber;
    private int numberOfSeats;
    private String carWheelSeason;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getTypeOfBody() {
        return typeOfBody;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getCarWheelSeason() {
        return carWheelSeason;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setCarWheelSeason(String carWheelSeason) {
        this.carWheelSeason = carWheelSeason;
    }

    public Car(String brand, String model, double engineVolume, String color, int year, String country,
               String transmission, String typeOfBody, String registrationNumber, int numberOfSeats, String carWheelSeason) {
        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        } else {
            this.brand = "default";
        }
        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        } else {
            this.model = "default";
        }
        if (engineVolume > 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5;
        }
        if (color != null && !color.isEmpty() && !color.isBlank()) {
            this.color = color;
        } else {
            this.color = "белый";
        }
        if (year > 0) {
            this.year = year;
        } else {
            this.year = 2000;
        }
        if (country != null && !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        } else {
            this.country = "default";
        }
        if (transmission != null && !transmission.isEmpty() && !transmission.isBlank()) {
            this.transmission = transmission;
        } else {
            this.transmission = "автоматическая";
        }
        if (typeOfBody != null && !typeOfBody.isEmpty() && !typeOfBody.isBlank()) {
            this.typeOfBody = typeOfBody;
        } else {
            this.typeOfBody = "не указано";
        }
        if (registrationNumber != null && !registrationNumber.isEmpty() && !registrationNumber.isBlank() && registrationNumber.length() == 9) {
            this.registrationNumber = registrationNumber;
        } else {
            this.registrationNumber = "ВВедите номер в формате х000хх000";
        }
        if (numberOfSeats <= 0) {
            this.numberOfSeats = 4;
        } else {
            this.numberOfSeats = numberOfSeats;
        }
        if (carWheelSeason != null && !carWheelSeason.isEmpty() && !carWheelSeason.isBlank()) {
            this.carWheelSeason = carWheelSeason;
        } else {
            this.carWheelSeason = "всесезонная";
        }
        }
    @Override
    public String toString() {
        return "Mарка- " + getBrand() + ". Модель- " + getModel() + ". Oбъем двигателя в литрах- " + engineVolume +
                ". Цвет кузова- " + color + ". Год производства- " + getYear() + ". Cтрана сборки- " + getCountry() +
                ". Коробка передач- " + transmission + ". Тип кузова- " + getTypeOfBody() + ". Регистрационный номер- " + registrationNumber +
                ". Количество мест- " + getNumberOfSeats() + ". Резина (зимняя/летняя)-" + carWheelSeason;
    }
    public static void changeCarWheelSeason() {
        if (LocalDate.now().getMonthValue() <= 11 || LocalDate.now().getMonthValue() <= 3) {
            System.out.println("Смени шины на зимние, если еще ездишь на летних.");
        } else {
            System.out.println("Смени шины на летние, если еще ездишь на зимних.");
        }

    }



}
