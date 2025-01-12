public class HomeWork {
    // 1. Вывод трех слов
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }


    // 2. Проверка суммы
    public static void checkSumSign() {
        int a = 10;
        int b = -5;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }


    // 3. Вывод цвета
    public static void printColor() {
        int value = 50;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }
    }


    // 4. Сравнение чисел
    public static void compareNumbers() {
        int a = 15;
        int b = 10;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }


    // 5. Проверка суммы на диапазон
    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }


    // 6. Положительное или отрицательное
    public static void printSign(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }


    // 7. Проверка отрицательного числа
    public static boolean isNegative(int number) {
        return number < 0;
    }


    // 8. Повтор строки
    public static void printString(String text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }


    // 9. Проверка високосного года
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }


    // 10. Инверсия массива
    public static void invertArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 0) ? 1 : 0;
        }
    }


    // 11. Заполнение массива от 1 до 100
    public static int[] fillArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }


    // 12. Умножение чисел меньше 6 на 2
    public static void doubleIfLessThanSix(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
    }


    // 13. Заполнение диагоналей единицами
    public static void fillDiagonals(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
            matrix[i][matrix.length - 1 - i] = 1;
        }
    }


    // 14. Создание массива с заданной длиной и значением
    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }


    public static void main(String[] args) {
        // Вызывайте методы для проверки
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(isSumInRange(10, 5));
        printSign(-10);
        System.out.println(isNegative(-5));
        printString("Hello, World!", 3);
        System.out.println(isLeapYear(2024));


        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        invertArray(array);
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();


        int[] filledArray = fillArray();
        for (int num : filledArray) {
            System.out.print(num + " ");
        }
        System.out.println();


        int[] numbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        doubleIfLessThanSix(numbers);
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();


        int[][] matrix = new int[5][5];
        fillDiagonals(matrix);
        for (int[] row : matrix) {
            for (int num : row) {

                System.out.print(num + " ");
            }
            System.out.println();
        }


        int[] customArray = createArray(10, 7);
        for (int num : customArray) {
            System.out.print(num + " ");
        }
    }
}
