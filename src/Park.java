public class Park {
    private String parkName;


    // Конструктор
    public Park(String parkName) {
        this.parkName = parkName;
    }


    // Внутренний класс Attraction
    public class Attraction {
        private String attractionName;
        private String workingHours;
        private double price;


        // Конструктор
        public Attraction(String attractionName, String workingHours, double price) {
            this.attractionName = attractionName;
            this.workingHours = workingHours;
            this.price = price;
        }


        // Метод для вывода информации об аттракционе
        public void printInfo() {
            System.out.println("Аттракцион: " + attractionName);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость: " + price + " руб.");
        }
    }

}

