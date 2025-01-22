import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Задача 1
        // Создаем массив слов
        String[] words = {
                "apple", "banana", "apple", "orange", "kiwi",
                "banana", "grape", "kiwi", "pear", "apple",
                "peach", "orange", "plum", "peach", "apple"
        };


        // Используем SortedSet для хранения уникальных слов в отсортированном порядке
        SortedSet<String> uniqueWords = new TreeSet<>();
        Map<String, Integer> wordCount = new HashMap<>();


        for (String word : words) {
            uniqueWords.add(word);
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }


        // Выводим список уникальных слов (отсортированный)
        System.out.println("Уникальные слова (отсортированные): " + uniqueWords);


        // Выводим количество вхождений каждого слова
        System.out.println("Количество вхождений слов:");
        for (String word : uniqueWords) {
            System.out.println(word + ": " + wordCount.get(word));
        }

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


