package Arbol;
/*
 * @author ASKAR
 */
import java.util.LinkedList;
public class Parrafo implements Instruccion{
    String align;
    private final LinkedList<Instruccion> instrucciones;

    public Parrafo(String a,LinkedList<Instruccion> i) {
        align="<p align=\"";
        switch(a.toLowerCase()){
            case "izquierda": align+="left\">\n"; break;
            case "derecha": align+="right\">\n"; break;
            case "centrado": align+="center\">\n"; break;
            case "justificado": align+="justify\">\n"; break;
        }
        instrucciones=i;
    }
    public Parrafo(LinkedList<Instruccion> i) {
        align="<p>\n";
        instrucciones=i;
    }
    @Override
    public Object ejecutar(TablaSimbolos ts, Arbol ar){
        String ss=align;
        for(Instruccion ins:instrucciones){
            ss+=ins.ejecutar(ts, ar);
        }
        ss+="</p>\n";
        return ss;
    }
}
