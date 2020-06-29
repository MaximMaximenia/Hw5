package HomeWork5;

public class MilitaryAirTransport extends AirTransport {
    boolean ejectionSystem;
    int rocketsValue;
    void info() {
        System.out.println("Информация об Т/C:");
        System.out.println();
        System.out.println("Размах крыльев: " + wingSpan + " метров.");
        if (ejectionSystem = true) {
            System.out.println("Имеется наличие системы катапультирования");
        } else {
            System.out.println("Наличие системы катапультирования отсутствует");
        }
        System.out.println("Минимальная длинна взлетной полосы " + minAirStripLength + " метров");
        System.out.println("Количество ракет на борту"+rocketsValue+" шт.");
        System.out.println("Мощность в кВ: "+ getKvValue());

    }
void shot(){
        if (rocketsValue>0){
            System.out.println("РАКЕТА ПОШЛА .   ..  . . ..  ..     -->");
        }
        else{
            System.out.println("СТРЕЛЯТЬ НЕЧЕМ(.");
        }
    }
    void ejection(){
        if (ejectionSystem=true){
            System.out.println("Катапультирование прошло успешно.");
        }
        else{
            System.out.println("У вас нет системы катапультирования.");
        }
    }
}
