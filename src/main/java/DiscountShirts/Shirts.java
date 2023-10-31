//Скидки на рубашки
package DiscountShirts;

public class Shirts {
    public static void main(String[] args) {

        final int priceOfShirt = 300; // цена одной рубашки без скидки
        final int shirtsInBasket = 10; // количество уже выбранных рубашек
        final int quantityShirtsForGetDiscount = 5; // количество рубашек, которые надо купить, чтобы получить скидку.
        int howMustShirtForGerDiscount = quantityShirtsForGetDiscount - shirtsInBasket; // количество рубашек, которые надо добавить к купленным, чтобы получить скидку
        int totalbasketPrice = shirtsInBasket * priceOfShirt; // общая цена уже выбранных рубашек без скидки
        int howMuchNeedMore = howMustShirtForGerDiscount * priceOfShirt; // общая цена рубашек (без скидки), которые надо докупить, чтобы получить скидку
        final double discount = 30; // Процент скидки
        double shirtsInBasketWithDiscount = totalbasketPrice - ((discount / 100) * shirtsInBasket * priceOfShirt); // цена всех рубашек со скидкой
        double priceOfShirtWithDiscount = priceOfShirt - ((discount / 100) * priceOfShirt); // цена одной рубашки со скидкой
        double savedMoney = totalbasketPrice - shirtsInBasketWithDiscount; // количество сэкономленных денег, если рубашки куплены со скидкой
        int freeShirts = (int) ((totalbasketPrice - shirtsInBasketWithDiscount) / priceOfShirt); // количество рубашек, которые из-за скидки считай получены на халяву

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