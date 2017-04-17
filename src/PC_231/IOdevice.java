/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PC_231;

/**
 *
 * @author ElizabethReed PC
 */
public class IOdevice {
    
    //modes of output    
     public void device(int input, int device){
        
         switch(device){
             case 0: //dd
                 System.out.println(input);
                 break;
             case 1: //hd
                 System.out.println(input);
                 break;
             case 2: //ad
                 char ascii = (char) input;
                 System.out.println(ascii);
                 break;
             default: System.out.println("Not a valid input");
         }
    }   
}
