package ThirdSet.Problem1;

import java.util.Scanner;


public class CarFactory {



    public void factoryStart() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Type Start in order to begin");
        String command = userInput.nextLine();
        while (!command.equalsIgnoreCase("start")) {
            System.out.println("Type Start in order to begin");
            command = userInput.nextLine();
        }
    }

    public void mainMenu() {
        System.out.println("The available commands are:");
        System.out.println("ADD brand price");
        System.out.println("DISPLAY_ALL");
        System.out.println("DISPLAY_UNDER price");
        System.out.println("DISPLAY_BRAND brand");
        System.out.println("EXIT");
    }


    public void factoryProcess() {
        int carNumber = 0;
        Car[] carArray = new Car[5];
        Scanner userInput = new Scanner(System.in);
        factoryStart();
        mainMenu();
        System.out.print("Type an action: ");
        String command = userInput.nextLine();
        while (!command.equalsIgnoreCase("exit")) {
            String[] commands = command.split(" ");
            switch (commands[0]) {
                case ("ADD"):
                    if (carNumber == 5) {
                        System.out.println("The factory is full");
                    }
                    Car newCar = new Car(commands[1], Integer.parseInt(commands[2]));
                    for (Car car : carArray) {
                        if (newCar.equals(car)) {
                            System.out.println("This car is already in the factory.");
                        }
                    }
                    carArray[carNumber] = newCar;
                    carNumber++;
                    break;
                case ("DISPLAY_ALL"):
                    for (Car car : carArray) {
                        if (car!=null) System.out.println(car);
                    }
                    break;
                case ("DISPLAY_UNDER"):
                    for (Car car : carArray) {
                        if(car!=null && car.getPrice()<=Integer.parseInt(commands[1])) System.out.println(car);
                    }
                    break;
                case ("DISPLAY_BRAND"):
                    for (Car car : carArray) {
                        if (car!=null && car.getBrand().equalsIgnoreCase(commands[1])) System.out.println(car);
                    }
                    break;
                default:
                    System.out.println("There is no such command");
            }
            mainMenu();
            System.out.print("Type an action: ");
            command = userInput.nextLine();
        }
        System.out.println("The factory is closed.");
    }
}



