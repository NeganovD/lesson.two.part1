// Буратино и яблоки
package BuratinoAndKarabas;

public class BuratinoAndKarabas {
    public static void main(String[] args) {

        final int applesQuantity = 10; // количество яблок у Буратино
        final int stolenApples = 4; // количество яблок, которые Карабас украл у Буратино
        int remainingApples = applesQuantity - stolenApples; // количество яблок, оставшихся у Буратино;

        System.out.println("Яблок у Буратино " + applesQuantity);
        System.out.println("Карабас украл яблок у Буратино " + stolenApples);
        System.out.println("Яблок остлось у Буратино " + remainingApples);
    }
}
