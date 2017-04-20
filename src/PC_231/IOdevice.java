/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PC_231;

import java.util.Scanner;

/**
 *
 * @author ElizabethReed PC
 */
public class IOdevice {
    
    //modes of output    
     public void device(int input, int device){
         
         Scanner kb = new Scanner(System.in);
        
         switch(device){
             case 0: //dd
                 System.out.println("Please enter in a decimal number: ");
                 int dec = kb.nextInt();
                 System.out.println(dec);
                 break;
             case 1: //hd
                 System.out.println("Please enter in a hex number: ");
                 int hex = kb.nextInt();
                 System.out.println(hex);
                 break;
             case 2: //ad
                 System.out.println("Please enter in a character: ");
                 String user_input = kb.next();
                 char ascii = user_input.charAt(0);
                 System.out.println(ascii);
                 break;
             default: System.out.println("Not a valid input");
         }
    }   
}
