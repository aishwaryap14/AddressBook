package com.project1;

public class AddressBookmain {
    Contact contact;
    Address address;
    public static void main(String[] args) {
        System.out.println("Welcome To Address Book");
    }

    public boolean createContact(Contact contact)
    {
        this.contact=contact;
        if(this.contact==null)
        {
            return false;}
        { return true;}
    }

    public boolean createAddress(Address address)
    {
        this.address=address;
        if(this.address==null)
        {
            return false;}
        { return true;}
    }


}
