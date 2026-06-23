public class loggerTest{
    public static void main(String[] args){
        Logger l1, l2;
        l1 = Logger.createLogger();
        l2 = Logger.createLogger();
        if(l1 == l2){
            System.out.println("Singleton! XD");
        } else {
            System.out.println("Not Singleton :()");
        }
    }
}