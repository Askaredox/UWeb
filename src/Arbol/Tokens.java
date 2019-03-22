package Arbol;
/*
 * @author ASKAR
 */
import java.util.LinkedList;
public class Tokens extends LinkedList<Token>{

    public Tokens() {
        super();
    }
    public void setToken(String token,String lexema,int fila,int columna){
        this.add(new Token(token,lexema,fila,columna));
    }
    public String getTokens(){
        String ss="<HTML><BODY>";
        ss+="<table border=\"2px\">";
        ss+="<tr>"
                +"<th>TOKEN</th>"
                +"<th>LEXEMA</th>"
                +"<th>FILA</th>"
                +"<th>COLUMNA</th>"
                +"</tr>";
        for(Token t:this){
            ss+="<tr>"
                +"<td>"+t.token+"</td>"
                +"<td>"+t.lexema+"</td>"
                +"<td>"+t.fila+"</td>"
                +"<td>"+t.columna+"</td>"
                +"</tr>";
        }
        ss+="</table>";
        ss+="</BODY></HTML>";
        return ss;
    }
}
class Token{
    String token;
    String lexema;
    int fila;
    int columna;

    public Token(String token, String lexema, int fila, int columna) {
        this.token = token;
        this.lexema = lexema;
        this.fila = fila+1;
        this.columna = columna+1;
    }
    
}