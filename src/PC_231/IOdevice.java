/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PC_231;

import java.util.Scanner;

/**
 *
 * @author ElizabethReed PC
 */
public class IOdevice {

    Scanner kb = new Scanner(System.in);

    //modes of output    
    public void device(int device) {

        switch (device) {
            case 0: //dd
                dd();
                break;
            case 1: //hd
                hd();
                break;
            case 2: //ad
                ad();
                break;
            default:
                System.out.println("Not a valid input");
        }
    }

    public int dd() {
        System.out.println("Please enter in a decimal number: ");
        int dec = kb.nextInt();
        return dec;
    }

    public char hd() {
        System.out.println("Please enter in a hex number: ");
        String hexString = kb.next();
        char hex = hexString.charAt(0);
        return hex;
    }

    public char ad() {
        System.out.println("Please enter in a character: ");
        String user_input = kb.next();
        char ascii = user_input.charAt(0);
        return ascii;
    }
}
