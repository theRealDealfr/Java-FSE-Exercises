class DITest{
    public static void main(String[] args){
        CustomerRepository repo = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repo);
        service.getCustomer("2039PS");
        //System.out.println("------------------------------");

    }
}