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
    int program_counter = reg[15];
    int[] ram = new int[256];
    
    IOdevice IOD = new IOdevice();
    
    public int p2j(int i){ //convert pc-231 int to java int 
        
        (i >= 2048 ?-1:1) * (i%2048);
        int javaInt = 0; 
        javaInt = i | javaInt;
        return javaInt;
    }
    
    public int j2p(int i){ //convert java int to pc-231 int
        int pcInt = i & 0x7ff; //bitmasking
        return pcInt;
    }
    
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
        //set lower 4 bits by pushing them off the end
        int shiftedbit = reg[RR] >> 4;
        shiftedbit = shiftedbit << 4; //shift it back left 4
        int newbit = shiftedbit|BB; //assign new value
        return newbit;
        
    }
    
    //	Clears the data register DR, then sets its 8 lowest-order bits
    public void data(int B1, int B2){
        reg[B1] = 0; //clear
//        int shiftedbit = reg[B1] >> 8;
//        shiftedbit = shiftedbit << 8;
        
        // set 8 lowest order bits
        int newbit = reg[B1]|B2;
    }
    
    //	Adds or subtracts from 1 to 8 from register RRRR
    public int INC(int RR, int NN){ //increment
        int javaRR = p2j(reg[RR]);
        int javaNN = p2j(NN);
        reg[RR] = javaRR-javaNN;
        return reg[RR];
    }
    
    //Shifts register RRRR left (-) or right (+) by from 1 to 8 bits
    public int Shift(int RR, int NN){
       reg[RR] = reg[RR] >> NN;
       return reg[RR];
    }
    
    //Adds the contents of register RRR1 to RRR2 (result in RRR2)
    public int add(int R1, int R2){
        int java1 = p2j(reg[R1]);
        int java2 = p2j(reg[R2]);
        int ans = j2p(java1 + java2);
        reg[R2] = ans;
        return reg[R2];
    }
    
    //	Subtracts the contents of register RRR1 from RRR2 (result in RRR2) 
    public int sub(int R1, int R2){
        int java1 = p2j(reg[R1]);
        int java2 = p2j(reg[R2]);
        int ans = j2p(java1 - java2);
        reg[R2] = ans;
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
        int address = reg[R2];
        reg[R1] = ram[address];
    }
    
    //  Stores the contents of register RRR1 into location addressed by RRR2
    public void store(int R1, int R2){
        int address = reg[R2];
        ram[address] = reg[R1] ;
    }
    
    //  Reads a value (up to 12 bits) into register RRRR from device DDDD
    public void read(int RR, int Device){
        IOD.device(RR, Device);
        System.out.println(RR);
    }
    
    //  Writes a value (up to 12 bits) from register RRRR to device DDDD
    public void write(int RR, int Device){
        IOD.device(RR, Device);
    }
    
    public boolean nz(int i){
        return i !=0;
    }
    public boolean ez(int i){
        return i == 0;
    }
    
    public boolean gz(int i){
        return i > 0;
    }
    
    public boolean lz(int i){
        return i < 0;
    }
    
    public boolean compare(int booltype, int i){
        boolean ans = false;
        switch (booltype) {
            case 0:  ans = lz(i); 
                    break;
            case 1: ans = gz(i);
                    break;
            case 2: ans = ez(i);
                    break;
            case 3: ans = nz(i);
        }
        return ans;
    }
    
    //  If contents of RRRR meet condition CC, jump to address in JJ
    public void JPIF(int RR, int booltype, int JJ){
        boolean bool = compare(booltype, reg[RR]);
        if(bool){ //if above condition is met
            program_counter = reg[RR];
        }
    }
    
    //  Jump directly to the location whose address is AAAA AAAA
    public int jump(int A1, int A2){ //sets program counter
        program_counter = reg[A1];
        return ram[program_counter];
    }
}
