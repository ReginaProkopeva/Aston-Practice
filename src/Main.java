//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Задача 1
        Dog dogBobik = new Dog("Бобик");
        Dog dogTuzik = new Dog("Тузик");
        Cat catMurka = new Cat("Мурка");
        Cat catBarsik = new Cat("Барсик");


        dogBobik.run(150);
        dogBobik.swim(8);


        catMurka.run(250);
        catMurka.swim(5);


        System.out.println("Создано собак: " + Dog.getDogCount());
        System.out.println("Создано котов: " + Cat.getCatCount());
        System.out.println("Создано животных: " + Animal.getAnimalCount());


        // Работа с миской и котами
        Bowl bowl = new Bowl(15);
        Cat[] cats = {catMurka, catBarsik};


        for (Cat cat : cats) {
            cat.eat(bowl);
        }


        for (Cat cat : cats) {
            System.out.println(cat.getName() + " сытость: " + cat.isSatiated());
        }


        bowl.addFood(10);
        System.out.println("Еда в миске: " + bowl.getFoodAmount());


        // Задача 2
        Shape circle = new Circle(5, "Красный", "Синий");
        Shape rectangle = new Rectangle(4, 6, "Зелёный", "Чёрный");
        Shape triangle = new Triangle(3, 4, 5, "Жёлтый", "Фиолетовый");


        circle.printCharacteristics();
        rectangle.printCharacteristics();
        triangle.printCharacteristics();

    }
}