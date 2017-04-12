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
public class CPU {
    
    // do we have 9 registers in CPU or declare it 9 times in main class?

    public int[] register(){
        
        //each index is a 32 bit int that represents a register
        int[] reg = new int[16]; //4 bits, 2^4 = 16
        return reg;
    }
    
    public int[] RAM(){
        int[] RAM = new int[256];
        return RAM;
    }
    
//    public int[] R0(){
//        int[] R0 = new int[12];
//        return R0;
//    }
//    

    
 }
