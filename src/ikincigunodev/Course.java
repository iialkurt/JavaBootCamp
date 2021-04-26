package ikincigunodev;

public class Course {
	
	
	public Course() {
		//constructer yapýsý
		System.out.println("Eðitimler");
		
	}
	/// ikinci constructer
	 public Course(int CourseId, String CourseName, String CourseDetails) {
		this.CourseId=CourseId;
		this.CourseName=CourseName;
		this.CourseDetails=CourseDetails;
		
	 }
	
		
		
	int CourseId;
	String CourseName;
	String CourseDetails;
	

}
