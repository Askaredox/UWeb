package Arbol;
/*
 * @author ASKAR
 */
public class Create_Part implements Instruccion{
    private Instruccion ins1;
    private Instruccion ins2;
    private Instruccion ins3;
    private String id;
    private Accion accion;

    public Create_Part(Accion accion,String id,Instruccion ins1) {
        this.ins1 = ins1;
        this.id=id;
        this.accion = accion;
    }
    public Create_Part(Accion accion,String id,Instruccion ins1,Instruccion ins2) {
        this.ins1 = ins1;
        this.ins2 = ins2;
        this.id=id;
        this.accion = accion;
    }
    public Create_Part(Accion accion,String id,Instruccion ins1,Instruccion ins2,Instruccion ins3) {
        this.ins1 = ins1;
        this.ins2 = ins2;
        this.ins3 = ins3;
        this.id=id;
        this.accion = accion;
    }

    @Override
    public Object ejecutar(TablaSimbolos ts, Arbol ar) {
        switch(accion){
            case CRE_PARR1:
                ts.addParrafo(id, (String)ins1.ejecutar(ts, ar), (String)ins2.ejecutar(ts, ar));
                break;
            case CRE_PARR2:
                ts.addParrafo(id, (String)ins1.ejecutar(ts, ar));
                break;
            case CRE_TEA:
                ts.addTextoA(id, (String)ins1.ejecutar(ts, ar));
                break;
            case CRE_TEB:
                ts.addTextoB(id, (String)ins1.ejecutar(ts, ar));
                break;
            case CRE_IMG1:
                ts.addImg(id, (String)ins1.ejecutar(ts, ar), ins2.ejecutar(ts, ar).toString(), ins3.ejecutar(ts, ar).toString());
                break;
            case CRE_IMG2:
                ts.addImg(id, (String)ins1.ejecutar(ts, ar));
                break;
            case CRE_BOT:
                ts.addBot(id, (String)ins1.ejecutar(ts, ar), (String)ins2.ejecutar(ts, ar));
                break;
            case CRE_TAB:
                ts.addTab(id, (String)ins1.ejecutar(ts, ar));
        }
        return "";
    }
    public static enum Accion{
        CRE_PARR1,
        CRE_PARR2,
        CRE_TEA,
        CRE_TEB,
        CRE_IMG1,
        CRE_IMG2,
        CRE_TAB,
        CRE_BOT
    }
}
