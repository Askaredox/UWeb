package Arbol;
/*
 * @author ASKARS
 */
public class Boton implements Instruccion{
    String id;
    String texto;

    public Boton(String id, String texto) {
        this.id = id;
        this.texto = texto;
        
    }

    @Override
    public Object ejecutar(TablaSimbolos ts, Arbol ar) {
        return "<input type=\"button\" onclick=\""+id+"()\" value=\""+texto+"\">\n";
    }
    
    
}
