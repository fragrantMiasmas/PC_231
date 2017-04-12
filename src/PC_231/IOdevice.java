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
     public void DD(int dec){
         System.out.println(dec);
    }
    
    public void HD(int input){ //convert input to hex
        int hex = 0;
        System.out.println(hex);
    }
    
     public void AD(int input){
        char ascii = (char) input;
         System.out.println(ascii);
    }
}
