//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Корректный массив
        String[][] validArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };


        // Массив с неправильным размером
        String[][] invalidSizeArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8", "3232", "123"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };


        // Массив с некорректными данными
        String[][] invalidDataArray = {
                {"1", "2", "3", "4"},
                {"5", "six", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };


        try {
            System.out.println("Сумма элементов массива: " + ArrayProcessing.processArray(validArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }


        try {
            System.out.println("Сумма элементов массива: " + ArrayProcessing.processArray(invalidSizeArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }


        try {
            System.out.println("Сумма элементов массива: " + ArrayProcessing.processArray(invalidDataArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}