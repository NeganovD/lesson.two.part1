// Буратино и яблоки
package BuratinoAndKarabas;

public class BuratinoAndKarabas {


    static final int applesQuantity = 10; // количество яблок у Буратино
    static final int stolenApples = 4; // количество яблок, которые Карабас украл у Буратино
    static final int remainingApples = applesQuantity - stolenApples; // количество яблок, оставшихся у Буратино;

    public static void main(String[] args) {
        System.out.println("Яблок у Буратино " + applesQuantity);
        System.out.println("Карабас украл яблок у Буратино " + stolenApples);
        System.out.println("Яблок остлось у Буратино " + remainingApples);
    }
}
