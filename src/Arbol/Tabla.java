package Arbol;
/*
 * @author ASKAR
 */
import java.util.LinkedList;
public class Tabla implements Instruccion{
    LinkedList<Instruccion> filas;
    String borde="";
    public Tabla(LinkedList<Instruccion> filas) {
        this.filas = filas;
    }

    public Tabla(Boolean b,LinkedList<Instruccion> filas) {
        if(b)
            borde=" border=\"2px\"";
        this.filas = filas;
    }

    @Override
    public Object ejecutar(TablaSimbolos ts, Arbol ar) {
        String ss="<table style=\"width:100%\""+borde+">\n";
        for(Instruccion ins:filas){
            ss+=ins.ejecutar(ts, ar);
        }
        ss+="</table>";
        return ss;
    }
    
    
}
