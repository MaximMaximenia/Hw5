package HomeWork5;

import java.util.Scanner;

public class TruckTransport extends GroundTranssport {

    private int tonnage;
    int cargo;

     public void setTonnage(int tonnage) {
          this.tonnage = tonnage;

     }

     void info(){
     System.out.println("Информация об Т/C:");
     System.out.println();
     System.out.println("Грузоподъемность "+tonnage+" тонн.");
     System.out.println("Мощность: "+power+" л/с." );
     System.out.println("Масса: "+mass+" кг.");
     System.out.println("Максимальная скорость :"+maxSpeed+ " км/ч.");
     System.out.println("Марка: "+brand+".");
     System.out.println("Количество колес: "+amountWheels);
     System.out.println("Расход топлива: "+fuelConsumption+ " л/100км");
     System.out.println("Мощность в кВ: "+ getKvValue());
}

public void cargoCheck(){
          boolean cargoWhile=true;
          while(cargoWhile){
     Scanner s = new Scanner(System.in);

     System.out.println("ВВЕДИТЕ КОЛИЧЕСТВО ГРУЗА ( В ТОННАХ ) : ");
     cargo = s.nextInt();
     if (cargo < 0){
          System.out.println("НЕВЕРНОЕ ЗНАЧЕНИЕ.");
     }
     else{
          if (cargo > tonnage){
               System.out.println("Вам понадобится грузовик побольше");
               cargoWhile=false;
          }
          else{
               System.out.println("Груз загружен");
               cargoWhile=false;

     }



}

}}}