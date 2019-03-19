package Arbol;
/*
 * @author ASKAR
 */
import java.util.LinkedList;
public class Columna implements Instruccion{
    LinkedList<Instruccion> instrucciones;

    public Columna(LinkedList<Instruccion> instrucciones) {
        this.instrucciones = instrucciones;
    }

    @Override
    public Object ejecutar(TablaSimbolos ts, Arbol ar) {
        String ss="<td>\n";
        for(Instruccion ins:instrucciones){
            ss+=ins.ejecutar(ts, ar);
        }
        ss+="</td>\n";
        return ss;
    }
    
}
