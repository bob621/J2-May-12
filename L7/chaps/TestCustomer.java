import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

class TestCustomer
{
    public static void main(String[] args)
    {
        List<Customer> cstList = new ArrayList<Customer>();
        cstList.add(new Customer("John", "Smith", 30, 100.0));
        cstList.add(new Customer("Judy", "Miller", 25, 150.0));
        cstList.add(new Customer("Neil", "Armstrong", 27, 200.0));

        System.out.println("------------------------------------------------");
        System.out.println(" Name Age Order Value");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < cstList.size(); i++)
        {
            Customer cst = cstList.get(i);
            System.out.println(cst.concatName() + " " + cst.getAge()
                    + " " + cst.getOrderValue());
        }

	Iterator<Customer> it = cstList.iterator();

	while( it.hasNext()){
	    Customer cust = it.next(); 
	    System.out.println (cust.concatName() + " " + cust.getAge() + " " + cust.getOrderValue());
	}

    }
}