package Arbol;
/*
 * @author ASKAR
 */
import java.util.LinkedList;
public class Espacio implements Instruccion{

    private LinkedList<Instruccion> instrucciones;

    public Espacio(LinkedList<Instruccion> instrucciones) {
        this.instrucciones = instrucciones;
    }

    @Override
    public Object ejecutar(TablaSimbolos ts, Arbol ar) {
        String ss="<div>\n";
        for(Instruccion ins:instrucciones){
            ss+=ins.ejecutar(ts, ar);
        }
        ss+="</div>\n";
        return ss;
    }
}
