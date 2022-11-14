package Factory;

import java.util.ArrayList;
import java.util.List;

public class Factory {

    public Toy create(String str) throws NoSuchToyException {
        if (str.equals("teddy")) {
            return new TeddyBear();
        } else if (str.equals("gameboy")) {
            return new Gameboy();
        } else {
            throw new NoSuchToyException("No such toy: " + str + ".");
        }
    }

    public List<GiftPaper> getPapers(int n) {
        List<GiftPaper> list = new ArrayList<>();
        for (int i = n ; i > 0 ; i--) {
            list.add(new GiftPaper());
        }
        return list;
    }
}
