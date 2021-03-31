package com.project1;

import java.util.Comparator;

public class SortAddress implements Comparator<Contact> {
    @Override
    public int compare(Contact o1, Contact o2) {
        return o1.getFirstname().compareTo(o2.getFirstname());

    }
}
