/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author crsyhian
 */
public class Estudiante {

    private String nombre;
    private String apellido;

    public Estudiante() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
        nombre = n;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String a) {
        apellido = a;
    }

    public String toString() {
        String c = String.format("%s %s", getNombre(), getApellido());
        return c;
    }

}
