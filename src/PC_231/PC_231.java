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
public class PC_231 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Assembler asm = new Assembler();
        Sim231 sim = new Sim231();
        
//        int bitmask = 0x000F;
//        System.out.println("bitmask = " + bitmask);
//        
//        int val = 0x2222;
//        System.out.println("val = " + val);
//        
//        int and = val & bitmask;
//        // prints "2"
//        System.out.println(and);
//        
//        int invert = ~and;
//        System.out.println("inverted = " + invert);
//        
//        int and4 = and>>>1;
//        System.out.println(and4);
        
        //program below

//           String input = "201 600 600";
         String input = "302";
//         sim.run(input);

         String instr = "READ r0,dd; WRITE r0,hd; ADD r5,dd";
         asm.assemble(instr);
        
    }   
}
