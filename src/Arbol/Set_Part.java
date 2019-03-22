package Arbol;
/*
 * @author ASKAR
 */
public class Set_Part implements Instruccion{
    private final String id;
    private final Accion accion;
    private final Instruccion ins;

    public Set_Part(Accion accion,String id,Instruccion ins) {
        this.id = id;
        this.accion = accion;
        this.ins=ins;
    }

    @Override
    public Object ejecutar(TablaSimbolos ts, Arbol ar) {
        String ss=ins.ejecutar(ts, ar).toString();
        Objeto o=ts.getObjeto(id);
        switch(accion){
            case SET_ALI:
                o.setAlineacion(ss);
                break;
            case SET_C:
            case SET_T:
                o.setContenido(ss);
                break;
            case SET_P:
                o.setPath(ss);
                break;
            case SET_AN:
                o.setAncho(ss);
                break;
            case SET_AL:
                o.setAlto(ss);
                break;
            case SET_B:
                o.setBorde(("true".equals(ss.toLowerCase())));
                break;
            case SET_CLI:
                String OwO="<script> function "+o.getNombre()+"() { alert(\""+ss+"\"); } </script>\n";
                return OwO;
        }
        return "";
    }
    
    
    public static enum Accion{
        SET_ALI,
        SET_C,
        SET_P,
        SET_AN,
        SET_AL,
        SET_B,
        SET_T,
        SET_CLI
    }
}
