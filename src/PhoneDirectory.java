import java.util.*;


public class PhoneDirectory {
    private Map<String, Set<String>> directory = new HashMap<>();

    // Метод для добавления записи
    public void add(String lastName, String phoneNumber) {

        // Проверяем, что номер телефона уникален в справочнике
        for (Set<String> numbers : directory.values()) {
            if (numbers.contains(phoneNumber)) {
                System.out.println("Ошибка: номер телефона " + phoneNumber + " уже используется.");
                return;
            }
        }


        // Добавляем номер телефона к фамилии
        directory.computeIfAbsent(lastName, k -> new HashSet<>()).add(phoneNumber);
    }


    // Метод для получения номеров телефонов по фамилии
    public Set<String> get(String lastName) {
        return directory.getOrDefault(lastName, Collections.emptySet());
    }
}

