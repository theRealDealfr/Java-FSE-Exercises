public class CustomerRepositoryImpl implements CustomerRepository{
    public String findCustomerById(String id){
        System.out.println(id+": Athira");
        return "Athira";
    }
}