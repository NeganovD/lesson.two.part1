//Возраст Вселенной по сравнению с возрастом человечества
package OldUniverse;

public class OldUniverse {
    public static void main(String[] args) {

        final long ageOfTheUniverse = 13000000000L; // возраст Вселенной в годах
        final long ageOfHuman = 100000; // возраст человека, как вида в годах
        long ageRatio = ageOfTheUniverse / ageOfHuman;

        System.out.println("Возраст Вселенной: " + ageOfTheUniverse + " лет");
        System.out.println("Возраст человека: " + ageOfHuman + " лет");
        System.out.println("Возраст Вселенной в " + ageRatio + " раз больше возраста человека");
    }
}