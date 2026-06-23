public class RemoteControl{
    private Command command;
    public void setCommand(Command c){
        command = c;
    }
    public void executeCommand(){
        command.execute();
    }
}