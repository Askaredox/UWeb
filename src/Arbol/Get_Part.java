package Arbol;
/*
 * @author ASKAR
 */
public class Get_Part implements Instruccion{
    private String id;
    private Accion accion;

    public Get_Part(Accion accion,String id) {
        this.id = id;
        this.accion = accion;
    }

    @Override
    public Object ejecutar(TablaSimbolos ts, Arbol ar) {
        switch(accion){
            case CRE_PARR1:
                ts.addParrafo(id, (String)ins1.ejecutar(ts, ar), (String)ins2.ejecutar(ts, ar));
                break;
            case CRE_PARR2:
                ts.addParrafo(id, (String)ins1.ejecutar(ts, ar));
                break;
        }
        return "";
    }
    
    
    public static enum Accion{
        GET_A,
        GET_C
    }
}
