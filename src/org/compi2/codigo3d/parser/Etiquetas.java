
package org.compi2.codigo3d.parser;

import org.compi2.codigo3d.Inicio;

/**
 *
 * @author Jherson
 */
public class Etiquetas {
    private  String eTrue;
    private  String eFalse;
    private String c3d;

    public Etiquetas() {
        this.eTrue="";
        this.eFalse="";
        this.c3d="";
    }

    public Etiquetas(String cad){
        this.eTrue="";
        this.eFalse="";
        this.c3d=cad;
    }
    public String geteTrue() {
        return eTrue;
    }

    public void seteTrue(String eTrue) {
        this.eTrue = eTrue;
    }

    public String geteFalse() {
        return eFalse;
    }
    public void imprimirIF(String e1, String e2,String e3){
        System.out.println("if "+e1+" goto " +e2+"\n"+"goto "+e3+"\n");
        ControlC3D.concatenar("if "+e1+" goto " +e2+"\n"+"goto "+e3+"\n");
    }

    public void seteFalse(String eFalse) {
        this.eFalse = eFalse;
    }
    
    public void concatenarTrue(String cad){
        this.eTrue+=","+cad;
    }
    public void concatenarFalse(String cad){
        this.eFalse+=","+cad;
    }
    
    public String retonarC3D(){
        return this.c3d;
    }
}
