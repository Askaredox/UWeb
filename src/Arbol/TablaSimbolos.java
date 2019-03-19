package Arbol;
/*
 * @author ASKAR
 */
import java.util.LinkedList;
public class TablaSimbolos extends LinkedList<Simbolo>{
    LinkedList<Objeto> TO;
    public TablaSimbolos(){
        super();
        TO=new LinkedList<>();
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
    /*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
    public boolean inDBO(String id){
        for(Objeto s:TO)
            if(s.getId().equals(id))
                return true;
        return false;
    }
    
    public void addParrafo(String id, String cont){
        Objeto parr=new Objeto(Objeto.Tipo.PARRAFO,id);
        parr.setContenido(cont);
        TO.add(parr);
    }
    public void addParrafo(String id, String cont,String aling){
        Objeto parr=new Objeto(Objeto.Tipo.PARRAFO,id);
        parr.setContenido(cont);
        parr.setAlineacion(aling);
        TO.add(parr);
    }
    public String getParrA(String id){
        for(Objeto s:TO){
            if(s.getId().equals(id)){
                return s.getAlineacion();
            }
        }
        return null;
    }
    public String getParrC(String id){
        for(Objeto s:TO){
            if(s.getId().equals(id)){
                return s.getContenido();
            }
        }
        return null;
    }
}
