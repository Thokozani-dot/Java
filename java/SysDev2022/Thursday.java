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
public class Thursday {
  public static void main(String[]args){
      
    Thursday tt= new Thursday(); 
    tt.product();
   Thursday.Display();
  } 
  
  public void product()
  {
   int a =30;
   int b =50;
  
 double c = (double) b/a;
     System.out.println(c);
  }
  public static void Display()
  {
    String Fname = "Thokozani"; 
    String Lname = "Ndaba";
    String Fullname = Fname +" " + " "+ Lname;
    System.out.println(Fullname);
    
  }        
}
