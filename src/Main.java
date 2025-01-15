
public class Main {
    public static void main(String[] args) {
        String[][] validArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };


        String[][] invalidSizeArray = {
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}
        };


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
            System.out.println("Сумма элементов массива: " + ArrayProcessing.processArray(validArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }


        try {
            System.out.println("Сумма элементов массива: " + ArrayProcessing.processArray(validArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}
