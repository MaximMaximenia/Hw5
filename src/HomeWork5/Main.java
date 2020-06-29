package HomeWork5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PassengerTransport n = new PassengerTransport();
        n.setBrand("Suzuki");
        n.setMaxSpeed(100);
        n.setPower(54);
        n.setFuelConsumption(222);
        n.info();
        n.kilMaxSpeed(12);

    }
}