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
    
    int[] reg = new int[16]; //4 bits, 2^4 = 16
    int[] RAM = new int[256];
    
    IOdevice IOD = new IOdevice();
    
    //Halts the machine
    public void Halt(){
        System.exit(0);
    }
    
    //	Zeroes (or "clears") out register RRRR
    public int zero(int RR){
        reg[RR] = 0;
        return reg[RR];
    }
    
    //	Sets the 4 lowest-order bits of register RRRR to BBBB
    public int set(int RR, int BB){
        // mask first 28 bits of int
        
        //set lower 4 bits
        
        return reg[RR];
        
    }
    
    //	Clears the data register DR, then sets its 8 lowest-order bits
    public void data(int B1, int B2){
        B1 = 0;
        // set 8 lowest order bits
    }
    
    //	Adds or subtracts from 1 to 8 from register RRRR
    public int INC(int RR, int NN){ //increment
        reg[RR] = reg[RR]-NN;
        return reg[RR];
    }
    
    //Shifts register RRRR left (-) or right (+) by from 1 to 8 bits
    public int Shift(int RR, int NN){
       reg[RR] = reg[RR] >> NN;
       return reg[RR];
    }
    
    //Adds the contents of register RRR1 to RRR2 (result in RRR2)
    public int add(int R1, int R2){
        reg[R2] = reg[R2] + reg[R1];
        return reg[R2];
    }
    
    //	Subtracts the contents of register RRR1 from RRR2 (result in RRR2) 
    public int sub(int R1, int R2){
        reg[R2] = reg[R2] - reg[R1];
        return reg[R2];
    }
    
    //	Logically ANDs the contents of register RRR1 into RRR2 (result in RRR2)
    public int and(int R1, int R2){  
        
       
       reg[R2] = reg[R1] & reg[R2];
       return reg[R2];
    }
    
    //Copies the contents of register RRR1 to RRR2
    public void copy(int R1, int R2){
        reg[R2] = reg[R1];
    }
    
    //	Loads the contents of location addressed by RRR2 into register RRR1
    public void load(int R1, int R2){
        
    }
    
    //  Stores the contents of register RRR1 into location addressed by RRR2
    public void store(int R1, int R2){
        
    }
    
    //  Reads a value (up to 12 bits) into register RRRR from device DDDD
    public void read(int RR, String Device){
        IOD.device(RR, Device);
        System.out.println(RR);
    }
    
    //  Writes a value (up to 12 bits) from register RRRR to device DDDD
    public void write(int RR, String Device){
        IOD.device(RR, Device);
    }
    
    //  If contents of RRRR meet condition CC, jump to address in JJ
    public void JPIF(int RR){
        
    }
    
    //  Jump directly to the location whose address is AAAA AAAA
    public void jump(){
        int AA;
    }
}
