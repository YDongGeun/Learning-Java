package exercise.chapter_63;

import java.util.List;

public class ListUtils {

    public synchronized static void addList(List<Customer> customerList, Customer newCustomer) {
        customerList.add(newCustomer);
    }
}
