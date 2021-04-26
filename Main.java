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

System.out.println("1. Gün Dersi");
double  dolar = 14;
double dolardun=12.5;

if (dolar==dolardun) {
	
	System.out.println("Dolar Eþittir Resmi");
	
}

else if (dolar>dolardun) {
	
	System.out.println("Dolar Yükseldi Resmi Dolar :"+dolar);
	
}

else {
	System.out.println("Dolar Düþtü Resmi");
}


String kredi1="Hýzlý Kredi";
String kredi2 = "Taþýt Kredisi";
String kredi3= "Ev Kredisi";
String kredi4 = "Tüketici Kredisi";

String[] krediler = {"Hýzlý Kredi","Taþýt Kredisi","Ev Kredisi","Tüketici Kredisi"};

for (String kredi : krediler) {
	
	System.out.println(kredi);
	
}


System.out.println("----------------------------");

for (int i = 0; i < krediler.length; i++) {
	
	System.out.println(krediler[i]);
	
}





	}

}
