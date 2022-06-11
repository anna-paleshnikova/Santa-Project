package command;

import entities.MagicBoard;

public class MakeBikeCommand implements Command {
    private MagicBoard toyOnBoard;

    public MakeBikeCommand(MagicBoard toyOnBoard) {
        this.toyOnBoard = toyOnBoard;
    }

    @Override
    public void execute() {
        this.toyOnBoard.makeBike();
        
    }

    @Override
    public void undo() {
        this.toyOnBoard.makeDoll();
    }
}
