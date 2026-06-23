class SlackNotifierDecorator extends NotifierDecorator{
    SlackNotifierDecorator(Notifier n){
        super(n); 
    }
    public void send(){
        super.send();
        System.out.println("Slack Notification!!!");
    }
}