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
    
   CPU CPU = new CPU();
   
   ALU ALU = new ALU();

   int r =0;
   String str;
   
 public void run(String instruction){ //two or three char instructions
     
        char input = instruction.charAt(0);
        
        switch (input) {
            case '0':  ALU.Halt();
                     break;
            case '1':  ALU.zero(r);
                     break;
            case '2': ALU.set(r,r);
                     break;
            case '3':  ALU.data(r, r);
                     break;
            case '4':  ALU.INC(r,r);
                     break;
            case '5':  ALU.Shift(r,r);
                     break;
            case '6':  ALU.add(r, r);
                     break;
            case '7': ALU.sub(r, r);
                     break;
            case '8':  ALU.and(r, r);
                     break;
            case '9':  ALU.copy(r, r);
                     break;
            case 'A': ALU.load(r, r);
                     break;
            case 'B': ALU.store(r, r);
                     break;
            case 'C': ALU.read(r, str);
                     break;
            case 'D': ALU.write(r, str);
                     break;
            case 'E': ALU.JPIF(r);
                     break;
            case 'F': ALU.jump();
                     break;
            default: System.out.println("Invalid input");;
                     break;
        }
        System.out.println(input);
  
 }
      
    
}
