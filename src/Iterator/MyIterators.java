package Iterator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MyIterators {
    public static void main(String[] args) {
        MyTab myTab = new MyTab();

        for (int i = 1; i < 10; i++) {
            myTab.add(i % 2);
        }

        FullIterator fullIterator = myTab.getFullIterator();
        IteratorWithoutZeros iteratorWithoutZeros = myTab.getIteratorWithoutZeros();


        System.out.println("Full iterator");
        for (fullIterator.first(); !fullIterator.isDone(); fullIterator.next()) {
            System.out.print(fullIterator.currentItem() + "  ");
        }

        System.out.println();
        System.out.println("Iterator without zeros");


        for (iteratorWithoutZeros.first(); !iteratorWithoutZeros.isDone(); iteratorWithoutZeros.next()) {
            System.out.print(iteratorWithoutZeros.currentItem() + "  ");
        }

        System.out.println();
    }
}
