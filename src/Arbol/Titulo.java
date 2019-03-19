package Arbol;
/*
 * @author ASKAR
 */
public class Titulo implements Instruccion{
    String titulo;
    public Titulo(String titulo){
        this.titulo="<TITLE>"+titulo+"</TITLE>\n";
    }
    @Override
    public Object ejecutar(TablaSimbolos ts, Arbol ar){
        return titulo;
    }
}
