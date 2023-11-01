//Скидки на рубашки
package DiscountShirts;

public class Shirts {
    static final int priceOfShirt = 300; // цена одной рубашки без скидки
    static final int shirtsInBasket = 10; // количество уже выбранных рубашек
    static final int quantityShirtsForGetDiscount = 5; // количество рубашек, которые надо купить, чтобы получить скидку.
    static final int howMustShirtForGerDiscount = quantityShirtsForGetDiscount - shirtsInBasket; // количество рубашек, которые надо добавить к купленным, чтобы получить скидку
    static final int totalbasketPrice = shirtsInBasket * priceOfShirt; // общая цена уже выбранных рубашек без скидки
    static final int howMuchNeedMore = howMustShirtForGerDiscount * priceOfShirt; // общая цена рубашек (без скидки), которые надо докупить, чтобы получить скидку
    static final double discount = 30; // Процент скидки
    static final double shirtsInBasketWithDiscount = totalbasketPrice - ((discount / 100) * shirtsInBasket * priceOfShirt); // цена всех рубашек со скидкой
    static final double priceOfShirtWithDiscount = priceOfShirt - ((discount / 100) * priceOfShirt); // цена одной рубашки со скидкой
    static final double savedMoney = totalbasketPrice - shirtsInBasketWithDiscount; // количество сэкономленных денег, если рубашки куплены со скидкой
    static final int freeShirts = (int) ((totalbasketPrice - shirtsInBasketWithDiscount) / priceOfShirt); // количество рубашек, которые из-за скидки считай получены на халяву

    public static void main(String[] args) {
        System.out.println("цена одной рубашки без скидки " + priceOfShirt);
        System.out.println("количество уже выбранных рубашек " + shirtsInBasket + " шт");
        System.out.println("количество рубашек, которые надо купить, чтобы получить скидку " + quantityShirtsForGetDiscount);
        if (shirtsInBasket < quantityShirtsForGetDiscount) {
            System.out.println("количество рубашек, которые надо добавить к купленным, чтобы получить скидку " + howMustShirtForGerDiscount);
            System.out.println("общая цена рубашек (без скидки), которые надо докупить, чтобы получить скидку " + howMuchNeedMore);
        }
        System.out.println("Скидка " + discount + "%");
        System.out.println("общая цена уже выбранных рубашек без скидки " + totalbasketPrice);
        System.out.println("цена всех рубашек со скидкой " + shirtsInBasketWithDiscount);
        System.out.println("цена одной рубашки со скидкой " + priceOfShirtWithDiscount);
        if (shirtsInBasket >= quantityShirtsForGetDiscount) {
            System.out.println("количество сэкономленных денег, если рубашки куплены со скидкой " + savedMoney);
            System.out.println("количество рубашек, которые из-за скидки считай получены на халяву " + freeShirts);
        } else {
            System.out.println("количество сэкономленных денег, если рубашки куплены со скидкой 0");
            System.out.println("количество рубашек, которые из-за скидки считай получены на халяву 0");
        }
    }
}