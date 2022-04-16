package javaClasses;

public class Car {
    private String id, manufacture, model, color, regNumber;
    private int year, price, inUse;

    public Car(String id, String manufacture, String model, int year, String color, int price, String regNumber) {
        this.id = id;
        this.manufacture = manufacture;
        this.model = model;
        this.color = color;
        this.regNumber = regNumber;
        this.year = year;
        this.inUse = 2022 - year;
        this.price = price;
    }

    public String getManufacture(){
        return this.manufacture;
    }
    public String getModel(){
        return this.model;
    }
    public String getColor() {return this.color;}
    public int getYear() {return this.year;}
    public int getPrice() {return this.price;}
    public String getRegNumber() {return this.regNumber;}

    public int getInUse(){
        return this.inUse;
    }


    @Override public String toString() {
        return color +" "+ manufacture +" "+ model +" "+ year + " Registration Number: " + regNumber;
    }
}
