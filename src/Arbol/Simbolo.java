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
        switch(tipo){
            case NUMERO:return Integer.parseInt(valor.toString());
            case CADENA:return valor.toString();
            case BOOLEAN:return Boolean.parseBoolean(valor.toString());
            case DECIMAL:return Double.parseDouble(valor.toString());
        }
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
