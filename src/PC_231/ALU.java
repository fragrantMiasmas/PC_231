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
public class ALU {

    
    //Halts the machine
    public void Halt(){
        System.exit(0);
    }
    
    //	Zeroes (or "clears") out register RRRR
    public void zero(int[] RR){
        
    }
    
    //	Sets the 4 lowest-order bits of register RRRR to BBBB
    public int[] set(int[] RR, int[] BB){
        for(int i=RR.length; i>RR.length-4; i--){
            int j = 0;
            RR[i] = BB[j]; //change details later
            j++;
        }
        return RR;
    }
    
    //	Clears the data register DR, then sets its 8 lowest-order bits
    public void data(int[] B1, int[] B2){
        
        //set b1 to zeros, or should i use for loop?
        B1 = new int[4];
        
    }
    
    //	Adds or subtracts from 1 to 8 from register RRRR
    public void INC(int[] RR){
        
    }
    
    //Shifts register RRRR left (-) or right (+) by from 1 to 8 bits
    public void Shift(int[] RR){
        //RR >> 8;
    }
    
    //Adds the contents of register RRR1 to RRR2 (result in RRR2)
    public void add(int[] R1, int[] R2){
        
    }
    
    //	Subtracts the contents of register RRR1 from RRR2 (result in 
    public void sub(int[] R1, int[] R2){
        
    }
    
    //	Logically ANDs the contents of register RRR1 into RRR2 (result in RRR2)
    public void and(int[] R1, int[] R2){
        
        int[] newReg = new int[16];
        for(int i = 0; i<R1.length; i++){
            newReg[i] = R1[i] & R2[i];
        }
    }
    
    //Copies the contents of register RRR1 to RRR2
    public void copy(int[] R1, int[] R2){
        
    }
    
    //	Loads the contents of location addressed by RRR2 into register RRR1
    public void load(int[] R1, int[] R2){
        
    }
    
    //  Stores the contents of register RRR1 into location addressed by RRR2
    public void store(int[] R1, int[] R2){
        
    }
    
    //  Reads a value (up to 12 bits) into register RRRR from device DDDD
    public void read(int[] RR){
        
    }
    
    //  Writes a value (up to 12 bits) from register RRRR to device DDDD
    public void write(int[] RR){
        
    }
    
    //  If contents of RRRR meet condition CC, jump to address in JJ
    public void JPIF(int[] RR){
        
    }
    
    //  Jump directly to the location whose address is AAAA AAAA
    public void jump(){
        
    }
}
