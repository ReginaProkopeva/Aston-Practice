import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //Задача 1
        // Создаем массив слов (с повторяющимися)
        String[] words = {
                "яблоко", "груша", "апельсин", "яблоко", "банан",
                "вишня", "яблоко", "банан", "груша", "слива",
                "груша", "абрикос", "виноград", "банан", "вишня",
                "персик", "персик", "яблоко"
        };


        // Преобразуем массив в Set для получения уникальных слов
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
        System.out.println("Список уникальных слов: " + uniqueWords);


        // Считаем количество вхождений каждого слова с использованием Stream API
        Map<String, Long> wordCount = Arrays.stream(words)
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));


        // Выводим количество вхождений каждого слова
        System.out.println("Количество вхождений слов:");
        wordCount.forEach((word, count) -> System.out.println(word + ": " + count));


        // Задача 2
        PhoneDirectory phoneDirectory = new PhoneDirectory();


        // Добавляем 20 записей, включая повторяющиеся фамилии
        phoneDirectory.add("Ivanov", "123456");
        phoneDirectory.add("Petrov", "234567");
        phoneDirectory.add("Sidorov", "345678");
        phoneDirectory.add("Ivanov", "456789");
        phoneDirectory.add("Smirnov", "567890");
        phoneDirectory.add("Petrov", "678901");
        phoneDirectory.add("Fedorov", "789012");
        phoneDirectory.add("Semenov", "890123");
        phoneDirectory.add("Nikolaev", "901234");
        phoneDirectory.add("Kuznetsov", "112345");
        phoneDirectory.add("Ivanov", "223456");
        phoneDirectory.add("Petrov", "334567");
        phoneDirectory.add("Sidorov", "445678");
        phoneDirectory.add("Fedorov", "556789");
        phoneDirectory.add("Semenov", "667890");
        phoneDirectory.add("Smirnov", "778901");
        phoneDirectory.add("Ivanov", "889012");
        phoneDirectory.add("Petrov", "990123");
        phoneDirectory.add("Sidorov", "101234");
        phoneDirectory.add("Kuznetsov", "211345");

        // Попытка добавить дублирующий номер
        phoneDirectory.add("Петров", "211345");


        // Попытка добавить одинаковый номер для одного человека
        phoneDirectory.add("Иванов", "223456");


        // Получаем номера по фамилиям
        System.out.println("Телефоны Иванова: " + phoneDirectory.get("Ivanov"));
        System.out.println("Телефоны Петрова: " + phoneDirectory.get("Petrov"));
        System.out.println("Телефоны Сидорова: " + phoneDirectory.get("Sidorov"));
        System.out.println("Телефоны Смирнова: " + phoneDirectory.get("Smirnov"));
        System.out.println("Телефоны Кузнецова: " + phoneDirectory.get("Kuznetsov"));
        System.out.println("Телефоны Семенова: " + phoneDirectory.get("Semenov"));
        System.out.println("Телефоны отсутствующей фамилии (Иванченко): " + phoneDirectory.get("Ivanchenko"));
    }
}


