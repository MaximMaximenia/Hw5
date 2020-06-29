package HomeWork5;

import java.util.Scanner;

public class PassengerTransport extends GroundTranssport {
    int passagesValue;
    String typeBody;

    public void setPassagesValue(int passagesValue) {
        this.passagesValue = passagesValue;
    }

    public void setTypeBody(String typeBody) {
        this.typeBody = typeBody;
    }


    void info() {
        System.out.println("Информация об Т/C:");
        System.out.println();
        System.out.println("Мощность: " + power + " л/с.");
        System.out.println("Масса: " + mass + " кг.");
        System.out.println("Максимальная скорость :" + maxSpeed + " км/ч.");
        System.out.println("Марка: " + brand + ".");
        System.out.println("Количество колес: " + amountWheels);
        System.out.println("Расход топлива: " + fuelConsumption + " л/100км");
        System.out.println("Количество вмещаемых пассажиров: " + passagesValue + " человек");
        System.out.println("Тип кузова: " + typeBody);
        System.out.println("Мощность в кВ: " + getKvValue());
    }

    private double FuelOverTime(double distanceWithMaxSpeed) {
       double fuelOverTime = fuelConsumption * (distanceWithMaxSpeed / 100);
        return fuelOverTime;
    }

    public void kilMaxSpeed(double time) {
        double distanceWithMaxSpeed=time*maxSpeed;
        System.out.println("За " + time + " часов" + " автомобиль марки " + brand + " двигаясь с максимальной скоростью " + maxSpeed +
                " км/ч проедет " + distanceWithMaxSpeed + " км. и израсходует " + FuelOverTime(distanceWithMaxSpeed) + " литров топлива");

    }
}



