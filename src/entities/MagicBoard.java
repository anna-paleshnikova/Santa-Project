package entities;

import observer.Observable;
import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class MagicBoard implements Observable {

    private List<Observer> observers;
    private Boolean isDoll;
    

    public MagicBoard(){
        this.observers = new ArrayList<>();
    }

    public void makeDoll() {
        System.out.println("Toy is doll");
        this.isDoll = true;
        this.notifyObservers();
    }

    
    public void makeBike() {
        System.out.println("Toy is bike");
        this.isDoll = false;
        this.notifyObservers();
    }

    @Override
    public void subscribe(Observer observer) {
        this.observers.add(observer);
        observer.setMagicBoard(this);
    }

    @Override
    public void unsubscribe(Observer observer) {
        this.observers.remove(observer);
        observer.setMagicBoard(null);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer:this.observers) {
            observer.update();
        }
    }

    @Override
    public Boolean getToy() {
        return this.isDoll;
    }
}
