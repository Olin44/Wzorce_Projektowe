package Iterator;

import java.util.NoSuchElementException;

public class IteratorWithoutZeros {
    private MyTab myTab;
    private java.util.Iterator iterator;
    private int value = 0;

    public IteratorWithoutZeros(MyTab myTab) {
        this.myTab = myTab;
    }

    public void first() {
        iterator = myTab.getTab().iterator();
        next();
    }

    public void next() {
        try {
            value = (Integer)iterator.next();
            if(value == 0){
                next();
            }
        } catch (NoSuchElementException ex) {
            value =  -1;
        }
    }

    public boolean isDone() {
        return value == -1;
    }

    public int currentItem() {
        return value;
    }
}
