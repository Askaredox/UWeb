package Arbol;

import java.util.Objects;

/*
 * @author ASKAR
 */
public class Operacion implements Instruccion{
    public static enum Oper{
        SUMA,
        RESTA,
        MULT,
        DIV,
        NEG,
        NUM,
        DEC,
        ID,
        CAD,
        MEN,
        MAY,
        MENIGU,
        MAYIGU,
        IGU,
        DIFF,
        AND,
        OR,
        NOT,
        TRUE,
        FALSE,
        CONCAT
    }
    private final Oper tipo;
    private Instruccion izq;
    private Instruccion der;
    private Object valor;

    public Operacion(Oper tipo,Instruccion i,Instruccion d) {
        this.tipo = tipo;
        der=d;
        izq=i;
    }
    public Operacion(Oper tipo,Instruccion izq){
        this.tipo=tipo;
        this.izq=izq;
    }
    public Operacion(Oper tipo,String a){
        valor=a;
        this.tipo=tipo;
    }
    public Operacion(Double d){
        valor=d;
        tipo=Oper.DEC;
    }
    public Operacion(Integer i){
        valor=i;
        tipo=Oper.NUM;
    }

    @Override
    public Object ejecutar(TablaSimbolos ts, Arbol ar) {
        Object a = (izq==null)?null:izq.ejecutar(ts,ar);
        Object b = (der==null)?null:der.ejecutar(ts,ar);
        
        if(null!=tipo)switch (tipo) {
            case SUMA:
                if(a instanceof Integer &&b instanceof Integer){
                    return (Integer)a + (Integer)b;
                }
                else if(a instanceof Double && b instanceof Integer){
                    return (Double)a + (Integer)b;
                }
                else if(a instanceof Integer && b instanceof Double){
                    return (Integer)a + (Double)b;
                }
                else if(a instanceof Double && b instanceof Double){
                    return (Double)a + (Double)b;
                }
                else{
                    System.err.println("Valió madres en la SUMA");
                }   break;
            case RESTA:
                if(a instanceof Integer &&b instanceof Integer){
                    return (Integer)a - (Integer)b;
                }
                else if(a instanceof Double && b instanceof Integer){
                    return (Double)a - (Integer)b;
                }
                else if(a instanceof Integer && b instanceof Double){
                    return (Integer)a - (Double)b;
                }
                else if(a instanceof Double && b instanceof Double){
                    return (Double)a - (Double)b;
                }
                else{
                    System.err.println("Valió madres en la RESTA");
                }   break;
            case MULT:
                if(a instanceof Integer &&b instanceof Integer){
                    return (Integer)a * (Integer)b;
                }
                else if(a instanceof Double && b instanceof Integer){
                    return (Double)a * (Integer)b;
                }
                else if(a instanceof Integer && b instanceof Double){
                    return (Integer)a * (Double)b;
                }
                else if(a instanceof Double && b instanceof Double){
                    return (Double)a * (Double)b;
                }
                else{
                    System.err.println("Valió madres en la MULT");
                }   break;
            case DIV:
                if(a instanceof Integer &&b instanceof Integer){
                    return (Integer)a / (Integer)b;
                }
                else if(a instanceof Double && b instanceof Integer){
                    return (Double)a / (Integer)b;
                }
                else if(a instanceof Integer && b instanceof Double){
                    return (Integer)a / (Double)b;
                }
                else if(a instanceof Double && b instanceof Double){
                    return (Double)a / (Double)b;
                }
                else{
                    System.err.println("Valió madres en la DIV");
                }   break;
            case NEG:
                if(a instanceof Double){
                    return (Double)a*-1;
                }
                else if(a instanceof Integer){
                    return (Integer)a*-1;
                }   
                else{
                    System.err.println("Valió madres en la NEG");
                }   break;
            case MAY:
                if(a instanceof Integer &&b instanceof Integer){
                    return (Boolean)((Integer)a > (Integer)b);
                }
                else if(a instanceof Double && b instanceof Integer){
                    return (Boolean)((Double)a > (Integer)b);
                }
                else if(a instanceof Integer && b instanceof Double){
                    return (Boolean)((Integer)a > (Double)b);
                }
                else if(a instanceof Double && b instanceof Double){
                    return (Boolean)((Double)a > (Double)b);
                }
                else{
                    System.err.println("Valió madres en la MAY");
                }   break;
            case MEN:
                if(a instanceof Integer &&b instanceof Integer){
                    return (Boolean)((Integer)a < (Integer)b);
                }
                else if(a instanceof Double && b instanceof Integer){
                    return (Boolean)((Double)a < (Integer)b);
                }
                else if(a instanceof Integer && b instanceof Double){
                    return (Boolean)((Integer)a < (Double)b);
                }
                else if(a instanceof Double && b instanceof Double){
                    return (Boolean)((Double)a < (Double)b);
                }
                else{
                    System.err.println("Valió madres en la MEN");
                }   break;
            case MAYIGU:
                if(a instanceof Integer &&b instanceof Integer){
                    return (Boolean)((Integer)a >= (Integer)b);
                }
                else if(a instanceof Double && b instanceof Integer){
                    return (Boolean)((Double)a >= (Integer)b);
                }
                else if(a instanceof Integer && b instanceof Double){
                    return (Boolean)((Integer)a >= (Double)b);
                }
                else if(a instanceof Double && b instanceof Double){
                    return (Boolean)((Double)a >= (Double)b);
                }
                else{
                    System.err.println("Valió madres en la MAYIGU");
                }   break;
            case MENIGU:
                if(a instanceof Integer &&b instanceof Integer){
                    return (Boolean)((Integer)a <= (Integer)b);
                }
                else if(a instanceof Double && b instanceof Integer){
                    return (Boolean)((Double)a <= (Integer)b);
                }
                else if(a instanceof Integer && b instanceof Double){
                    return (Boolean)((Integer)a <= (Double)b);
                }
                else if(a instanceof Double && b instanceof Double){
                    return (Boolean)((Double)a <= (Double)b);
                }
                else{
                    System.err.println("Valió madres en la MENIGU");
                }   break;
            case IGU:
                if(a instanceof Integer &&b instanceof Integer){
                    return (Boolean)(Objects.equals((Integer)a, (Integer)b));
                }
                else if(a instanceof Double && b instanceof Integer){
                    return (Boolean)(Objects.equals((Double)a, (Integer)b));
                }
                else if(a instanceof Integer && b instanceof Double){
                    return (Boolean)(Objects.equals((Integer)a, (Double)b));
                }
                else if(a instanceof Double && b instanceof Double){
                    return (Boolean)(Objects.equals((Double)a, (Double)b));
                }
                else if(a instanceof Boolean && b instanceof Boolean){
                    return (Boolean)(Objects.equals((Boolean)a,(Boolean) b));
                }
                else if(a instanceof String && b instanceof String){
                    return (Boolean)(Objects.equals((String)a, (String)b));
                }
                else{
                    System.err.println("Valió madres en la IGU");
                }   break;
            case DIFF:
                if(a instanceof Integer &&b instanceof Integer){
                    return (Boolean)(!Objects.equals((Integer)a, (Integer)b));
                }
                else if(a instanceof Double && b instanceof Integer){
                    return (Boolean)(!Objects.equals((Double)a, (Integer)b));
                }
                else if(a instanceof Integer && b instanceof Double){
                    return (Boolean)(!Objects.equals((Integer)a, (Double)b));
                }
                else if(a instanceof Double && b instanceof Double){
                    return (Boolean)(!Objects.equals((Double)a, (Double)b));
                }
                else{
                    System.err.println("Valió madres en la DIFF");
                }   break;
            case AND:
                if(a instanceof Boolean &&b instanceof Boolean){
                    return (Boolean)((Boolean)a && (Boolean)b);
                }
                else{
                    System.err.println("Valió madres en la AND");
                }   break;
            case OR:
                if(a instanceof Boolean &&b instanceof Boolean){
                    return (Boolean)((Boolean)a || (Boolean)b);
                }
                else{
                    System.err.println("Valió madres en la OR");
                }   break;
            case NOT:
                if(a instanceof Boolean){
                    return (Boolean)!((Boolean)a);
                }
                else{
                    System.err.println("Valió madres en la NOT");
                }   break;
            case NUM:
                return new Integer(valor.toString());
            case DEC:
                return new Double(valor.toString());
            case FALSE:
                return false;
            case TRUE:
                return true;
            case CAD:
                return valor.toString();
            case ID:
                String e=ts.getTipo((String)valor);
                switch(e){
                    case "INTEGER":return (Integer)ts.getValor((String)valor);
                    case "STRING": return (String)ts.getValor((String)valor);
                    case "BOOLEAN":return (Boolean)ts.getValor((String)valor);
                    case "DOUBLE": return (Double)ts.getValor((String)valor);
                }
            case CONCAT:
                return ((a==null)?null:a.toString())+((b==null)?null:b.toString());
            default:
                System.err.println("Valió madres en TODO Dx");
                break;
        }
        return null;
    }
    
}
