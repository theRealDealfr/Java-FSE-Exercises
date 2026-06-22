class SMSNotifierDecorator extends NotifierDecorator{
    SMSNotifierDecorator(Notifier n){
        super(n); 
    }
    public void send(){
        super.send();
        System.out.println("SMS Notification!!!");
    }
}