package Arbol;
/*
 * @author ASKAR
 */
public class Insertar implements Instruccion{
    String id;

    public Insertar(String id) {
        this.id = id;
    }

    @Override
    public Object ejecutar(TablaSimbolos ts, Arbol ar) {
        Objeto o=ts.getObjeto(id);
        String ss="";
        
        switch(o.getTipo()){
            case PARRAFO:
                String align="left";
                switch(o.getAlineacion().toLowerCase()){
                    case "izquierda": align="left"; break;
                    case "derecha": align="right"; break;
                    case "centrado": align="center"; break;
                    case "justificado": align="justify"; break;
                }
                ss+="<p"+((o.getAlineacion()==null)?"":" align=\""+align+"\"")+">\n";
                ss+=o.getContenido();
                ss+="</p>\n";
                break;
            case TEXTOA:
                ss+="<H2>\n"+o.getContenido()+"</H2>\n";
                break;
            case TEXTOB:
                ss+="<H4>\n"+o.getContenido()+"</H4>\n";
                break;
            case IMAGEN:
                String path=(o.getPath()==null)?"":o.getPath();
                String ancho=(o.getAncho()==null)?"":o.getAncho();
                String alto=(o.getAlto()==null)?"":o.getAlto();
                ss="<img";
                if(path!=""){
                    ss+=" src=\""+path+"\"";
                }
                if(alto!=""){
                    ss+=" height=\""+alto+"\"";
                }
                if(ancho!=""){
                    ss+=" width=\""+ancho+"\"";
                }
                ss+=">\n";
                break;
            case BOTON:
                ss="<input type=\"button\" onclick=\""+o.getNombre()+"()\" value=\""+o.getContenido()+"\">\n";
                break;
            case TABLA:
                ss="<table style=\"width:100%\""+(o.getB()?" border=\"2px\"":"")+">\n"+o.getTabla()+"</table>\n";
                break;
        }
        return ss;
    }
    
}
