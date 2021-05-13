import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Adapters.MernisServiceAdapter;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.SturbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager =new SturbucksCustomerManager(new MernisServiceAdapter() ); 
		
		//CustomerCheckManager()=fAKE S�M�LE //MernisServiceAdapter=tc ile webden do�rulama
		customerManager.Save(new Customer(1, "furkan", "k�t�k", 1999, "15395830576"));
		System.out.println();

	}

}
