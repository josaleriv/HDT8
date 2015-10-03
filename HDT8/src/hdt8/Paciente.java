/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt8;

/**
 *Clase Paciente, tiene variables de codigo nombre y sintoma 
 * @author joserivera
 */
public class Paciente implements Comparable<Paciente>
{    
    protected String codigo,

    /**
     *
     */

    /**
     *
     */
    nombre,

    /**
     *
     */

    /**
     *
     */
    sintoma;
    
    /**
     *
     * @param nombre
     * @param sintoma
     * @param codigo
     */
    public Paciente(String nombre, String sintoma, String codigo){
        this.nombre=nombre;
        this.sintoma=sintoma;
        this.codigo=codigo;
    }
    @Override
    public int compareTo(Paciente p){
        Paciente enfermo = (Paciente)p;
        return codigo.compareTo(enfermo.getCodigo());
    }
    
    /**
     *Conv
     * @return
     */
    public String getCodigo(){
        return codigo;
    }
    
    public String toString(){
        return (nombre+", "+sintoma+", "+codigo);
    }
}
