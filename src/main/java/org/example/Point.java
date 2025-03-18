package org.example;

public class Point {
   private int x;
   private  int y;

    public Point(int y, int x) {
        this.y = y;
        this.x = x;
    }

    public int getX(){
        return x;
    }
    public  int getY(){
        return y;
    }

    public void setX(int x){
        this.x = x;
    }
    public void  setY(int y){
        this.y = y;
    }


    public  double distance(){
        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
    }

    public  double distance(Point point){
        if(point == null){
            System.out.println("point objesi null edildi.");
            return 0;
        }
       return Math.sqrt(Math.pow((x- point.x),2) + Math.pow((y- point.y),2));
    }
    public double distance(int x, int y){
        return Math.sqrt(Math.pow((this.x -x),2) + Math.pow((this.y -y),2));

    }
}
