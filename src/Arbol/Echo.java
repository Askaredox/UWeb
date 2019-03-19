package Arbol;
/*
 * @author ASKAR
 */
public class Echo implements Instruccion{
    Instruccion echo;

    public Echo(Instruccion echo) {
        this.echo = echo;
    }

    @Override
    public Object ejecutar(TablaSimbolos ts, Arbol ar) {
        return echo.ejecutar(ts, ar)+"\n";
    }
    
}
