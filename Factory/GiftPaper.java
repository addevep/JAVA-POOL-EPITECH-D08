package Factory;

public class GiftPaper {

    protected Toy gift;

    public void wrap(Toy toy) {
        this.gift = toy;
    }

    public Toy unwrap() {
        Toy temp = this.gift;
        this.gift = null;
        return temp;
    }
}
