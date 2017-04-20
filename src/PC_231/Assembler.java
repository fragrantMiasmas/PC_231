/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PC_231;
import java.util.regex.*;

/**
 *
 * @author ElizabethReed PC
 */
public class Assembler {
    
    //input instructions, output hex codes, use regex to parse
    
    public void assemble(String instructions){
        StringBuilder sb = new StringBuilder();
        //example input : READ r0 d2;  WRITE r1 d2
       //whenever semicolon occurs, split
        for (String hexblock: instructions.split("; " )) { //includes a space
            System.out.println(hexblock);
            StringBuilder subsb = parseAlt(hexblock);
            sb.append(subsb);
        }
        System.out.println(sb);
    }
    
    
    public StringBuilder parseAlt(String hexblock){ //parses blocks of 3, returns 3 characters
        
        //example input : READ r0 d2
        StringBuilder sb = new StringBuilder();  
        //first work it READ
        String[] hexinstr = hexblock.split(" ");  //encounter a space
            char tableval = hex(hexinstr[0]); //read becomes c
            sb.append(tableval);
            
             //register inputs ie r0,d2
        for (String codeblock: hexinstr[1].split(",")) { //encounter a comma
            char subsb = codeblock.charAt(1);
            char device = codeblock.charAt(0);
            //for devices
            if(device == 'd'){//decimal device                
                device = '0';
                sb.append(device);
            }
            else if(device == 'h'){ //hex device
                 device = '1';
                 sb.append(device);
            }
            else if(device == 'a'){ //ascii device
                device = '2';
                sb.append(device);
            }       
            else
                sb.append(subsb);
        }

        sb.append(" "); //space inbetween code blocks
        return sb;
    }
    
    public char hex(String instr){ //reads first part of instruction ie DATA
        instr = instr.toLowerCase();
        char hexcode = '1';
         switch (instr) {
            case "halt":  hexcode = '0';
                     break;
            case "zero" :  hexcode = '1';
                     break;
            case "set": hexcode = '2';
                     break;
            case "data":  hexcode = '3';
                     break;
            case "inc": hexcode = '4';
                     break;
            case "shift":  hexcode = '5';
                     break;
            case "add":  hexcode = '6';
                     break;
            case "sub": hexcode = '7';
                     break;
            case "and":  hexcode = '8';
                     break;
            case "copy":  hexcode = '9';
                     break;
            case "load": hexcode = 'A';
                     break;
            case "store": hexcode = 'B';
                     break;
            case "read": hexcode = 'C';
                     break;
            case "write": hexcode = 'D';
                     break;
            case "jpif" : hexcode = 'E';
                     break;
            case "jump" : hexcode = 'F';
                     break;
            default: //System.out.println("Invalid input");
                     break;
        }
         return hexcode;
    }
    
}
