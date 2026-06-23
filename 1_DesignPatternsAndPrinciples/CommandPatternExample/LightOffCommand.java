public class LightOffCommand implements Command{
    private Light light;
    LightOffCommand(Light l){
        light = l;
    }
    public void execute(){
        System.out.println("Turning light off...");
        light.turnOff();
    }
}