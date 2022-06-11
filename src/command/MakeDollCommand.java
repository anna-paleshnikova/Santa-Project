package command;

import entities.MagicBoard;

public class MakeDollCommand implements Command {
    private MagicBoard toyOnBoard;

    public MakeDollCommand(MagicBoard toyOnBoard) {
        this.toyOnBoard = toyOnBoard;
    }

    @Override
    public void execute() {
        this.toyOnBoard.makeDoll();
        
    }

    @Override
    public void undo() {
        this.toyOnBoard.makeBike();
        
    }
}
