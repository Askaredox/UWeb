package Arbol;
/*
 * @author ASKAR
 */
import java.util.LinkedList;
public class Cols implements Instruccion{
    LinkedList<Instruccion> ins;

    public Cols(LinkedList<Instruccion> ins) {
        this.ins = ins;
    }

    @Override
    public Object ejecutar(TablaSimbolos ts, Arbol ar) {
        String ss="";
        for(Instruccion i:ins){
            ss+="<td>"+i.ejecutar(ts, ar).toString()+"</td>\n";
        }
        return ss;
    }
    
}
