 interface Shape {
    double calculatePerimeter();


    double calculateArea();

     String getFillColor();

     String getBorderColor();

     default void printCharacteristics() {
         System.out.println("Периметр: " + calculatePerimeter());
         System.out.println("Площадь: " + calculateArea());
         System.out.println("Цвет заливки: " + getFillColor());
         System.out.println("Цвет границы: " + getBorderColor());
     }
 }











