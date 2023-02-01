/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SysDev2022;

/**
 *
 * @author LucidTechnologies
 */
public class Overloading {
    public static void main (String[]args){
        Overloading bb = new Overloading();
        bb.display();
        bb.calculate();
        System.out.println(bb.calculate());
    }
  public void display() {
    System.out.println("Wellcom to java class");
      
  }
  public int calculate() {
      int a = 2;
      int b = 3 ;
      int c = a*b;
      return c;
  }       
          
          
          
          
          
          
          
          
          
          
          
}
