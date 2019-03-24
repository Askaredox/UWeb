package Arbol;
/*
 * @author ASKAR
 */
import java.util.LinkedList;
public class Errores extends LinkedList<Error>{

    public Errores() {
        super();
    }
    public void addE(String tipo,String lexema,int fila, int columna){
        this.add(new Error(tipo, lexema, fila, columna));
    }
    public String getErrores(boolean s){//true son errores sintacticos, false errores lexicos
        String ss="<HTML><BODY>";
        ss+="<table border=\"2px\">";
        ss+="<tr>"
                +"<th>TOKEN</th>"
                +"<th>LEXEMA</th>"
                +"<th>FILA</th>"
                +"<th>COLUMNA</th>"
                +"</tr>";
        if(s){
            for(Error t:this){
                if("SINTACTICO".equals(t.tipo)){
                    ss+="<tr>"
                    +"<td>"+t.tipo+"</td>"
                    +"<td>"+t.lexema+"</td>"
                    +"<td>"+t.fila+"</td>"
                    +"<td>"+t.columna+"</td>"
                    +"</tr>";
                }
            }
        }
        else{
            for(Error t:this){
                if("LEXICO".equals(t.tipo)){
                    ss+="<tr>"
                    +"<td>"+t.tipo+"</td>"
                    +"<td>"+t.lexema+"</td>"
                    +"<td>"+t.fila+"</td>"
                    +"<td>"+t.columna+"</td>"
                    +"</tr>";
                }
            }
        }
        
        ss+="</table>";
        ss+="</BODY></HTML>";
        return ss;
    }
}
class Error{
    String tipo;
    String lexema;
    int fila;
    int columna;

    public Error(String tipo, String lexema, int fila, int columna) {
        this.tipo = tipo;
        this.lexema = lexema;
        this.fila = fila;
        this.columna = columna;
    }
    
}
