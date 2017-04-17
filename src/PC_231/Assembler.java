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
    
    //input instructions, output hex codes
    
    public void assemble(String instructions){
        //use regex to parse
        //example input : READ r0,d2    
        // \\s for spaces
        // () for groups
        Pattern p = Pattern.compile("(\\w{3,}) \\s (\\w{1} \\d{1}) (\\s|\\^wd) (\\w{1} \\d{1})");
        Matcher m = p.matcher(instructions);
        System.out.println("group 2" + m.group(1));
        //whenever semicolon occurs, split
        
        //return hex codes
    }
    
}
