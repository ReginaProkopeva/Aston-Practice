import java.util.*;


public class PhoneDirectory {
    private final Map<String, List<String>> directory = new HashMap<>();


    // Метод для добавления записи
    public void add(String surname, String phoneNumber) {
        directory.computeIfAbsent(surname, k -> new ArrayList<>()).add(phoneNumber);
    }


    // Метод для получения номеров по фамилии
    public List<String> get(String surname) {
        return directory.getOrDefault(surname, Collections.emptyList());
    }
}
