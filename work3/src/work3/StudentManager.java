package work3;

public class StudentManager extends UserManager{
	
	public void add() 
	{
		
	}
	public void submitAssignment(Student student) {
		System.out.println(student.getFirstName()+ " �devin ba�ar�l� bir �ekilde yuklendi!");
	}
	
	public void deleteAssignment(Student student) {
		System.out.println(student.getFirstName()+ " �devin ba�ar�l� bir �ekilde  sistemden silindi!");
	}

}
