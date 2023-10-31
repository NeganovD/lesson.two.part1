// Задача о количестве сотрудников на проекте
package EmployeesOnProject;

public class EmployeesOnProject {
    public static void main(String[] args) {

        final int quantityProgrammers = 10; // количество программистов
        final int quantityQAsPerProgrammer = 1; // количество тестировщиков, необходимое, чтобы протестировать код одного программиста.
        final int quantityTechSupportsPerProgrammer = 2; // количество специалистов поддержки, необходимое, чтобы обработать вопросы, возникающие у пользователей по поводу кода, написанного одним программистом.
        int totalOfQAsRequiredOnPoject = quantityProgrammers * quantityQAsPerProgrammer; // количество тестировщиков, требуемое на проекте
        int totalOfTechSupportsRequiredOnProject = quantityProgrammers * quantityTechSupportsPerProgrammer; // количество специалистов поддержки, требуемое на проекте
        int totalEmployees = quantityProgrammers + totalOfQAsRequiredOnPoject + totalOfTechSupportsRequiredOnProject; // общее количество технических специалистов на проекте

        System.out.println("Количество программистов: " + quantityProgrammers);
        System.out.println("Количество тестировщиков: " + totalOfQAsRequiredOnPoject);
        System.out.println("Количество специалистов поддержки: " + totalOfTechSupportsRequiredOnProject);
        System.out.println("Общее количество технических специалистов: " + totalEmployees);
    }
}