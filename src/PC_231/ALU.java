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

    IOdevice IOD = new IOdevice();
    
    //Halts the machine
    public void Halt(){
        System.exit(0);
    }
    
    //	Zeroes (or "clears") out register RRRR
    public void zero(int RR){
        RR = 0;
    }
    
    //	Sets the 4 lowest-order bits of register RRRR to BBBB
    public int set(int RR, int BB){
//        for(int i=RR.length; i>RR.length-4; i--){
//            int j = 0;
//            RR[i] = BB[j]; //change details later
//            j++;
//        }
        return RR;
        
    }
    
    //	Clears the data register DR, then sets its 8 lowest-order bits
    public void data(int B1, int B2){
        B1 = 0;
        // set 8 lowest order bits
    }
    
    //	Adds or subtracts from 1 to 8 from register RRRR
    public void INC(int RR, int NN){
        
    }
    
    //Shifts register RRRR left (-) or right (+) by from 1 to 8 bits
    public void Shift(int RR, int NN){
       RR = RR >> NN;
    }
    
    //Adds the contents of register RRR1 to RRR2 (result in RRR2)
    public int add(int R1, int R2){
        R2 = R2 + R1;
        return R2;
    }
    
    //	Subtracts the contents of register RRR1 from RRR2 (result in RRR2) 
    public int sub(int R1, int R2){
        R2 = R2 -R1;
        return R2;
    }
    
    //	Logically ANDs the contents of register RRR1 into RRR2 (result in RRR2)
    public int and(int R1, int R2){      
       R2 = R1 & R2;
       return R2;
    }
    
    //Copies the contents of register RRR1 to RRR2
    public void copy(int R1, int R2){
        R2 = R1;
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
        
    }
}
