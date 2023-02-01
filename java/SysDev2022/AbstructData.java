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
import java.util.*;
public class AbstructData {
 public static void main(String[]args) {
 ArrayList<Integer> yearsofEmp = new ArrayList();
     
     
 
     yearsofEmp.add(1991);
     yearsofEmp.add(1992);
     yearsofEmp.add(1993);
     yearsofEmp.remove(2);
     for(int empyears: yearsofEmp)
     {
         System.out.println(empyears);
     }
     System.out.println(yearsofEmp.isEmpty());
           
 }  
}
