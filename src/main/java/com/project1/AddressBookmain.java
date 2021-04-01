package com.project1;

import java.util.*;

public class AddressBookmain {

    private static int cityCount;
    Contact contact;
    private static AddressFun addressFun;
    private static SortAddress sortAddress;

    public static void main(String[] args) {
        AddressBookmain addressBookmain = new AddressBookmain();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome To Address Book");
        addressFun.createMultipleAddressBook();
        addressFun.editContactDetails();
        addressFun.deleteContactDetails();

    }//End of main

    public boolean createContact(Contact contact)
    {
        this.contact=contact;
        if(this.contact==null)
        {
            return false;}
        { return true;}
    }

    public boolean editcontact(Contact contact)
    {
        this.contact=contact;
        if(this.contact==null)
        {
            return false;}
        { return true;}
    }
    public boolean deletecontact(Contact contact)
    {
        this.contact=contact;
        if(this.contact==null)
        {
            return false;}
        { return true;}
    }
}





