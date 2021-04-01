package com.project1;

import java.util.Comparator;

public class SortZip implements Comparator<Contact> {
    @Override
    public int compare(Contact o1, Contact o2) {
        int zipRes=0;
        try {
            zipRes= o1.getZip().compareTo(o2.getZip());
        }
        catch (NullPointerException e)
        {

        }
        return zipRes;
    }
}
