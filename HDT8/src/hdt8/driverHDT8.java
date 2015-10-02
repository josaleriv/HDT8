/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt8;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author joserivera
 */
public class driverHDT8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("\nBienvenido\n\n");
        File pacientes = new File("pacientes.txt");
        try{
            BufferedReader br = new BufferedReader(new FileReader(pacientes));
            System.out.println("Lista sin ordenar:");
            try {
                for(String line; (line = br.readLine()) != null; ){
                    System.out.println("    "+line);
                }
            }
            catch(IOException ex) {
                Logger.getLogger(driverHDT8.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        catch(FileNotFoundException ex) {
            Logger.getLogger(driverHDT8.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
