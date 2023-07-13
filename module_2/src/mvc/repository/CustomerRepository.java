package mvc.repository;
import mvc.model.Customer;
import java.util.LinkedList;

public class CustomerRepository{
  private static LinkedList list = new LinkedList();
    public static void addCustomer(Customer customer) {list.addLast(customer);}
    public static LinkedList<Customer> showList(){return list;}
    public static void deleteCustomer(int index){list.remove(index);}
    public static LinkedList<Customer> seachCustomer(String searchName){
      LinkedList<Customer> searchingList = new LinkedList<Customer>();
      for (int i = 0; i < showList().size(); i++){
        if (showList().get(i).getName().contains(searchName)){
          searchingList.add(showList().get(i));
        }
      }
      return searchingList;
    }

}
