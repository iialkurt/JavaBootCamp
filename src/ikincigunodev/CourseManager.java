package ikincigunodev;

public class CourseManager {
	
	
	// listele adl� bir metod yapt�k.
	public void Listele() {
		
		Course course1 = new Course(1,"Java E�itimi","Java ile ba�tan sona e�itim");
		Course course2 = new Course(2,"Csharp E�itimi","csharp ile ba�tan sona e�itim");
			
			/*course1.CourseId=1;
			course1.CourseName="Java E�itimi";
			course1.CourseDetails="Java ile ba�tan sona e�itim";
			
			Course course2 = new Course();
			course2.CourseId=2;
			course2.CourseName="Chasrp �le Prgramlama";
			course2.CourseDetails="Csharp� Ba�tan Sona ��ren";
			
			
			*/
			
			Course[] courses = {course1, course2};
			
			for (Course course : courses) {
				
				System.out.println(course.CourseId+" "+ course.CourseName+" "+ course.CourseDetails);
				
			}
		
				
	}
	
	// listele metodu biti�
	
	
	public void SepeteEkle() {
		System.out.println("Sepete Eklendi!");
	}
	
	public int SepetToplam(int sepet1, int sepet2) {
		int sepettoplam = sepet1+sepet2;
		return sepettoplam;
	
	}
	
	


}
