//Первоначальный взнос по ипотеке
package Ipoteka;

public class Ipoteka {
    public static void main(String[] args) {

        final int costOfTheApartment = 4500000; // стоимость квартиры.
        final double firstPayInPercent = 25; // процент первоначального взноса по ипотеке.
        double firstPayInMoney = (firstPayInPercent / 100) * costOfTheApartment; // сумма первоначального взноса

        System.out.println("Cтоимость квартиры " + costOfTheApartment);
        System.out.println("Первоначальный взнос в процентах " + firstPayInPercent + "%");
        System.out.println("Первоначальный взнос в деньгах " + firstPayInMoney);
    }
}