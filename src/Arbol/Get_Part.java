package Arbol;
/*
 * @author ASKAR
 */
public class Get_Part implements Instruccion{
    private final String id;
    private final Accion accion;

    public Get_Part(Accion accion,String id) {
        this.id = id;
        this.accion = accion;
    }

    @Override
    public Object ejecutar(TablaSimbolos ts, Arbol ar) {
        Objeto o=ts.getObjeto(id);
        switch(accion){
            case GET_ALI:
                return o.getAlineacion();
            case GET_C:
            case GET_T:
                return o.getContenido();
            case GET_P:
                return o.getPath();
            case GET_AN:
                return o.getAncho();
            case GET_AL:
                return o.getAlto();
            case GET_B:
                return o.getBorde();
        }
        return "";
    }
    
    
    public static enum Accion{
        GET_ALI,
        GET_C,
        GET_P,
        GET_AN,
        GET_AL,
        GET_B,
        GET_T
    }
}
