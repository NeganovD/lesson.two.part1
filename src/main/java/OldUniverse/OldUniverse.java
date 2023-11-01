//Возраст Вселенной по сравнению с возрастом человечества
package OldUniverse;

public class OldUniverse {
    static final long ageOfTheUniverse = 13000000000L; // возраст Вселенной в годах
    static final long ageOfHuman = 100000; // возраст человека, как вида в годах
    static final long ageRatio = ageOfTheUniverse / ageOfHuman;
    public static void main(String[] args) {
        System.out.println("Возраст Вселенной: " + ageOfTheUniverse + " лет");
        System.out.println("Возраст человека: " + ageOfHuman + " лет");
        System.out.println("Возраст Вселенной в " + ageRatio + " раз больше возраста человека");
    }
}