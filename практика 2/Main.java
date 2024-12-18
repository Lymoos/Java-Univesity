class Main{

    public static void main(String[] args){
        final int CURRENT_YEAR = 2024;
        Car carall = new Car("бмв", "07cv21", "черный", 2015);
        Car cardef = new Car();
        Car carst = new Car("порш", 2024);
        System.out.println(carall);
        System.out.println(cardef);
        System.out.println(carst.toString());
        System.out.println("Возраст автомобиля 1: " + carall.whatYear(CURRENT_YEAR));
        System.out.println("Возраст автомобиля 2: " + cardef.whatYear(CURRENT_YEAR));
        System.out.println("Возраст автомобиля 3: " + carst.whatYear(CURRENT_YEAR));

    }
}