package Transport;

import java.time.LocalDate;

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
    private Key key;


    public class Key {
        private final String remoteEngineStart; // Удаленный запуск двигателя
        private final String keylessAccess;// Бесключевой доступ

        public Key(String remoteEngineStart, String keylessAccess) {
            if (remoteEngineStart != null && !remoteEngineStart.isEmpty() && !remoteEngineStart.isBlank()) {
                this.remoteEngineStart = remoteEngineStart;
            } else {
                this.remoteEngineStart = "Необходимо указать ДА/НЕТ или НЕИЗВЕСТНО";
            }
            if (keylessAccess != null && !keylessAccess.isEmpty() && !keylessAccess.isBlank()) {
                this.keylessAccess = keylessAccess;
            } else {
                this.keylessAccess = "Необходимо указать ДА/НЕТ или НЕИЗВЕСТНО";
            }
        }


        public String getRemoteEngineStart() {
            return remoteEngineStart;
        }

        public String getKeylessAccess() {
            return keylessAccess;
        }

        public String isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public String isKeylessAccess() {
            return keylessAccess;
        }

        @Override
        public String toString() {
            return "Key{" +
                    "remoteEngineStart='" + remoteEngineStart + '\'' +
                    ", keylessAccess='" + keylessAccess + '\'' +
                    '}';
        }

    }


    public class Insurance {
        private final LocalDate validityPeriod;
        private final double cost;
        private final String number;


        public Insurance(LocalDate validityPeriod, double cost, String number) {
            if (validityPeriod != null) {
                this.validityPeriod = validityPeriod;
            } else {
                this.validityPeriod = LocalDate.parse("Укажите срок действия страховки");
            }
            if (cost <= 0) {
                this.cost = 99999999;
            } else {
                this.cost = cost * Math.pow(cost, 2) / Math.pow(cost, 2);// для корректной печати цены с копейками
            }
            if (number != null && !number.isEmpty() && !number.isBlank() && number.length() == 9) {// проверка корректоности номера страховки
                this.number = number;
            } else {
                this.number = "Номер страховки некорректный!";
            }
        }

        @Override
        public String toString() {
            return "Insurance{" +
                    "validityPeriod=" + validityPeriod +
                    ", cost=" + cost +
                    ", number='" + number + '\'' +
                    '}';
        }

        public LocalDate getValidityPeriod() {
            return validityPeriod;
        }

        public LocalDate checkValidityPeriod(LocalDate validityPeriod) {
            if (LocalDate.now().isAfter(validityPeriod)) {
                System.out.println("Страховка просрочена. Оформите новую");
                return LocalDate.now();
            } else {
                return validityPeriod;
            }
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

    }


    public Car(String brand, String model, double engineVolume, String color, int year, String country,
               String transmission, String typeOfBody, String registrationNumber, int numberOfSeats, String
                       carWheelSeason) {
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

    public void setKey(Key key) {
        this.key =key;
    }
}
