import java.util.Currency;
import java.util.Scanner;
    public class Car{
        String model;
        String license;
        String color;
        int year;

        public Car(String model, String license, String color, int year) {
            this.model = model;
            this.license = license;
            this.color = color;
            this.year = year;
        }
        public Car() {
            this.model = "нива";
            this.license = "002X34";
            this.color = "красный";
            this.year = 1993;
        }
        public Car(String model, int year) {
            this.model = model;
            this.license = "002X34";
            this.color = "красный";
            this.year = year;
        }

        // Геттеры и сеттеры
        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getLicense() {
            return license;
        }

        public void setLicense(String license) {
            this.license = license;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }
        
        public String toString() {
            return "Model: " + this.model + ", License: " + this.license + ", Color: " + this.color + ", Year: " + this.year;
        }
    }
    class Main{
        public static void main(String[] args){
            final int CURRENT_YEAR = 2024;
            Car carall = new Car("бмв", "07cv21", "черный", 2015);
            Car cardef = new Car();
            Car carst = new Car("порш", 2024);
            System.out.println(carall.toString());
            System.out.println(cardef.toString());
            System.out.println(carst.toString());

            System.out.println("Возраст автомобиля 1: " + (CURRENT_YEAR - carall.getYear()));
            System.out.println("Возраст автомобиля 2: " + (CURRENT_YEAR - cardef.getYear()));
            System.out.println("Возраст автомобиля 3: " + (CURRENT_YEAR - carst.getYear()));
        }

    }

