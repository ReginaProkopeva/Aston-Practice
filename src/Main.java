//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Задача 2: Массив сотрудников
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Иван Иванов", "Менеджер", "ivanov@mail.com", "1234567890", 50000, 35);
        employees[1] = new Employee("Петр Петров", "Инженер", "petrov@mail.com", "2345678901", 60000, 40);
        employees[2] = new Employee("Сергей Сергеев", "Программист", "sergeev@mail.com", "3456789012", 70000, 30);
        employees[3] = new Employee("Анна Аннова", "Бухгалтер", "annova@mail.com", "4567890123", 55000, 45);
        employees[4] = new Employee("Ольга Ольгова", "Дизайнер", "olgova@mail.com", "5678901234", 65000, 28);


        System.out.println("Список сотрудников:");

        for (Employee employee : employees) {
            employee.printInfo();
            System.out.println("---------------------");
        }
        // Задача 3: Класс Park с внутренним классом Attraction
        Park park = new Park("Центральный парк");
        Park.Attraction attraction1 = park.new Attraction("Колесо обозрения", "10:00 - 20:00", 300);
        Park.Attraction attraction2 = park.new Attraction("Американские горки", "11:00 - 21:00", 500);
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        System.out.println("Информация об аттракционах:");
        attraction1.printInfo();
        System.out.println("---------------------");
        attraction2.printInfo();
    }
}
