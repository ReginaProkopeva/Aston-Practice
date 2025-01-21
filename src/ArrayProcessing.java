public class ArrayProcessing {
    public static int processArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        // Проверка, что массив содержит ровно 4 строки
        if (array.length != 4) {
            throw new MyArraySizeException("Размер массива должен быть 4x4! Найдено строк: " + array.length);
        }


        // Проверка, что каждая строка содержит ровно 4 элемента
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException(
                        "Размер массива должен быть 4x4! В строке " + i + " найдено элементов: " + array[i].length
                );
            }
        }


        int sum = 0;


        // Проход по всем элементам массива и их суммирование
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]); // Преобразование элемента в int
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(
                            "Некорректные данные в ячейке [" + i + "][" + j + "]: " + array[i][j]
                    );
                }
            }
        }


        return sum;
    }
}