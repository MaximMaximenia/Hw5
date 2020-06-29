package HomeWork5;

import java.util.Scanner;

public class PassengerTransport extends GroundTranssport {
    int passagesValue;
    String typeBody;
    double time;
    boolean input = true;
    double fuelOverTime;

    public void setPassagesValue(int passagesValue) {
        this.passagesValue = passagesValue;
    }

    public void setTypeBody(String typeBody) {
        this.typeBody = typeBody;
    }



    private double FuelOverTime(double  distanceWithMaxSpeed) {
        fuelOverTime = fuelConsumption * (distanceWithMaxSpeed / 100);
return fuelOverTime;

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



    public void kilMaxSpeed(double time) {
        double distanceWithMaxSpeed;
                distanceWithMaxSpeed = time * maxSpeed;
                System.out.println("За " + time + " часов" + " автомобиль марки " + brand + " двигаясь с максимальной скоростью " + maxSpeed +
                        " км/ч проедет " + distanceWithMaxSpeed + " км. и израсходует " + FuelOverTime(distanceWithMaxSpeed) + " литров топлива");

            }
        }


