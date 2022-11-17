public class Flower {

    private String flowerColor;
    private String country;
    private double cost;
    int lifeSpan;

    String nameFlower;
    int count;


    public String getNameFlower() {
        return nameFlower;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public double getCost() {
        return cost;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = flowerColor;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Flower(String nameFlower, String flowerColor, String country, double cost, int lifeSpan) {
        if (nameFlower != null && !nameFlower.isEmpty()) {
            this.nameFlower = nameFlower;
        } else {
            this.nameFlower = "Информация не указана";
        }

        if (flowerColor != null && !flowerColor.isEmpty()) {
            this.flowerColor = flowerColor;
        } else {
            this.flowerColor = "белый";
        }
        if (country != null && !country.isEmpty()) {
            this.country = country;
        } else {
            this.country = "Россия";
        }
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost * Math.pow(cost, 2) / Math.pow(cost, 2);
        }
        if (lifeSpan % 1 == 0 && lifeSpan > 0) { // зачем по заданию проверять, что целое? Если оно int
            this.lifeSpan = lifeSpan;
        } else {
            this.lifeSpan = 3;
        }

    }

    @Override
    public String toString() {
        return "Цветок " + getNameFlower() + ". Цвет " + getFlowerColor() + ". Страна происхождения " + getCountry() + ". Цена " + getCost() + ". Дни стояния " + lifeSpan;
    }


}