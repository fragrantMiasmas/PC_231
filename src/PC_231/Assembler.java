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
    
    public String assemble(String instructions){
        StringBuilder sb = new StringBuilder();
        //example input : READ r0,d2;  WRITE r1 d2
       //whenever semicolon occurs, split
        for (String hexblock: instructions.split(";")) {
            System.out.println(hexblock);
            StringBuilder subsb = parse(hexblock);
            sb.append(subsb);
        }
        return sb.toString();
    }
    
    public StringBuilder parse(String hexblock){ //parses blocks of 3, returns 3 characters
        
        //example input : READ r0 d2
        StringBuilder sb = new StringBuilder();  
        // \\s for spaces
        // () for groups
        Pattern p = Pattern.compile("(\\w{3,})\\s+(\\w{1}\\d{1})(\\s+|\\^wd)(\\w{1}\\d{1})");
        Matcher m = p.matcher(hexblock);
        System.out.println("group 2" + m.group(2));
        String group1 = m.group(0);
                
        //first word returns the hex instruction
        char hexcode1 = hex(group1);
        
        //second chunck returns the second chracter which is a digit
        String group2 = m.group(1);
        char reg = group2.charAt(1);
        
        //third chunck
        String group3 = m.group(2);
        char number = group2.charAt(1);
        //return 3 hex characters
        System.out.println("");
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
            default: System.out.println("Invalid input");;
                     break;
        }
         return hexcode;
    }
    
}
