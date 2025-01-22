import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Создаем SortedSet для хранения уникальных слов в отсортированном порядке
        SortedSet<String> sortedSet = new TreeSet<>();

        // Добавляем слова в коллекцию с помощью метода set.add()
        sortedSet.add("apple");
        sortedSet.add("banana");
        sortedSet.add("apple");  // Повторяющееся слово
        sortedSet.add("orange");
        sortedSet.add("grape");
        sortedSet.add("banana");  // Повторяющееся слово
        sortedSet.add("kiwi");
        sortedSet.add("pear");
        sortedSet.add("kiwi");  // Повторяющееся слово
        sortedSet.add("apple");  // Повторяющееся слово
        sortedSet.add("melon");
        sortedSet.add("orange");  // Повторяющееся слово
        sortedSet.add("grape");  // Повторяющееся слово
        sortedSet.add("watermelon");
        sortedSet.add("cherry");
        sortedSet.add("banana");  // Повторяющееся слово
        sortedSet.add("pear");  // Повторяющееся слово
        sortedSet.add("peach");
        sortedSet.add("apple");  // Повторяющееся слово
        sortedSet.add("grape");  // Повторяющееся слово


        // Создаем список для подсчета количества вхождений
        List<String> words = Arrays.asList(
                "apple", "banana", "apple", "orange", "grape",
                "banana", "kiwi", "pear", "kiwi", "apple",
                "melon", "orange", "grape", "watermelon", "cherry",
                "banana", "pear", "peach", "apple", "grape"
        );


        // Выводим список уникальных слов
        System.out.println("Список уникальных слов:");
        for (String word : sortedSet) {
            System.out.println(word);
        }


        // Подсчитываем количество вхождений каждого слова
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }


        // Выводим количество вхождений каждого слова
        System.out.println("\nКоличество вхождений каждого слова:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
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


