package others;

import models.ElementinLibrary;

import java.util.Comparator;

public abstract class ElementComparator  implements Comparator<ElementinLibrary> {

    public int compare(ElementinLibrary b1, ElementinLibrary b2) {
        return b1.getGenre().equals(b2.getGenre()) ? b1.compareTo(b2) : b1.getGenre().compareTo(b2.getGenre());
    }
}
