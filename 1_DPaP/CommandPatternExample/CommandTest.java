class CommandTest{
    public static void main(String[] args){
        Light light = new Light();
        LightOnCommand onC = new LightOnCommand(light);
        LightOffCommand offC = new LightOffCommand(light);
        RemoteControl remote = new RemoteControl();
        remote.setCommand(onC);
        remote.executeCommand();
        remote.setCommand(offC);
        remote.executeCommand();


        //System.out.println("------------------------------");

    }
}