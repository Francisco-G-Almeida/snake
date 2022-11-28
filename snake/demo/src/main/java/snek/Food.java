package main.java.snek;

public class Food {

    private int foodX;
    private int foodY;
    private boolean isEaten = false;

    public int getFoodX() {
        return foodX;
    }

    public void setFoodX(int foodX) {
        this.foodX = foodX;
    }

    public int getFoodY() {
        return foodY;
    }

    public void setFoodY(int foodY) {
        this.foodY = foodY;
    }

    public boolean isEaten() {
        return isEaten;
    }

    public void setEaten(boolean isEaten) {
        this.isEaten = isEaten;
    }

    

    public Food(boolean isEaten) {
        this.foodX = (int) (Math.random()*500);
        this.foodY = (int) (Math.random()*500);
        this.isEaten = false;
    }



    
    
    public void eatenDetector(Food food, Snake snake){
        if(snake.getSnakeX() == food.getFoodX() && snake.getSnakeY() == food.getFoodY()){
            isEaten = true;
            if(isEaten){
                Food food1 = new Food(isEaten);
            }
        }
    }

    
}
