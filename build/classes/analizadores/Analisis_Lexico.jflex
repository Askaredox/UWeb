/*-------------------- 1ra Area: Codigo de Usuario --------------------*/
//-------------> Parquetes, Importaciones
package analizadores;
import java_cup.runtime.*;
//import Arbol.Errores;

/*-------------------- 2da Area: Opciones y Declaraciones --------------------*/

%%
%{
//---------------> Codigo Java
/*
    Errores err=new Errores();
    public Errores getErrors(){
        return err;
    }
*/
    StringBuffer string = new StringBuffer();
    boolean estado=false;
%}


//--------------> Directivas 
%public
%class Analisis_Lexico
%cupsym Simbolos
%cup
%char
%column
%full
%8bit
%line
%unicode
%ignorecase

//-------> Expresiones Regulares
cad =  [\"]([^\"\n]|(\\\"))*[\"]
num = [0-9]+
com = "<!""<"*([^"!>"]|[^"!"]">"|"!"[^">"])*"!"*"!>"
comm = "/*""/"*([^*/]|[^*]"/"|"*"[^/])*"*"*"*/"
commm = ("//".*\r\n)|("//".*\n)|("//".*\r)

idvar = "$"[A-Za-z]+["_"0-9A-Za-z]*
idobj = "#"[A-Za-z]+["_"0-9A-Za-z]*
dec =[0-9]+"."[0-9]+
//ESTADOS
%state TEXTO
%state HS
%%
/*-------------------- 3ra Area: Reglas Lexicas --------------------*/
//-------------------> Palabras Reservadas
<YYINITIAL> "<COMPI>"           {System.out.println("com_a"); return new Symbol(Simbolos.com_a,yycolumn, yyline, yytext());}
<YYINITIAL> "</COMPI>"          {System.out.println("com_c"); return new Symbol(Simbolos.com_c,yycolumn, yyline, yytext());}
<YYINITIAL> "<Cabecera>"        {System.out.println("cab_a"); return new Symbol(Simbolos.cab_a,yycolumn, yyline, yytext());}
<YYINITIAL> "</Cabecera>"       {System.out.println("cab_c"); return new Symbol(Simbolos.cab_c,yycolumn, yyline, yytext());}
<YYINITIAL> "<Titulo>"          {System.out.println("tit_a"); yybegin(TEXTO); return new Symbol(Simbolos.tit_a,yycolumn, yyline, yytext());}
<YYINITIAL> "</Titulo>"         {System.out.println("tit_c"); return new Symbol(Simbolos.tit_c,yycolumn, yyline, yytext());}
<YYINITIAL> "<Cuerpo"           {System.out.println("cue_a"); estado=true; return new Symbol(Simbolos.cue_a,yycolumn, yyline, yytext());}
<YYINITIAL> "</Cuerpo>"         {System.out.println("cue_c"); return new Symbol(Simbolos.cue_c,yycolumn, yyline, yytext());}
<YYINITIAL> "<Espacio>"         {System.out.println("esp_a"); yybegin(TEXTO);return new Symbol(Simbolos.esp_a,yycolumn, yyline, yytext());}
<YYINITIAL> "</Espacio>"        {System.out.println("esp_c"); yybegin(TEXTO);return new Symbol(Simbolos.esp_c,yycolumn, yyline, yytext());}
<YYINITIAL> "<Parrafo"          {System.out.println("par_a"); estado=true; return new Symbol(Simbolos.par_a,yycolumn, yyline, yytext());}
<YYINITIAL> "</parrafo>"        {System.out.println("par_c"); yybegin(TEXTO);return new Symbol(Simbolos.par_c,yycolumn, yyline, yytext());}
<YYINITIAL> "</TextoA>"         {System.out.println("tea_c"); return new Symbol(Simbolos.tea_c,yycolumn, yyline, yytext());}
<YYINITIAL> "</TextoB>"         {System.out.println("teb_c"); return new Symbol(Simbolos.teb_c,yycolumn, yyline, yytext());}

<YYINITIAL> "</Salto>"          {System.out.println("salt");  yybegin(TEXTO);return new Symbol(Simbolos.salt,yycolumn, yyline, yytext());}
<YYINITIAL> "<TextoA>"          {System.out.println("tea_a"); yybegin(TEXTO); return new Symbol(Simbolos.tea_a,yycolumn, yyline, yytext());}
<YYINITIAL> "<TextoB>"          {System.out.println("teb_a"); yybegin(TEXTO); return new Symbol(Simbolos.teb_a,yycolumn, yyline, yytext());}
<YYINITIAL> "<Imagen"           {System.out.println("ima_a"); return new Symbol(Simbolos.ima_a,yycolumn, yyline, yytext());}
<YYINITIAL> "</Imagen>"         {System.out.println("ima_c"); yybegin(TEXTO); return new Symbol(Simbolos.ima_c,yycolumn, yyline, yytext());}
<YYINITIAL> "<Boton"            {System.out.println("bot_a"); return new Symbol(Simbolos.bot_a,yycolumn, yyline, yytext());}
<YYINITIAL> "</Boton>"          {System.out.println("bot_c"); yybegin(TEXTO); return new Symbol(Simbolos.bot_c,yycolumn, yyline, yytext());}
<YYINITIAL> "<Tabla"            {System.out.println("tab_a"); return new Symbol(Simbolos.tab_a,yycolumn, yyline, yytext());}
<YYINITIAL> "</Tabla>"          {System.out.println("tab_c"); yybegin(TEXTO); return new Symbol(Simbolos.tab_c,yycolumn, yyline, yytext());}
<YYINITIAL> "<Fila>"            {System.out.println("fil_a"); return new Symbol(Simbolos.fil_a,yycolumn, yyline, yytext());}
<YYINITIAL> "</Fila>"           {System.out.println("fil_c"); return new Symbol(Simbolos.fil_c,yycolumn, yyline, yytext());}
<YYINITIAL> "<ColumnaC>"        {System.out.println("colc_a");yybegin(TEXTO); return new Symbol(Simbolos.colc_a,yycolumn, yyline, yytext());}
<YYINITIAL> "</ColumnaC>"       {System.out.println("colc_c");return new Symbol(Simbolos.colc_c,yycolumn, yyline, yytext());}
<YYINITIAL> "<Columna>"         {System.out.println("col_a"); yybegin(TEXTO); return new Symbol(Simbolos.col_a,yycolumn, yyline, yytext());}
<YYINITIAL> "</Columna>"        {System.out.println("col_c"); return new Symbol(Simbolos.col_c,yycolumn, yyline, yytext());}

<YYINITIAL> "true"              {System.out.println("tru");  return new Symbol(Simbolos.tru,yycolumn, yyline, yytext());}
<YYINITIAL> "false"             {System.out.println("fals"); return new Symbol(Simbolos.fals,yycolumn, yyline, yytext());}
<YYINITIAL> "fondo"             {System.out.println("fond"); return new Symbol(Simbolos.fond,yycolumn, yyline, yytext());}
<YYINITIAL> "alineacion"        {System.out.println("alin"); return new Symbol(Simbolos.alin,yycolumn, yyline, yytext());}
<YYINITIAL> "path"              {System.out.println("path"); return new Symbol(Simbolos.path,yycolumn, yyline, yytext());}
<YYINITIAL> "alto"              {System.out.println("alto"); return new Symbol(Simbolos.alto,yycolumn, yyline, yytext());}
<YYINITIAL> "ancho"             {System.out.println("anch"); return new Symbol(Simbolos.anch,yycolumn, yyline, yytext());}
<YYINITIAL> "id"                {System.out.println("ide");  return new Symbol(Simbolos.ide,yycolumn, yyline, yytext());}
<YYINITIAL> "texto"             {System.out.println("text"); return new Symbol(Simbolos.text,yycolumn, yyline, yytext());}
<YYINITIAL> "borde"             {System.out.println("bord"); return new Symbol(Simbolos.bord,yycolumn, yyline, yytext());}

<YYINITIAL> "<?hs"              {System.out.println("hs_a"); yybegin(HS);return new Symbol(Simbolos.hs_a,yycolumn, yyline, yytext());}

<HS> "true"                     {System.out.println("tru");  return new Symbol(Simbolos.tru,yycolumn, yyline, yytext());}
<HS> "false"                    {System.out.println("fals"); return new Symbol(Simbolos.fals,yycolumn, yyline, yytext());}
<HS> "echo"                     {System.out.println("echo"); return new Symbol(Simbolos.echo,yycolumn, yyline, yytext());}
<HS> "if"                       {System.out.println("if");return new Symbol(Simbolos.ife,yycolumn, yyline, yytext());}
<HS> "else"                     {System.out.println("else");return new Symbol(Simbolos.elsee,yycolumn, yyline, yytext());}
<HS> "repetir"                  {System.out.println("repet");return new Symbol(Simbolos.repet,yycolumn, yyline, yytext());}

<HS> "insertar"                 {System.out.println("inser");return new Symbol(Simbolos.inser,yycolumn, yyline, yytext());}

<HS> "CrearParrafo"             {System.out.println("cre_par");return new Symbol(Simbolos.cre_par,yycolumn, yyline, yytext());}
<HS> "setAlineacion"            {System.out.println("setA");return new Symbol(Simbolos.setA,yycolumn, yyline, yytext());}
<HS> "getAlineacion"            {System.out.println("getA");return new Symbol(Simbolos.getA,yycolumn, yyline, yytext());}
<HS> "setContenido"             {System.out.println("setC");return new Symbol(Simbolos.setC,yycolumn, yyline, yytext());}
<HS> "getContenido"             {System.out.println("getC");return new Symbol(Simbolos.getC,yycolumn, yyline, yytext());}

<HS> "CrearTextoA"              {System.out.println("cre_tea");return new Symbol(Simbolos.cre_tea,yycolumn, yyline, yytext());}
<HS> "CrearTextoB"              {System.out.println("cre_teb");return new Symbol(Simbolos.cre_teb,yycolumn, yyline, yytext());}

<HS> "CrearImagen"              {System.out.println("cre_img");return new Symbol(Simbolos.cre_img,yycolumn, yyline, yytext());}
<HS> "setPath"                  {System.out.println("setP");return new Symbol(Simbolos.setP ,yycolumn, yyline, yytext());}
<HS> "getPath"                  {System.out.println("getP");return new Symbol(Simbolos.getP ,yycolumn, yyline, yytext());}
<HS> "setAlto"                  {System.out.println("setAl");return new Symbol(Simbolos.setAl,yycolumn, yyline, yytext());}
<HS> "getAlto"                  {System.out.println("getAl");return new Symbol(Simbolos.getAl,yycolumn, yyline, yytext());}
<HS> "setAncho"                 {System.out.println("setAn");return new Symbol(Simbolos.setAn,yycolumn, yyline, yytext());}
<HS> "getAncho"                 {System.out.println("getAn");return new Symbol(Simbolos.getAn,yycolumn, yyline, yytext());}

<HS> "CrearTabla"               {System.out.println("cre_tab");return new Symbol(Simbolos.cre_tab,yycolumn, yyline, yytext());}
<HS> "setBorde"                 {System.out.println("setBo");return new Symbol(Simbolos.setBo,yycolumn, yyline, yytext());}
<HS> "getBorde"                 {System.out.println("getBo");return new Symbol(Simbolos.getBo,yycolumn, yyline, yytext());}

<HS> "CrearBoton"               {System.out.println("cre_bot");return new Symbol(Simbolos.cre_bot,yycolumn, yyline, yytext());}
<HS> "setTexto"                 {System.out.println("setT");return new Symbol(Simbolos.setT,yycolumn, yyline, yytext());}
<HS> "getTexto"                 {System.out.println("getT");return new Symbol(Simbolos.getT,yycolumn, yyline, yytext());}
<HS> "ClickBoton"               {System.out.println("cli_bot");return new Symbol(Simbolos.cli_bot,yycolumn, yyline, yytext());}

<HS> "?>"                       {System.out.println("hs_c");yybegin(TEXTO);return new Symbol(Simbolos.hs_c,yycolumn, yyline, yytext());}

//-------------------> Simbolos Especiales

<YYINITIAL> "="                 {System.out.println("igu    |"+yytext());return new Symbol(Simbolos.igu,yycolumn, yyline, yytext());}
<YYINITIAL> ">"                 {
                                    System.out.println("cie    |"+yytext());
                                    if(estado) yybegin(TEXTO);
                                    estado=false;
                                    return new Symbol(Simbolos.cie,yycolumn, yyline, yytext());
                                }
<HS> "="                        {System.out.println("igu    |"+yytext());return new Symbol(Simbolos.igu,yycolumn, yyline, yytext());}
<HS> ";"                        {System.out.println("pyc    |"+yytext());return new Symbol(Simbolos.pyc,yycolumn, yyline, yytext());}
<HS> "+"                        {System.out.println("mas    |"+yytext());return new Symbol(Simbolos.mas,yycolumn, yyline, yytext());}
<HS> "-"                        {System.out.println("men    |"+yytext());return new Symbol(Simbolos.men,yycolumn, yyline, yytext());}
<HS> "*"                        {System.out.println("por    |"+yytext());return new Symbol(Simbolos.por,yycolumn, yyline, yytext());}
<HS> "/"                        {System.out.println("div    |"+yytext());return new Symbol(Simbolos.div,yycolumn, yyline, yytext());}
<HS> "("                        {System.out.println("par    |"+yytext());return new Symbol(Simbolos.parA,yycolumn, yyline, yytext());}
<HS> ")"                        {System.out.println("par    |"+yytext());return new Symbol(Simbolos.parC,yycolumn, yyline, yytext());}
<HS> "<="                       {System.out.println("lesigu |"+yytext());return new Symbol(Simbolos.lesigu,yycolumn, yyline, yytext());}
<HS> ">="                       {System.out.println("greigu |"+yytext());return new Symbol(Simbolos.greigu,yycolumn, yyline, yytext());}
<HS> "<"                        {System.out.println("les    |"+yytext());return new Symbol(Simbolos.les,yycolumn, yyline, yytext());}
<HS> ">"                        {System.out.println("gre    |"+yytext());return new Symbol(Simbolos.gre,yycolumn, yyline, yytext());}
<HS> "!="                       {System.out.println("diff   |"+yytext());return new Symbol(Simbolos.diff,yycolumn, yyline, yytext());}
<HS> "=="                       {System.out.println("igua   |"+yytext());return new Symbol(Simbolos.igua,yycolumn, yyline, yytext());}
<HS> "&&"                       {System.out.println("and    |"+yytext());return new Symbol(Simbolos.and,yycolumn, yyline, yytext());}
<HS> "||"                       {System.out.println("or     |"+yytext());return new Symbol(Simbolos.or,yycolumn, yyline, yytext());}
<HS> "!"                        {System.out.println("not    |"+yytext());return new Symbol(Simbolos.not,yycolumn, yyline, yytext());}
<HS> "."                        {System.out.println("pun    |"+yytext());return new Symbol(Simbolos.pun,yycolumn, yyline, yytext());}
<HS> "{"                        {System.out.println("llavA  |"+yytext());return new Symbol(Simbolos.llavA,yycolumn, yyline, yytext());}
<HS> "}"                        {System.out.println("llavC  |"+yytext());return new Symbol(Simbolos.llavC,yycolumn, yyline, yytext());}
<HS> ","                        {System.out.println("coma   |"+yytext());return new Symbol(Simbolos.coma,yycolumn, yyline, yytext());}
<HS> "["                        {System.out.println("corA   |"+yytext());return new Symbol(Simbolos.corA,yycolumn, yyline, yytext());}
<HS> "]"                        {System.out.println("corC   |"+yytext());return new Symbol(Simbolos.corC,yycolumn, yyline, yytext());}


//-------------------> Expresiones Regulares

<YYINITIAL> {cad}           {System.out.println("cad    |"+yytext());return new Symbol(Simbolos.cad,yycolumn, yyline, (yytext()).substring(1,yytext().length()-1));}
<YYINITIAL> {num}           {System.out.println("num    |"+yytext());return new Symbol(Simbolos.num,yycolumn, yyline, yytext());}
<YYINITIAL> {com}           {yybegin(TEXTO);}

<HS> {idvar}                {System.out.println("idvar  |"+yytext());return new Symbol(Simbolos.idvar,yycolumn, yyline, yytext());}
<HS> {idobj}                {System.out.println("idobj  |"+yytext());return new Symbol(Simbolos.idobj,yycolumn, yyline, yytext());}
<HS> {cad}                  {System.out.println("cad    |"+yytext());return new Symbol(Simbolos.cad,yycolumn, yyline, (yytext()).substring(1,yytext().length()-1));}
<HS> {num}                  {System.out.println("num    |"+yytext());return new Symbol(Simbolos.num,yycolumn, yyline, yytext());}
<HS> {dec}                  {System.out.println("dec    |"+yytext());return new Symbol(Simbolos.dec,yycolumn, yyline, yytext());}
<HS> {comm}                 {}
<HS> {commm}                {}


<TEXTO> {
        [^"<"]+             {string.setLength(0); string.append(yytext()); }
        "<"                 {
                                if(!(string.length()==0||string.toString().matches("[ \t\r\n\f]+"))){
                                    String e=string.toString().replace("\t","").replace("\r","").replace("\n","");
                                    System.out.println("texto  |"+e); 
                                    yypushback(1); 
                                    yybegin(YYINITIAL);
                                    return new Symbol(Simbolos.texto, yycolumn, yyline, e); 
                                }
                                else {  
                                    yypushback(1); 
                                    yybegin(YYINITIAL);
                                }
                            }
        
}

//------------------> Espacios en blanco
[ \t\r\n\f]      {/* Espacios en blanco */}
//------------------> Errores Lexicos
.                           {
                                System.out.println("Error Lexico '"+yytext()+"' Linea "+yyline+1+" Columna "+yycolumn);
                                //err.addE("LEXICO", yytext(), yyline+1, yycolumn, "Simbolo fuera de este lenguaje");
                            }
