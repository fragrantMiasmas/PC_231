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
    
    public void device(int input, String str){
        
        if(str == "DD"){ //dec
            System.out.println(input);
        }
            else if(str == "HD"){ //hex
                System.out.println(input);
            }
                else if(str == "AD"){
                        char ascii = (char) input;
                        System.out.println(ascii);
                        }
                    else{
                       System.out.println("Not a valid input");
                            }               
        
    }   
}
