//Стакан, который наполовину полон
package HalfGlasses;

public class HalfGlasses {
    public static void main(String[] args) {

        int volume = 500; // Объем стакана в миллилитрах
        double fillPercent = 47.0; // Процент заполненности стакана
        double fillAmount = (fillPercent / 100) * volume;

        System.out.println("Объем стакана: " + volume + " мл");
        System.out.println("Заполненность стакана: " + fillPercent + "%");
        System.out.println("Количество воды в стакане: " + fillAmount + " мл");
    }
}