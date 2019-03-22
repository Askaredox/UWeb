package Arbol;
/*
 * @author ASKAR
 */
public class Declaracion implements Instruccion{
    private final String id;
    private Simbolo.Tipo tipo;
    private final Instruccion instruccion;
    private int f;
    private int c;
    
    public Declaracion(String id,Instruccion instruccion,int fi,int co){
        this.id=id;
        this.instruccion=instruccion;
        f=fi;
        c=co;
    }
    
    @Override
    public Object ejecutar(TablaSimbolos ts, Arbol ar){
        Object valor=instruccion.ejecutar(ts, ar);
        if(valor instanceof Integer){
            tipo=Simbolo.Tipo.NUMERO;
        }
        else if(valor instanceof String){
            tipo=Simbolo.Tipo.CADENA;
        }
        else if(valor instanceof Boolean){
            tipo=Simbolo.Tipo.BOOLEAN;
        }
        else if(valor instanceof Double){
            tipo=Simbolo.Tipo.DECIMAL;
        }
        if(ts.inDB(id)){
            ts.setValor(id, valor);
        }
        else{
            Simbolo aux=new Simbolo(tipo, id,f,c);
            aux.setValor(valor);
            ts.add(aux);
        }
        
        return "";
    }
}
