package com.project1;

import java.util.Comparator;

public class SortAddress implements Comparator<Contact> {

    @Override
    public int compare(Contact o1, Contact o2) {
        int result = 0;
        try {
            result= o1.getFirstname().compareTo(o2.getFirstname());
        }
        catch (NullPointerException e)
        {
            
        }
        return result;
    }


}
