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
public class Asignacion {

    private Estudiante lista_estudiantes[];
    private double notas_matematicas[];
    private double notas_sociales[];
    private double promedio_e[];

    public Asignacion(Estudiante le[], double nm[], double ns[], double pe[]) {
        setLista_estudiantes(le);
        setNotas_matematicas(nm);
        setNotas_sociales(ns);
        setPrimedio_e(pe);
    }

    public Asignacion() {
    }

    public Estudiante[] getLista_estudiantes() {
        return lista_estudiantes;
    }

    public void setLista_estudiantes(Estudiante le[]) {
        lista_estudiantes = le;
    }

    public double[] getPrimedio_e() {
        return promedio_e;
    }

    public void setPrimedio_e(double pe[]) {
        promedio_e = pe;
    }

    public double[] getNotas_matematicas() {
        return notas_matematicas;
    }

    public void setNotas_matematicas(double nm[]) {
        notas_matematicas = nm;
    }

    public double[] getNotas_sociales() {
        return notas_sociales;
    }

    public void setNotas_sociales(double ns[]) {
        this.notas_sociales = ns;
    }

    public String lista_estudiantes() {
        String n = "";
        Estudiante[] areglo = getLista_estudiantes();
        for (int i = 0; i < areglo.length; i++) {
            n += areglo[i].toString();

        }
        return n;
    }

    public String notas_matematicas() {
        String n = "";
        notas_matematicas = getNotas_matematicas();
        for (double nota_mate : getNotas_matematicas()) {

        }
        return n;
    }

    public String notas_sociales() {
        String n = "";
        notas_sociales = getNotas_sociales();
        for (double nota_sociales : getNotas_sociales()) {

        }
        return n;
    }

    @Override
    public String toString() {
        return String.format("%s"
                + "%s"
                + "%s", lista_estudiantes(),
                notas_matematicas(), notas_sociales());
    }
}
