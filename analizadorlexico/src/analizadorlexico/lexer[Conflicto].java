
package analizadorlexico;
import java.io.*;
import java.util.*;

public class lexer {
    
	private Character tokens[]= //Tokens detectables 
		{
		'=','(',')','+','-','*','/',';','<','>','{','}'
		};
	
	private	Character au='x'; //nos permitira ver si es un digito o identificador

	public Character[] leer()
	{
		String res="";
		int longitud=0;
		Character ch[];
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.print("Introduce la Expresion (para terminar de introducir presiona TAB+ENTER: ");
			do{
			res+=in.readLine();
			}while(!res.endsWith("\t"));
		}catch(IOException ioe)
		{
			System.out.println("Ocurrio la Sig. Excepcion " +ioe);
		}
		longitud=res.length();
		ch=new Character[longitud];
		for(int i=0;i<longitud;i++)
		{
			ch[i]=res.charAt(i);
		}
	return ch;
	}

	/*Verificamos la Expresion para ver si es un digito con el metodo de la clase Character isDigit() */

	public void esDigito(Character ch[])
	{
		int cont=0;
		String cualesSon="";
		for(int i=0;i<ch.length;i++)
		{
			if(au.isDigit(ch[i]))
			{
				cont++;
				cualesSon+=ch[i].toString() + " ";
			}
		}
	tipos out=new tipos(cont,"Digitos",cualesSon);
	out.verTipos();
	}

	/******************************************
	Verificamos la Expresion para ver si es un
	operador evaluandolo contra nuestros tokens
	******************************************/

	public void esToken(Character ch[])
	{
		int ope=0;
		String cualesSon="";
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<tokens.length;j++)
			{
				if(ch[i].equals(tokens[j]))
				{
					ope++;
					cualesSon+=ch[i].toString() + " ";	
				}			
			}
		}
	tipos out=new tipos(ope,"Tokens",cualesSon);
	out.verTipos();
	}

	/*****************************
	Verificamos la Expresion para ver si es un identificador con el metodo de la clase Character isJavaIdentifierStart
	*****************************/

	public void esIdentificador(Character ch[])
	{
		int Id=0,i;
		String cualesSon="";
		for(i=0;i<ch.length;i++)
		{
			if(au.isJavaIdentifierStart(ch[i]))
			{
				Id++;
				cualesSon+=ch[i].toString() + "";
                        }
		}
                if(cualesSon.matches("imp.*")){
                    for(i=0;i<3;i++){
			if(au.isJavaIdentifierStart(ch[i])){
				Id++;
				cualesSon+=ch[i].toString() + "";
                        }
                    }    
                    String reservada=cualesSon;
                    tipos out=new tipos(Id,"Palabra Reservada",reservada);
                    out.verTipos();
                    for(i=2;i<ch.length;i++){
			if(au.isJavaIdentifierStart(ch[i])){
				Id++;
				cualesSon+=ch[i].toString() + "";
                        }
                    }    
                    tipos outi=new tipos(Id,"Identificadores",cualesSon);
                    outi.verTipos();    
		}else{
                if(cualesSon.matches("dig")){
                    String reservada=cualesSon;
                    tipos out=new tipos(Id,"Palabra Reservada",reservada);
                    out.verTipos();
                }else{
                if(cualesSon.matches("si")){
                    String reservada=cualesSon;
                    tipos out=new tipos(Id,"Palabra Reservada",reservada);
                    out.verTipos();
                }else{
                if(cualesSon.matches("no")){
                    String reservada=cualesSon;
                    tipos out=new tipos(Id,"Palabra Reservada",reservada);
                    out.verTipos();
                }else{
                if(cualesSon.matches("sino")){
                    String reservada=cualesSon;
                    tipos out=new tipos(Id,"Palabra Reservada",reservada);
                    out.verTipos();
                }else{
                    tipos out=new tipos(Id,"Identificadores",cualesSon);
                    out.verTipos();
                }
	}
}
