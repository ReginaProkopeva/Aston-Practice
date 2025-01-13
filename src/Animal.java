abstract class Animal {

 private static int animalCount = 0;


public Animal() {
    animalCount++;
}


public abstract void run(int distance);


public abstract void swim(int distance);


public static int getAnimalCount() {
    return animalCount;
}
}
class Dog extends Animal {
    private static int dogCount = 0;
    private String name;


    public Dog(String name) {
        super();
        this.name = name;
        dogCount++;
    }


    @Override
    public void run(int distance) {
        if (distance <= 500) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не смог пробежать " + distance + " м.");
        }
    }


    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не смог проплыть " + distance + " м.");
        }
    }


    public static int getDogCount() {
        return dogCount;
    }
}


class Cat extends Animal {
    private static int catCount = 0;
    private String name;
    private boolean satiated;


    public Cat(String name) {
        super();
        this.name = name;
        this.satiated = false;
        catCount++;
    }


    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не смог пробежать " + distance + " м.");
        }
    }


    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }


    public void eat(Bowl bowl) {
        if (bowl.getFoodAmount() >= 10) {
            bowl.decreaseFood(10);
            satiated = true;
            System.out.println(name + " поел и стал сытым.");
        } else {
            System.out.println(name + " не хватает еды, он остался голодным.");
        }
    }


    public boolean isSatiated() {
        return satiated;
    }


    public String getName() {
        return name;
    }


    public static int getCatCount() {
        return catCount;
    }
}


