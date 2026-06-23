public class Computer{
    String CPU;
    int RAM;
    String Storage;
    private Computer(Builder b){
        this.CPU = b.CPU;
        this.RAM = b.RAM;
        this.Storage = b.Storage;
    }
    public void displaySpecs() {
        System.out.println("CPU: " + this.CPU);
        System.out.println("RAM: " + this.RAM);
        System.out.println("Storage: " + this.Storage);
    }

    public static class Builder{
        String CPU;
        int RAM;
        String Storage;
        public Builder setCPU(String cpu){
            CPU = cpu;
            return this;
        }
        public Builder setRAM(int ram){
            RAM = ram;
            return this;
        }
        public Builder setStorage(String s){
            Storage = s;
            return this;
        }
        public Computer build(){
            return new Computer(this);
        }
    }
}