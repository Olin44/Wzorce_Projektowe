package Iterator;

import java.util.ArrayList;
import java.util.List;

public class MyTab {
    private List<Integer> tab = new ArrayList<>();

    public List<Integer> getTab() {
        return tab;
    }

    public void add(int value) {
        tab.add(value);
    }

    public FullIterator getFullIterator(){
        return new FullIterator(this);
    }
    public IteratorWithoutZeros getIteratorWithoutZeros(){
        return new IteratorWithoutZeros(this);
    }


}
