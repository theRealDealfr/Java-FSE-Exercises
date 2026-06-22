class ProxyImage implements Image{
    String filename;
    RealImage r;
    ProxyImage(String f){
        filename = f;
    }
    public void display(){
        if(r == null){
            r = new RealImage(filename);
        }
        r.display();
    }
}