/**
 * 
 */
package intro;

import java.util.Iterator;

/**
 * @author ialkurt
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
System.out.println("Hello World");

System.out.println("1. G�n Dersi");
double  dolar = 14;
double dolardun=12.5;

if (dolar==dolardun) {
	
	System.out.println("Dolar E�ittir Resmi");
	
}

else if (dolar>dolardun) {
	
	System.out.println("Dolar Y�kseldi Resmi Dolar :"+dolar);
	
}

else {
	System.out.println("Dolar D��t� Resmi");
}


String kredi1="H�zl� Kredi";
String kredi2 = "Ta��t Kredisi";
String kredi3= "Ev Kredisi";
String kredi4 = "T�ketici Kredisi";

String[] krediler = {"H�zl� Kredi","Ta��t Kredisi","Ev Kredisi","T�ketici Kredisi"};

for (String kredi : krediler) {
	
	System.out.println(kredi);
	
}


System.out.println("----------------------------");

for (int i = 0; i < krediler.length; i++) {
	
	System.out.println(krediler[i]);
	
}





	}

}
