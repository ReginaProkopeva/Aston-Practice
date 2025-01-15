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
