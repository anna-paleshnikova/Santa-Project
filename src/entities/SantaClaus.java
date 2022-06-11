package entities;

import command.Command;

public class SantaClaus {
    private static SantaClaus instance;
	
	 private SantaClaus() {
		// TODO Auto-generated constructor stub
	}
	

	public static SantaClaus getInstance() {
		
		if(instance == null) {
			instance = new SantaClaus();
		}
		
		return instance;
	}
    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void toy(){
        if(this.command==null){
            System.out.println("no command set");
            return;
        }
        this.command.execute();
    }

}
