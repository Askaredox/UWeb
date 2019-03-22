package Arbol;
/*
 * @author ASKAR
 */
import java.util.LinkedList;
public class Arbol implements Instruccion{
    private final LinkedList<Instruccion> instucciones;
    public String HTML;
    private String console="";

    public void setConsole(String console) {
        this.console+= console;
    }

    
    public Arbol(LinkedList<Instruccion> a){
        instucciones=a;
        HTML="";
    }
    
    @Override
    public Object ejecutar(TablaSimbolos ts, Arbol ar){
        
        for(Instruccion ins:instucciones){
            if(ins instanceof Script){
                for(Instruccion i:((Script) ins).instrucciones){
                    if(i instanceof Declaracion){
                        Declaracion d= (Declaracion)i;
                        d.ejecutar(ts, ar);
                        break;
                    }
                }
            }
            
        }
        HTML+="<HTML>\n";
        for(Instruccion ins:instucciones){
            if(ins instanceof Titulo){
                HTML+="<HEAD>\n";
                HTML+=ins.ejecutar(ts, ar).toString();
                HTML+="</HEAD>\n";
            }
            else if(ins instanceof Cuerpo){
                HTML+=ins.ejecutar(ts, ar).toString();
            }
        }
        HTML+="</HTML>\n";
        return HTML;
    }
    public String getConsole() {
        return console;
    }
}
