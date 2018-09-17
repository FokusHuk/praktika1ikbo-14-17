package com.company;

class Ball {
    private double price;
    private String color;

    public Ball(double p, String c) {
        price = p;
        color = c;
    }

    public Ball() {
        price = 10;
        color = "white";
    }

    public String toString()
    {
        return "Price = " + price + "\nColor = " + color + "\n";
    }
}

public class Main
{
    public static void main(String[] args)
    {
	    Ball ball = new Ball(50, "black");
	    System.out.println(ball.toString());
    }
}
