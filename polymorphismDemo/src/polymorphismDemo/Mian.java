package polymorphismDemo;

public class Mian {

	public static void main(String[] args) {
	//	EmailLogger logger=new EmailLogger();
	//	logger.Log("log mesaj�");
		
		/*BaseLogger[] loggers=new BaseLogger[] {new FileLogger(),new EmailLogger(),new DatabaseLogger(),new ConsoleLogger()};
		for (BaseLogger logger:loggers) {
			logger.Log("log mesaj�");
		} 
		*/
		
		CustomerManager customerManager=new CustomerManager(new DatabaseLogger());
		customerManager.Add();

	}

}
