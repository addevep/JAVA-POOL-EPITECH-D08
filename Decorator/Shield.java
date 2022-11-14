package Decorator;

public class Shield extends StuffDecorator{

    public Shield(Warrior war) {
        this.holder = war;
        System.out.println("May this shield protect me against every enemy.");
    }

    @Override
    public int getHp() {
        return super.getHp() + 10;
    }
}
