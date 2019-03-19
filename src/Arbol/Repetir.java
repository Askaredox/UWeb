package Arbol;
/*
 * @author ASKAR
 */
import java.util.LinkedList;
public class Repetir implements Instruccion{
    Instruccion condicion;
    LinkedList<Instruccion> rep;

    public Repetir(Instruccion condicion, LinkedList<Instruccion> rep) {
        this.condicion = condicion;
        this.rep = rep;
    }

    @Override
    public Object ejecutar(TablaSimbolos ts, Arbol ar) {
        String ss="";
        Integer e=(condicion==null)?0:(Integer)condicion.ejecutar(ts, ar);
        for(int i=0;i<e;i++){
            for(Instruccion ins:rep)
                ss+=ins.ejecutar(ts, ar);
        }
        return ss;
    }
    
}
