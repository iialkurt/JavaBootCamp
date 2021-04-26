package ikincigunodev;

public class CourseManager {
	
	
	// listele adlý bir metod yaptýk.
	public void Listele() {
		
		Course course1 = new Course(1,"Java Eðitimi","Java ile baþtan sona eðitim");
		Course course2 = new Course(2,"Csharp Eðitimi","csharp ile baþtan sona eðitim");
			
			/*course1.CourseId=1;
			course1.CourseName="Java Eðitimi";
			course1.CourseDetails="Java ile baþtan sona eðitim";
			
			Course course2 = new Course();
			course2.CourseId=2;
			course2.CourseName="Chasrp Ýle Prgramlama";
			course2.CourseDetails="Csharpý Baþtan Sona öðren";
			
			
			*/
			
			Course[] courses = {course1, course2};
			
			for (Course course : courses) {
				
				System.out.println(course.CourseId+" "+ course.CourseName+" "+ course.CourseDetails);
				
			}
		
				
	}
	
	// listele metodu bitiþ
	
	
	public void SepeteEkle() {
		System.out.println("Sepete Eklendi!");
	}
	
	public int SepetToplam(int sepet1, int sepet2) {
		int sepettoplam = sepet1+sepet2;
		return sepettoplam;
	
	}
	
	


}
