package Composite;

import java.util.ArrayList;
import java.util.List;

public class SentenceComposite implements Sentence{

    List<Sentence> childSentence = new ArrayList<>();

    @Override
    public void print() {
        childSentence.forEach(Sentence::print);
    }

    public void add(Sentence s) {
        if (!childSentence.contains(s)) {
            childSentence.add(s);
        }
    }

    public void remove(Sentence s) {
        childSentence.remove(s);
    }
}
