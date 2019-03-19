package Arbol;
/*
 * @author ASKAR
 */
import java.util.LinkedList;
public class Imagen implements Instruccion{
    String cad;
    String path="";
    String ancho="";
    String alto="";

    public Imagen(LinkedList<String> es) {
        for(String ss:es){
            switch(ss.charAt(0)){
                case '1':path=ss.substring(1);break;
                case '2':ancho=ss.substring(1);break;
                case '3':alto=ss.substring(1);break;
            }
        }
        cad="<img";
        if(path!=""){
            cad+=" src=\""+path+"\"";
        }
        if(alto!=""){
            cad+=" height=\""+alto+"\"";
        }
        if(ancho!=""){
            cad+=" width=\""+ancho+"\"";
        }
        cad+=">";
    }
    @Override
    public Object ejecutar(TablaSimbolos ts, Arbol ar) {
        return cad;
    }
    
}
