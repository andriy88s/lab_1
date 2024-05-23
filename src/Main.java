public class Main {
    public static void main(String[] args) {

        int num1 = 1, num2 = 1, num3 = 1, num4 = 1, num5 = 1, num6 = 1, num7 = 1, num8 = 1, num9 = 1, num10 = 1;

        int sum = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;
        System.out.println("Дія додавання: " + sum);

        int difference = num10 - num9 - num8 - num7 - num6 - num5 - num4 - num3 - num2 - num1;
        System.out.println("Дія віднімання: " + difference);

        long product = 1L * num1 * num2 * num3 * num4 * num5 * num6 * num7 * num8 * num9 * num10;
        System.out.println("Дія множення: " + product);

        double quotient = (double) num10 / num9 / num8 / num7 / num6 / num5 / num4 / num3 / num2 / num1;
        System.out.println("Дія ділення: " + quotient);


        String word1 = "Я" ;
        String word2 = " відпочиваю " ;
        String word3 = " на " ;
        String word4 = " пляжі, " ;
        String word5 = " з дівчатами " ;
        String word6 = " і " ;
        String word7 = " слухаю " ;
        String word8 = " українську " ;
        String word9 = " музику " ;
        String word10  = "." ;

        String sentence = word1 + " " + word2 + " " + word3 + " " + word4 + " " + word5 + " " + word6 + " " + word7 + " " + word8 + " " + word9 + " " + word10 + " ";

        System.out.println(sentence);


        User user1 = new User(1, 19, "Oleeg", "Rambo", 72.5, 178.0);
        User user2 = new User(2, 19, "V1tal9", "Keks", 65.0, 173.0);
        User user3 = new User(3, 19, "Vasya", "High", 67.0, 182.0);
        User user4 = new User(4, 18, "Tarik", "Drr", 75.5, 169.0);
        User user5 = new User(5, 19, "Bodya", "Home", 85.0, 179.0);
        User user6 = new User(6, 18, "YURIY", "Montana", 62.0, 178.0);
        User user7 = new User(7, 19, "Andruxa ", "Chucha", 63.0, 166.0);
        User user8 = new User(8, 18, "Nazar", "Fityo", 60.0, 174.0);
        User user9 = new User(9, 18, "John", "Schulz", 80.0, 163.0);
        User user10 = new User(10, 19, "Marik", "Valylo", 78.0, 186.0);

        System.out.println("Ім'я: " + "/" + user1.name + " " + user1.surname + "/" + " " + "/" + user2.name + " " + user2.surname + "/"+ " " +"/" +  user3.name + " " + user3.surname + "/" + " " + "/" + user4.name + " " + user4.surname + "/" +  " " + "/" + user5.name + " " + user5.surname + "/" +  " " + "/" + user6.name + " " + user6.surname + "/" +  " " + "/" + user7.name + " " + user7.surname + "/" +  " " + "/" + user8.name + " " + user8.surname + "/" +" " + "/" + user9.name + " " + user9.surname + "/" +" " + "/" + user10.name + " " + user10.surname +"/");

        int totalAge = user1.age + user2.age + user3.age + user4.age+ user5.age + user6.age + user7.age + user8.age + user9.age + user10.age;
        System.out.println("totalAge: " + totalAge);

        double totalWeight = user1.weight + user2.weight + user3.weight + user4.weight + user5.weight + user6.weight + user7.weight + user8.weight + user9.weight + user10.weight;
        System.out.println("totalWeight: " + totalWeight);

        double totalHeight = user1.height + user2.height + user3.height + user4.height + user5.height + user6.height + user7.height + user8.height + user9.height + user10.height;
        System.out.println("totalHeight: " + totalHeight);

        Car car1 = new Car(200, 2.0, "Opel", "Omega", 1993, true);
        Car car2 = new Car(310, 3.4, "Chevrolet", "Corvette", 2018, false);
        Car car3 = new Car(250, 1.9, "Toyota", "Camry", 2020, true);
        Car car4 = new Car(425, 4.4, "BMW", "M5", 2019, true);
        Car car5 = new Car(540, 5.0, "Dodge", "Charger", 2017, false);
        Car car6 = new Car(600, 3.2, "BMW", "M4G82", 2021, true);
        Car car7 = new Car(250, 3.0, "Mercedes-Benz", "AMG E63", 2018, true);
        Car car8 = new Car(120, 2.7, "Audi", "S6", 2020, true);
        Car car9 = new Car(200, 3.2, "Nissan", "350Z", 2019, false);
        Car car10 = new Car(430, 5.2, "Toyota", "L300", 2022, false);

        double totalEngineVolume = car1.engineVolume + car2.engineVolume + car3.engineVolume + car4.engineVolume + car5.engineVolume + car6.engineVolume + car7.engineVolume + car8.engineVolume + car9.engineVolume + car10.engineVolume;
        System.out.println("Значення їх об'ємів " + totalEngineVolume + " Літрів");

        int totalHorsepower = car1.horsepower + car2.horsepower + car3.horsepower + car4.horsepower + car5.horsepower + car6.horsepower + car7.horsepower + car8.horsepower + car9.horsepower + car10.horsepower;
        System.out.println("Значення їх потужностей: " + totalHorsepower + " Кінських Сил");


        int number = 412;
        int reversedNumber = reverseNumber(number);
        System.out.println("Оригінальне число: " + number);
        System.out.println("Реверснуте число: " + reversedNumber);
    }

    public static int reverseNumber(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return reversedNumber;
    }
}

class User {
    int id;
    int age;

    String name;
    String surname;
    double weight;
    double height;

    public User(int id, int age, String name, String surname, double weight, double height) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.weight = weight;
        this.height = height;
    }
}

class Car {
    int horsepower;
    double engineVolume;
    String make;
    String model;
    int year;
    boolean isAutomatic;

    public Car(int horsepower, double engineVolume, String make, String model, int year, boolean isAutomatic) {
        this.horsepower = horsepower;
        this.engineVolume = engineVolume;
        this.make = make;
        this.model = model;
        this.year = year;
        this.isAutomatic = isAutomatic;
    }
}