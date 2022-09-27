package service;

import model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {
    private static Map<Integer, Customer> customerMap;
    static {
        customerMap = new HashMap<>();
        customerMap.put(1, new Customer(1,"Thor","thor@gmail.com","Ha noi"));
        customerMap.put(2, new Customer(2,"Hulk","hulk@gmail.com","Bac Giang"));
        customerMap.put(3, new Customer(3,"Captain","captain@gmail.com","Hai Phong"));
        customerMap.put(4, new Customer(4,"Dr Strange","strange@gmail.com","Bac Ninh"));
        customerMap.put(5, new Customer(5,"Groot","iamgroot@gmail.com","Lang Son"));
        customerMap.put(6, new Customer(6,"Iron Man","ironman@gmail.com","Da Nang"));
        customerMap.put(7, new Customer(7,"Spider Man","spiderman@gmail.com","Nha Trang"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customerMap.values());
    }

    @Override
    public void save(Customer customer) {
        customerMap.put(customer.getId(),customer);
    }

    @Override
    public Customer findById(int id) {
        return customerMap.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customerMap.put(id,customer);
    }

    @Override
    public void remove(int id) {
        customerMap.remove(id);
    }
}
