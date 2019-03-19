package Arbol;
/*
 * @author ASKAR
 */
import java.util.LinkedList;
public class TextoB implements Instruccion{
    
    private final LinkedList<Instruccion> instrucciones;

    public TextoB(LinkedList<Instruccion> instrucciones) {
        this.instrucciones = instrucciones;
    }

    @Override
    public Object ejecutar(TablaSimbolos ts, Arbol ar) {
        String ss="<H4>\n";
        for(Instruccion ins:instrucciones){
            ss+=ins.ejecutar(ts, ar);
        }
        ss+="</H4>\n";
        return ss;
    }
}
