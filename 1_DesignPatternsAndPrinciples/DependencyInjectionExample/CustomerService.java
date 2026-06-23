public class CustomerService{
    private CustomerRepository repo;
    CustomerService(CustomerRepository r){
        repo = r;
    }
    public void getCustomer(String id){
        repo.findCustomerById(id);
    }
}