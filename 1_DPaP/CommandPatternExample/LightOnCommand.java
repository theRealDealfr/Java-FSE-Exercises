public class LightOnCommand implements Command{
    private Light light;
    LightOnCommand(Light l){
        light = l;
    }
    public void execute(){
        System.out.println("Turning light on...");
        light.turnOn();
    }
}