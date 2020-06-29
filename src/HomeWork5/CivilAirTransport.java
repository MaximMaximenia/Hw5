package HomeWork5;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class CivilAirTransport extends AirTransport {
    int passengersValue;
    boolean bussinesClass;
    int passenger;

    void info() {
        System.out.println("Информация об Т/C:");
        System.out.println();
        System.out.println("Размах крыльев: " + wingSpan + " метров.");
        if (bussinesClass = true) {
            System.out.println("Имеется бизнес класс");
        } else {
            System.out.println("Бизнес класс отсутствует");
        }
        System.out.println("Минимальная длинна взлетной полосы : " + minAirStripLength + " метров");
        System.out.println("Макс количество пассажиров: " + passengersValue + " человек");
        System.out.println("Мощность в кВ: "+ getKvValue());
        System.out.println();

    }

    public void setPassengersValue(int passengersValue) {
        this.passengersValue = passengersValue;
    }

    public void setBussinesClass(boolean bussinesClass) {
        this.bussinesClass = bussinesClass;
    }

    public void passangerCheck(){
        boolean passangerWhile=true;
        while(passangerWhile) {
            Scanner s = new Scanner(System.in);

            System.out.print("ВВЕДИТЕ КОЛИЧЕСТВО ПАССАЖИРОВ ДЛЯ ПОСАДКИ: ");
            passenger = s.nextInt();
            if (passenger < 0) {
                System.out.println("НЕВЕРНОЕ ЗНАЧЕНИЕ.");
            } else {
                if (passenger > passengersValue) {
                    System.out.println("Вам понадобится самолет побольше");
                } else {
                    System.out.println("Пассажиры усажены.");

                }
                passangerWhile = false;

            }
        }}}