package oopIntro;


public class Main {

	public static void main(String[] args) {
		// 
		Product product1 = new Product(1, "lenova", 15000,  "16gb ram",10,13333);  // �rnek olu�turma ,referans olu�turma ,intance
		
		
		Product product2 = new Product();  // �rnek olu�turma ,referans olu�turma ,intance
		product2.setId(2);
		product2.setName("lenovo v15");
		product2.setDetail("16gb ram ");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		Product product3 = new Product();  // �rnek olu�turma ,referans olu�turma ,intance
		
		Category category1 = new Category();
		category1.setId=1;
		category1.setName="Bilgisyar";
		
		Category category2= new Category();
		category2.setId=2;
		category2.setName="ev/bah�e";
	
		System.out.println(category1.getName());
		System.out.println(category2.getName());
		

}
