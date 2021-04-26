package ikincigunodev;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
	
		
	CourseManager coursemanager = new CourseManager();
		coursemanager.Listele();
		coursemanager.SepeteEkle();
int sepet =coursemanager.SepetToplam(5, 1);
System.out.println("Sepette  "+sepet+"  ürün Var!");

		

	}

}
