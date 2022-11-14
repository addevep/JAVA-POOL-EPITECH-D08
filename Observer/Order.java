package Observer;

import java.util.ArrayList;
import java.util.List;

public class Order implements Observable {

    private String position;
    private String destination;
    private int timeBeforeArrival;

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public boolean notifyObservers() {
        observers.forEach((c) -> {
            c.update(this);
        });
        return false;
    }

    public String getPosition() {
        return position;
    }

    public String getDestination() {
        return destination;
    }

    public int getTimeBeforeArrival() {
        return timeBeforeArrival;
    }

    public void setData(String pos, String dest, int time) {
        this.position = pos;
        this.destination = dest;
        this.timeBeforeArrival = time;
        notifyObservers();
    }
}
