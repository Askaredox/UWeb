package Arbol;
/*
 * @author ASKAR
 */
import java.util.LinkedList;
public class Arbol implements Instruccion{
    private final LinkedList<Instruccion> instucciones;
    public String HTML;
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
        for(Instruccion ins:instucciones){
            HTML+="<HTML>\n";
            if(ins instanceof Titulo){
                HTML+="<HEAD>\n";
                HTML+=ins.ejecutar(ts, ar).toString();
                HTML+="</HEAD>\n";
            }
            else if(ins instanceof Cuerpo){
                HTML+="<BODY>\n";
                HTML+=ins.ejecutar(ts, ar).toString();
                HTML+="</BODY>\n";
            }
            HTML+="</HTML>\n";
            
        }
        return HTML;
    }
}