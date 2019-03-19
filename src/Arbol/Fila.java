package Arbol;
/*
 * @author ASKAR
 */
import java.util.LinkedList;
public class Fila implements Instruccion{
    LinkedList<Instruccion> columnas;

    public Fila(LinkedList<Instruccion> columnas) {
        this.columnas = columnas;
    }

    @Override
    public Object ejecutar(TablaSimbolos ts, Arbol ar) {
        String ss="<tr>\n";
        for(Instruccion ins:columnas){
            ss+=ins.ejecutar(ts, ar);
        }
        ss+="</tr>\n";
        return ss;
    }
    
}
