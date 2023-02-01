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
import java.util.Collection;
public class Mycollection {
 public static void main(String[] args)
{
    List<Integer> luckyNumber = new ArrayList<Integer>();
            luckyNumber.add(2);
            luckyNumber.add(12);
            luckyNumber.add(60);
            luckyNumber.add(50);
    
         
         // 60 is present at index 2.
         // 50 is present at index 3.
        int index = Collections.binarySearch(luckyNumber, 12);
        System.out.println(index);
        index = Collections.binarySearch(luckyNumber, 60);
        System.out.println(index);
        
        // 13 is not present. 13 would have been inserted
        index = Collections.binarySearch(luckyNumber, 13);
        System.out.println(index);
    
    
}
  
  
 
  
  
 }   

