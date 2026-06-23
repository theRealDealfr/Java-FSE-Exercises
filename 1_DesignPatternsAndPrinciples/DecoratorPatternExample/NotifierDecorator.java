abstract class NotifierDecorator implements Notifier{
    protected Notifier notifier;
    NotifierDecorator(Notifier n){
        notifier = n;
    }
    public void send(){
        notifier.send();
    }
}