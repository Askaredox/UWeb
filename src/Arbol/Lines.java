package Arbol;

import java.util.LinkedList;

/*
 * @author ASKAR
 */
public class Lines implements Instruccion{
    LinkedList<Instruccion> ins;

    public Lines(LinkedList<Instruccion> ins) {
        this.ins = ins;
    }

    @Override
    public Object ejecutar(TablaSimbolos ts, Arbol ar) {
        String ss="";
        for(Instruccion i:ins){
            ss+="<tr>\n"+i.ejecutar(ts, ar).toString()+"</tr>\n";
        }
        return ss;
    }
    
}
