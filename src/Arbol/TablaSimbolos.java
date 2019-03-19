package Arbol;
/*
 * @author ASKAR
 */
import java.util.LinkedList;
public class TablaSimbolos extends LinkedList<Simbolo>{
    public TablaSimbolos(){
        super();
    }
    public Object getValor(String id){
        for(Simbolo s:this){
            if(s.getId().equals(id)){
                return s.getValor();
            }
        }
        return null;
    }
    public void setValor(String id, Object valor){
        for(Simbolo s:this){
            if(s.getId().equals(id)){
                s.setValor(valor);
            }
        }
    }
    public String getTipo(String id){
        for(Simbolo s:this){
            if(s.getId().equals(id)){
                return s.getTipo();
            }
        }
        return null;
    }
    public boolean inDB(String id){
        for(Simbolo s:this)
            if(s.getId().equals(id))
                return true;
        return false;
    }
}
