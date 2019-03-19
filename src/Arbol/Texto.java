package Arbol;
/*
 * @author ASKAR
 */
public class Texto implements Instruccion{
    String text;

    public Texto(String text) {
        this.text = text+"\n";
    }
    public Object ejecutar(TablaSimbolos ts,Arbol ar){
        return text;
    }
}
