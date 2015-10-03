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
public class Paciente implements Comparable
{
    private String firstName, lastName;
    
    public int compareTo (Object other)
    {
        int result;

        String otherFirst = ((Paciente)other).getFirstName();
        String otherLast = ((Paciente)other).getLastName();

        if (lastName.equals(otherLast))
           result = firstName.compareTo(otherFirst);
        else
           result = lastName.compareTo(otherLast);

        return result;
    }   
    
    public String getFirstName ()
    {
       return firstName;
    }

    public String getLastName ()
    {
       return lastName;
    }
}
