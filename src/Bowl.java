public class Bowl {
    private int foodAmount;


    public Bowl(int foodAmount) {
        this.foodAmount = Math.max(foodAmount, 0);
    }


    public int getFoodAmount() {
        return foodAmount;
    }


    public void addFood(int food) {
        foodAmount += food;
    }


    public void decreaseFood(int food) {
        if (foodAmount >= food) {
            foodAmount -= food;
        } else {
            foodAmount = 0;
        }
    }
}



