class DecoratorTest{
    public static void main(String[] args){
        System.out.println("Email only");
        Notifier n = new EmailNotifier();
        n.send();
        System.out.println("------------------------------");
        System.out.println("Email and SMS");
        Notifier n1 = new SMSNotifierDecorator(new EmailNotifier());
        n1.send();
         System.out.println("------------------------------");
        System.out.println("Email, SMS and Slack");
        Notifier n2 = new SlackNotifierDecorator(new SMSNotifierDecorator(new EmailNotifier()));
        n2.send();

    }
}