class RealImage implements Image{
    String filename;
    RealImage(String f){
        filename = f;
        System.out.println("Loading image from remote server...");
    }
    public void display(){
        System.out.println("Displaying image...");
    }
}