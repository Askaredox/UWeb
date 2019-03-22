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
    public Objeto getObjeto(String id){
        for(Objeto s:TO)
            if(s.getId().equals(id))
                return s;
        return null;
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
    public void addTextoA(String id, String cont){
        Objeto parr=new Objeto(Objeto.Tipo.TEXTOA,id);
        parr.setContenido(cont);
        TO.add(parr);
    }
    public void addTextoB(String id, String cont){
        Objeto parr=new Objeto(Objeto.Tipo.TEXTOB,id);
        parr.setContenido(cont);
        TO.add(parr);
    }
    public void addImg(String id, String path){
        Objeto parr=new Objeto(Objeto.Tipo.IMAGEN,id);
        parr.setPath(path);
        TO.add(parr);
    }
    public void addImg(String id, String path,String alto,String ancho){
        Objeto parr=new Objeto(Objeto.Tipo.IMAGEN,id);
        parr.setPath(path);
        parr.setAlto(alto);
        parr.setAncho(ancho);
        TO.add(parr);
    }
    public void addBot(String id, String nombre, String contenido){
        Objeto parr=new Objeto(Objeto.Tipo.BOTON,id);
        parr.setNombre(nombre);
        parr.setContenido(contenido);
        TO.add(parr);
    }
    public void addTab(String id, String tabla){
        Objeto parr=new Objeto(Objeto.Tipo.TABLA,id);
        parr.setTabla(tabla);
        TO.add(parr);
    }
}
