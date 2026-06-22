class ProxyTest{
    public static void main(String[] args){
        Image img = new ProxyImage("photo.jpg"); //calling Proxy 
         System.out.println("------------------------------");
         System.out.println("Initial Display");
        img.display();            //calling Real Image
        System.out.println("------------------------------");
         System.out.println("Second Display");
        img.display();
    }
}