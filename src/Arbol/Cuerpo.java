package Arbol;
/*
 * @author ASKAR
 */
import java.util.LinkedList;
public class Cuerpo implements Instruccion{
    public String fondo;
    public LinkedList<Instruccion> instrucciones;
    public Cuerpo(String f,LinkedList<Instruccion>i){
        if(!f.matches("#[0-9a-fA-F]{6}")){
            switch(f.toLowerCase()){
                case "azul":f="blue";break;
                case "rojo":f="red";break;
                case "amarillo":f="yellow";break;
                case "verde":f="green";break;
                case "naranja":f="orange";break;
                case "morado":f="purple";break;
            }
        }
        fondo="<BODY BGCOLOR=\""+f+"\">\n";
        instrucciones=i;
    }
    public Cuerpo(LinkedList<Instruccion>i){
        fondo="<BODY>\n";
        instrucciones=i;
    }
    @Override
    public Object ejecutar(TablaSimbolos ts,Arbol ar){
        String s=fondo;
        for(Instruccion in:instrucciones){
            s+=in.ejecutar(ts, ar).toString();
        }
        s+="</BODY>\n";
        return s;
    }
}
