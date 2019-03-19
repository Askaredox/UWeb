package Arbol;
/*
 * @author ASKAR
 */
import java.util.LinkedList;
public class TextoA implements Instruccion{
    
    private final LinkedList<Instruccion> instrucciones;

    public TextoA(LinkedList<Instruccion> instrucciones) {
        this.instrucciones = instrucciones;
    }

    @Override
    public Object ejecutar(TablaSimbolos ts, Arbol ar) {
        String ss="<H2>\n";
        for(Instruccion ins:instrucciones){
            ss+=ins.ejecutar(ts, ar);
        }
        ss+="</H2>\n";
        return ss;
    }
}
