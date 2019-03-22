package Arbol;
/*
 * @author ASKAR
 */
public class Objeto {
    private Tipo tipo;
    private String id;
    private String nombre;
    private String tabla;
    private String contenido;
    private String alineacion;
    private String path;
    private String alto;
    private String ancho;
    private Boolean borde;
    

    public String getTabla() {
        return tabla;
    }
    public void setTabla(String tabla) {
        this.tabla = tabla;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Objeto(Tipo tipo, String id) {
        this.tipo=tipo;
        this.id=id;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getAlineacion() {
        return alineacion;
    }

    public void setAlineacion(String alineacion) {
        this.alineacion = alineacion;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getAlto() {
        return alto;
    }

    public void setAlto(String alto) {
        this.alto = alto;
    }

    public String getAncho() {
        return ancho;
    }

    public void setAncho(String ancho) {
        this.ancho = ancho;
    }
    public String getBorde() {
        return borde.toString();
    }
    public Boolean getB() {
        return borde;
    }

    public void setBorde(Boolean borde) {
        this.borde = borde;
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
