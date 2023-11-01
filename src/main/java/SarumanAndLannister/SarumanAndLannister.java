// Саруман и Ланнистеры
package SarumanAndLannister;

public class SarumanAndLannister {
       static final int lannistersTroopers = 3000; // Количество пехотинцев у Ланнистеров
       static final int sarumansOrcs = 2500; // Количество орков у Сарумана
       static final int totalQuantityOfTwoTroops = lannistersTroopers + sarumansOrcs; // Общее количество пехоты в союзе Ланнистеров и Сармана
    public static void main(String[] args) {
        System.out.println("Количество пехотинцев у Ланнистеров " + lannistersTroopers);
        System.out.println("Количество орков у Сарумана " + sarumansOrcs);
        System.out.println("Общее количество пехоты в союзе Ланнистеров и Сармана " + totalQuantityOfTwoTroops);
    }
}