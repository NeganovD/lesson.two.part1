//Стакан, который наполовину полон
package HalfGlasses;

public class HalfGlasses {
    static final int volume = 500; // Объем стакана в миллилитрах
    static final double fillPercent = 47.0; // Процент заполненности стакана
    static final double fillAmount = (fillPercent / 100) * volume;

    public static void main(String[] args) {
        System.out.println("Объем стакана: " + volume + " мл");
        System.out.println("Заполненность стакана: " + fillPercent + "%");
        System.out.println("Количество воды в стакане: " + fillAmount + " мл");
    }
}