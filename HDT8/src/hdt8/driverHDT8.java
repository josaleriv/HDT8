/*
 * Main, donde se lee el archivo y se imprime la lista de pacientes en orden
 */
package hdt8;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.PriorityQueue;
/**
 *se importan las librerias necesarias 
 * @author joserivera
 */
public class driverHDT8 {

    /**
     * main del programa, se utilizan las clases proprityqueue (interfaz) y vectorheap
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("\nBienvenido\n\n");
        File pacientes = new File("pacientes.txt");
        //Se crean todos los objetos
        VectorHeap heap = new VectorHeap();
        PriorityQueue<Paciente> queue = new PriorityQueue();
        Paciente paciente;
	String [] dato;
        try{
            BufferedReader br = new BufferedReader(new FileReader(pacientes));//se lee el .txt y se separa el string en varios strings los cuales se guaradan como objetos
            System.out.println("Lista sin ordenar:\n");
            try {
                for(String line; (line = br.readLine()) != null;){
                    System.out.println("   "+line);
                    dato= line.split(",");
                    paciente= new Paciente(dato[0],dato[1],dato[2]);
                    heap.add((Comparable) paciente);
                    queue.add(paciente);
                }
            }
            catch(IOException ex) {
                Logger.getLogger(driverHDT8.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("\nLista ordenada con heap:\n");
            int x = 4;
            while(x !=0){
                System.out.println("   "+heap.remove().toString());//se imprime la lista ordenada con heap
		x--;
            }
            System.out.println("\nLista ordenada con JCF:\n");
            int y = 4;
            while(y !=0){
                System.out.println("   "+queue.remove().toString());//lista ordenada con JCF
		y--;
            }
        }
        catch(FileNotFoundException ex) {
            Logger.getLogger(driverHDT8.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
