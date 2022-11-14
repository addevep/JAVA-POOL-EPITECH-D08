package Observer;

public interface Observable {
    void addObserver(Observer o);
    boolean notifyObservers();
}
