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
   
   int[] r1 = CPU.register();
   
 public void run(){
     
        char input = '0';
        
        switch (input) {
            case '0':  ALU.Halt();
                     break;
            case '1':  ALU.zero(r1);
                     break;
            case '2': ALU.set(r1,r1);
                     break;
            case '3':  ALU.data(r1, r1);
                     break;
            case '4':  ALU.INC(r1);
                     break;
            case '5':  ALU.Shift(r1);
                     break;
            case '6':  ALU.add(r1, r1);
                     break;
            case '7': ALU.sub(r1, r1);
                     break;
            case '8':  ALU.and(r1, r1);
                     break;
            case '9':  ALU.copy(r1, r1);
                     break;
            case 'A': ALU.load(r1, r1);
                     break;
            case 'B': ALU.store(r1, r1);
                     break;
            case 'C': ALU.read(r1);
                     break;
            case 'D': ALU.write(r1);
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
