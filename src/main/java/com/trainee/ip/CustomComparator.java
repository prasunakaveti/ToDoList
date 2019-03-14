package com.trainee.ip;
/* *
 * Created by @ gnanaprasunakaveti on 2019-03-10
 *
 */

import java.util.Comparator;

public class CustomComparator implements Comparator<Model> {
    @Override
    public int compare(Model o1, Model o2) {
        return o1.getDueDate().compareTo(o2.getDueDate());
        //Overriding the compare method to sort the list with age
    }
}