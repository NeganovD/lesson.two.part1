//Время в пути
package TravelTime;

public class TravelTime {
    static final int distanceFromHomeToOffice = 12; // расстояние в километрах от дома до офиса.
    static final double averageSpeed = 24; // средняя скорость такси
    static final double travelTimeToOffice = (distanceFromHomeToOffice / averageSpeed); // время за которое тестировщик добирается от дома до офиса
    static final double eveningTrafficDecelerationFactor = 1.3; // коэффициент замедления транспорта вечером.
    static final double travelTimeToHome = (travelTimeToOffice * eveningTrafficDecelerationFactor); //время, за которое тестировщик добирается на такси с работы домой.
    public static void main(String[] args) {
        System.out.println("расстояние в километрах от дома до офиса " + distanceFromHomeToOffice + "км");
        System.out.println("средняя скорость такси в дневное время " + averageSpeed + "км/ч");
        System.out.println("время за которое тестировщик добирается от дома до офиса " + travelTimeToOffice * 60 + " мин.");
        System.out.println("время, за которое тестировщик добирается на такси с работы домой " + travelTimeToHome * 60 + " мин.");
    }
}