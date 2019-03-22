package Arbol;
/*
 * @author ASKAR
 */
public class Simbolo {
    private Tipo tipo;
    private String id;
    private Object valor;
    private int fila;
    private int columna;
    public Simbolo(Tipo t,String i,int f,int c){
        tipo=t;
        id=i;
        fila= f;
        columna=c;
    }
    public String getId(){
        return id;
    }
    public Object getValor(){
        return valor;
    }
    public int getF(){
        return fila;
    }
    public int getC(){
        return columna;
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
