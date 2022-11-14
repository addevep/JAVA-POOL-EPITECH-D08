package Factory;

import java.util.ArrayList;
import java.util.List;

public class Elf {
    private Toy toy = null;
    private List<GiftPaper> papers = new ArrayList<>();
    private Factory factory;

    public Elf(Factory factory) {
        this.factory = factory;
    }

    public boolean pickToy(String str) {
        if (toy == null) {
            try {
                factory.create(str);
                System.out.println("What a nice one! I would have liked to keep it...");
                return true;
            } catch (NoSuchToyException e) {
                System.out.println(e.getMessage());
                System.out.println("I didn't find any " + str + ".");
                return false;
            }
        } else {
            System.out.println("Minute please?! I'm not that fast.");
            return false;
        }
    }

    public boolean pickPapers(int nb) {
        papers.addAll(factory.getPapers(nb));
        return true;
    }

    public GiftPaper pack() {
        if (toy == null) {
            System.out.println("I don't have any toy, but hey at least it's paper!");
            return papers.remove(0);
        }
        if (papers.size() == 0) {
            System.out.println("Wait... I can't pack it with my shirt.");
            return null;
        }
        System.out.println("And another kid will be happy!");
        GiftPaper packed = papers.get(0);
        packed.wrap(toy);
        this.toy = null;
        papers.remove(0);
        return packed;
    }
}
