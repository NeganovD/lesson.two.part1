//Первоначальный взнос по ипотеке
package Ipoteka;

public class Ipoteka {
    static final int costOfTheApartment = 4500000; // стоимость квартиры.
    static final double firstPayInPercent = 25; // процент первоначального взноса по ипотеке.
    static final double firstPayInMoney = (firstPayInPercent / 100) * costOfTheApartment; // сумма первоначального взноса

    public static void main(String[] args) {
        System.out.println("Cтоимость квартиры " + costOfTheApartment);
        System.out.println("Первоначальный взнос в процентах " + firstPayInPercent + "%");
        System.out.println("Первоначальный взнос в деньгах " + firstPayInMoney);
    }
}