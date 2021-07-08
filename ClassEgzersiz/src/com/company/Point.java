package com.company;

public class Point {
    private int x;
    private int y;

    public Point(){

        this(0,0);

    }
    public Point(int x,int y){

        setX(x);
        setY(y);
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double distance()
    {
        double result=Math.sqrt(((this.x-0)*(this.x-0))+((this.y-0)*(this.y-0)));
        return result;
    }
    public double distance(int x,int y)
    {
        return Math.sqrt(((x-this.x)*(x-this.x))+((y-this.y)*(y-this.y)));


    }
    public double distance(Point point)
    {

        return Math.sqrt(((point.x-this.x)*(point.x-this.x))+((point.y-this.y)*(point.y-this.y)));

    }
}
