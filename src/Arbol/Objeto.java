package Arbol;
/*
 * @author ASKAR
 */
public class Objeto {
    private Tipo tipo;
    private String id;
    private String contenido;
    private String alineacion;
    private String path;
    private String alto;
    private String ancho;
    private String borde;
    
    private final Instruccion ins1;
    private Instruccion ins2;
    private Instruccion ins3;

    public Objeto(Instruccion ins1, Instruccion ins2, Instruccion ins3) {
        this.ins1 = ins1;
        this.ins2 = ins2;
        this.ins3 = ins3;
    }
    public Objeto(Instruccion ins1, Instruccion ins2) {
        this.ins1 = ins1;
        this.ins2 = ins2;
    }
    public Objeto(Instruccion ins1) {
        this.ins1 = ins1;
    }
    
    
    
    public static enum Tipo{
        PARRAFO,
        TEXTOA,
        TEXTOB,
        IMAGEN,
        TABLA,
        BOTON,
        CLICK
    }
}
