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
public class Sim231 {
    
   ALU ALU = new ALU();

   String str;
   
 public String parse(String str){ //split into blocks of 3 chars
     String instr = "some string";
     return instr;
 }
   
 public void run(String instruction){ //two or three char instructions
     
        char input = instruction.charAt(0);
        int r1 = instruction.charAt(1);
        int aa = instruction.charAt(1);
        int r2 = instruction.charAt(2);
        int bb = instruction.charAt(2);
        int nn = instruction.charAt(2);
        int device= instruction.charAt(3); //last 2 chars
        
        switch (input) {
            case '0':  ALU.Halt();
                     break;
            case '1':  ALU.zero(r1);
                     break;
            case '2': ALU.set(r1,bb);
                     break;
            case '3':  ALU.data(r1, bb);
                     break;
            case '4':  ALU.INC(r1,nn);
                     break;
            case '5':  ALU.Shift(r1,nn);
                     break;
            case '6':  ALU.add(r1, r2);
                     break;
            case '7': ALU.sub(r1, r2);
                     break;
            case '8':  ALU.and(r1, r2);
                     break;
            case '9':  ALU.copy(r1, r2);
                     break;
            case 'A': ALU.load(r1, r2);
                     break;
            case 'B': ALU.store(r1, r2);
                     break;
            case 'C': ALU.read(r1, device);
                     break;
            case 'D': ALU.write(r1, device);
                     break;
            case 'E': ALU.JPIF(r1);
                     break;
            case 'F': ALU.jump();
                     break;
            default: System.out.println("Invalid input");;
                     break;
        }
        System.out.println(input);
  
 }
      
    
}
