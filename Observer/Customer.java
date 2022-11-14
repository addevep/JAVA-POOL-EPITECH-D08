package Observer;

public class Customer implements Observer{

    public Customer() {

    }

    @Override
    public void update(Observable o) {
        if (o instanceof Order) {
            System.out.println("Position (" + ((Order) o).getPosition() + "), " + ((Order) o).getTimeBeforeArrival() + " minutes before arrival at " + ((Order) o).getDestination() + ".");

        }
    }
}
