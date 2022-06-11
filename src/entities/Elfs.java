package entities;

import observer.Observable;
import observer.Observer;

public class Elfs implements Observer {
    private Observable magicboard;
    private String name;

    public Elfs(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        Boolean isToyDoll;
        if (this.magicboard == null) {
            System.out.println("No doll set");
            return;
        }
        isToyDoll = this.magicboard.getToy();
        if(isToyDoll){
            System.out.println(this.name + " is making doll");
        }
        else{
            System.out.println(this.name + " is making bike");
        }
    }

    @Override
    public void setMagicBoard(Observable trainee) {
        this.magicboard = trainee;
    }
}
