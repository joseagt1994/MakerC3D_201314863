    package org.compi2.codigo3d.parser;

/**
 *
 * @author jherson
 */
public class ControlC3D {
    
    private static int temp = 0;
    private static String c3d = "";
    private static int eti=0;
    private static String etiquetas="";
    /**
     * Reinicia las variables estáticas relacionadas con la generación del
     * código de tres direcciones.
     */
    public static void reiniciar(){
        temp = 0;
        c3d = "";
        eti=0;
        etiquetas="";
    }
    
    /**
     * Genera el siguiente temporal.
     * @return El siguiente temporal (t$#)
     */
    public static String generaTemp(){
        return "t$"+temp++;
    }
    
    public static void concatenar(String cad){
        etiquetas+=cad;
    }
    public static String retonarLabel(){
        return etiquetas;
    }
    
    public static String generaEti(){
        return "L" + eti++;
    }
    /**
     * Agrega la sentencia que recibe como parámetro a la cadena de código
     * de tres direcciones que se va generando hasta ese momento.
     * @param sentencia Código 3D a agregar
     */
    public static void agregarC3D(String sentencia){
        c3d += sentencia;
    }
    
    /**
     * Devuelve el código 3D generao hasta el momento de su invocación.
     * @return Código 3D generado
     */
    public static String getC3D(){
        return c3d;
    }
    
    public static void vaciarC3D(){
        c3d="";
    }
}
