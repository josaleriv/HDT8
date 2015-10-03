/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt8;

/**
 *
 * @author joserivera
 */
public class Paciente implements Comparable<Paciente>
{    
    protected String codigo;
    
    public String getCodigo(){
        return this.codigo;
    }
    public String toString(String nombre, String sintoma, String codigo){
        return (nombre+", "+sintoma+", "+codigo);
    }
    
    @Override
    public int compareTo(Paciente p){
        Paciente enfermo = (Paciente)p;
        return codigo.compareTo(enfermo.getCodigo());
    }
}
