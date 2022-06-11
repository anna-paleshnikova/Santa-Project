import command.Command;
import command.MakeBikeCommand;
import command.MakeDollCommand;
import entities.Elfs;
import entities.MagicBoard;
import abstractfactory.*;
import entities.SantaClaus;

public class AppMain {
    public static void main(String[] args) {
    	
        SantaClaus santaClaus = SantaClaus.getInstance();
        MagicBoard board = new MagicBoard();
        Elfs elf1 = new Elfs("Tom");
        board.subscribe(elf1);
        Elfs elf2 = new Elfs("Ed");
        board.subscribe(elf2);
        Elfs elf3 = new Elfs("Ted");
        board.subscribe(elf3);
        Command makeDollCommand = new MakeDollCommand(board);
        Command makeBikeCommand = new MakeBikeCommand(board);
        santaClaus.setCommand(makeDollCommand);
        santaClaus.toy();

        santaClaus.setCommand(makeBikeCommand);
        santaClaus.toy();
        
    	AbstractFactory typeFactory = FactoryProducer.getFactory("SHAPE");
		Type doll = typeFactory.getType("DOLL");
		doll.make();

		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		Color pink = colorFactory.getColor("PINK");
		pink.fill();

    }
}
