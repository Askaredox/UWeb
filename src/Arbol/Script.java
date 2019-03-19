package Arbol;
/*
 * @author ASKAR
 */
import java.util.LinkedList;
public class Script implements Instruccion{
    LinkedList<Instruccion> instrucciones;

    public Script(LinkedList<Instruccion> instrucciones) {
        this.instrucciones = instrucciones;
    }

    @Override
    public Object ejecutar(TablaSimbolos ts, Arbol ar) {
        String ss="";
        for(Instruccion ins:instrucciones){
            ss+=ins.ejecutar(ts, ar);
        }
        return ss;
    }
    
}
