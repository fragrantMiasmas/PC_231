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
   
 public int char2int(char input){ //char to ascii
         
         int digit = (int) input;
         if(digit >= 48 && digit <= 57)
            digit = digit - 48; //only accounts for digits 0-9
         else if(digit >= 65 && digit <= 90){
             digit = digit - 55; //capitol letters
         }
         else
             System.out.println("Out of range!");
         return digit;
    }   
 public void run(String instruction){ //two or three char instructions
     
        char input = instruction.charAt(0);
        int secondHex = char2int(instruction.charAt(1));
        int thirdHex = char2int(instruction.charAt(2));

        
        switch (input) {
            case '0':  ALU.Halt();
                     break;
            case '1':  ALU.zero(secondHex);
                     break;
            case '2': ALU.set(secondHex,secondHex);
                     break;
            case '3':  
                     ALU.data(secondHex, thirdHex);
                     break;
            case '4':  ALU.INC(secondHex,thirdHex);
                     break;
            case '5':  ALU.Shift(secondHex,thirdHex);
                     break;
            case '6':  ALU.add(secondHex, thirdHex);
                     break;
            case '7': ALU.sub(secondHex, thirdHex);
                     break;
            case '8':  ALU.and(secondHex, thirdHex);
                     break;
            case '9':  ALU.copy(secondHex, thirdHex);
                     break;
            case 'A': ALU.load(secondHex, thirdHex);
                     break;
            case 'B': ALU.store(secondHex, thirdHex);
                     break;
            case 'C': ALU.read(secondHex, thirdHex);
                     break;
            case 'D': ALU.write(secondHex, thirdHex);
                     break;
            case 'E': ALU.JPIF(secondHex, thirdHex, thirdHex);
                     break;
            case 'F': ALU.jump(secondHex, thirdHex);
                     break;
            default: System.out.println("Invalid input");;
                     break;
        }
//        System.out.println(instruction);
  
 }
      
    
}
