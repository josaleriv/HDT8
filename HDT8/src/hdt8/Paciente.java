
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
     *se crean los variables que tiene cada paciente (strings) 
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
     *Se utiliza para traer el codigo los cuales se comparan para determinar prioridad
     * @return
     */
    public String getCodigo(){
        return codigo;
    }
    
    public String toString(){
        return (nombre+", "+sintoma+", "+codigo);
    }
}
