package com.driver;

public class Main {

    // Step 1: Create a product class inside Main 
  public static class Product{

    // Step 3: Method with 2 int parameters
    public int product(int x, int y){
        return x*y;
    }

    // Step 4: Method OverLoded with 3 int parameters
    public int product(int x, int y, int z ){
        return x*y*z;
    }

    // Step 5: Overloaded method with double parameters
        public double product(double x, double y) {
            return x * y;
        }

  }
  
  public static void main(String[] args) {
    
    // Step 2: Create object of Product

    Product p= new Product();

     // Calling different versions of product()
        System.out.println("Product of 2 integers: " + p.product(10, 20));
        System.out.println("Product of 3 integers: " + p.product(2, 3, 4));     
        System.out.println("Product of 2 doubles: " + p.product(5.5, 4.5));
  }

}