package work3;

public class UserManager {
	//public void Add() {System.out.println("Kullan�c� eklendi " );}
	
	
	public void addStudent(Student student) 
	{
		System.out.println(student.getId()+" id'li ��renci ba�ar�l� bir �ekilde eklendi");
	}
	
	public void addInstructor(Instructor instructor) 
	{
		System.out.println(instructor.getId()+" id'li e�itmen ba�ar�l� bir �ekilde eklendi");
	}
	public void login(User user) 
	{
		System.out.println("siteye "+user.getEmail()+" email adresi ile giri� yapt�n.");
	}
	
	public void logout(User user) 
	{
		System.out.println("siteden "+user.getEmail()+" email adresi ile ��k�� yapt�n.");
	}
	
	public void signup(User user) 
	{
		System.out.println("siteye "+user.getEmail()+" email adresi ile kay�t oldun.");
	}

}
