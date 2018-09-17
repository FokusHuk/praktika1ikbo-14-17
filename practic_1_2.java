package com.company;

class Book{
    private double price;
    private int pageNumber;

    public Book(double p, int pn) {
        price = p;
        pageNumber = pn;
    }

    public Book() {
        price = 10;
        pageNumber =  200;
    }

    public String toString()
    {
        return "Price = " + price + "\nNumber of pages = " + pageNumber + "\n";
    }
}

public class Main
{
    public static void main(String[] args)
    {
	    Book book = new Book(50, 150);
	    System.out.println(book.toString());
    }
}
