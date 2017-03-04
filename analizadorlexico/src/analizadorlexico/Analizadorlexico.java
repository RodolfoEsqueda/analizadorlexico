
package analizadorlexico;
import java.io.*;
import java.util.*;

public class Analizadorlexico {

    
    public static void main(String[] args) {
        Character in[];
	lexer prueba=new lexer();
	in=prueba.leer();
	prueba.esIdentificador(in);
	prueba.esToken(in);
	prueba.esDigito(in);
    }
    
}
