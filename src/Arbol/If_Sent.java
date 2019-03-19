package Arbol;
/*
 * @author ASKAR
 */
import java.util.LinkedList;
public class If_Sent implements Instruccion{
    Instruccion condicion;
    LinkedList<Instruccion> Ifs;
    LinkedList<Instruccion> Elses;
    
    public If_Sent(Instruccion condicion, LinkedList<Instruccion> Ifs, LinkedList<Instruccion> Elses) {
        this.condicion=condicion;
        this.Ifs = Ifs;
        this.Elses = Elses;
    }
    public If_Sent(Instruccion condicion, LinkedList<Instruccion> Ifs) {
        this.condicion=condicion;
        this.Ifs = Ifs;
    }

    @Override
    public Object ejecutar(TablaSimbolos ts, Arbol ar) {
        Boolean c=((condicion==null)?false:(Boolean)condicion.ejecutar(ts, ar));
        String ss="";
        if (c) 
            for(Instruccion ins:Ifs)
                ss+=ins.ejecutar(ts, ar);
        else if(Elses!=null)
            for(Instruccion ins:Elses)
                ss+=ins.ejecutar(ts, ar);
        return ss;
    }
    
}
