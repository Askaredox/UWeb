package Arbol;
/*
 * @author ASKAR
 */
public class Simbolo {
    private Tipo tipo;
    private String id;
    private Object valor;
    public Simbolo(Tipo t,String i){
        tipo=t;
        id=i;
    }
    public String getId(){
        return id;
    }
    public Object getValor(){
        return valor;
    }
    public void setValor(Object val){
        valor = val;
    }
    public String getTipo(){
        switch(tipo){
            case NUMERO:return "INTEGER";
            case CADENA:return "STRING";
            case BOOLEAN:return "BOOLEAN";
            case DECIMAL:return "DOUBLE";
        }
        return null;
    }
    public static enum Tipo{
        NUMERO,
        CADENA,
        BOOLEAN,
        DECIMAL
    }
}
