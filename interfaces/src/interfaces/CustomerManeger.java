package interfaces;

public class CustomerManeger {
	private Logger[] loggers;
	
	public CustomerManeger(Logger[] loggers) {
		this.loggers = loggers;
	}
	//loosly- tightly coupled
	
	public void add(Customer customer) {
		System.out.println("m��teri eklendi" + customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getFirstName());
		
	}
	public void delete(Customer customer) {
		System.out.println("m��teri silindi" + customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getLastName());
		
	}

}
