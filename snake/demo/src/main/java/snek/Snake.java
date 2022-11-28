package main.java.snek;

public class Snake {

    private int speed;
    private int size;
    private int snakeX;
    private int snakeY;
    private boolean isAlive;

    public void colDetector(){
       /*  if(this.snakeX <= leftborder || this.snakeX >= right border || this.snakeY <= bottom border || this.snakeY >= top border){
            setAlive(false);
        }*/
    }



    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public int getSnakeX() {
        return snakeX;
    }
    public void setSnakeX(int snakeX) {
        this.snakeX = snakeX;
    }
    public int getSnakeY() {
        return snakeY;
    }
    public void setSnakeY(int snakeY) {
        this.snakeY = snakeY;
    }
    public boolean isAlive() {
        return isAlive;
    }
    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }



}
