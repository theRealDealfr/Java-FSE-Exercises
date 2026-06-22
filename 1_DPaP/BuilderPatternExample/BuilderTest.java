public class BuilderTest{
    public static void main(String[] args){
        Computer PC = new Computer.Builder().setCPU("intel i7").setRAM(16).setStorage("1TB SSD").build();
        PC.displaySpecs();

        Computer lap = new Computer.Builder().setCPU("intel i5").setRAM(8).setStorage("800 GB").build();
        lap.displaySpecs();
    }

}