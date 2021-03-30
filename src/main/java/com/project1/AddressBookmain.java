package com.project1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AddressBookmain {


    Contact contact;
    private static AddressFun addressFun;


    public static void main(String[] args) {
        AddressBookmain addressBookmain = new AddressBookmain();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome To Address Book");

        System.out.println("Enter choice code for operation to perform: ");
        int choice=sc.nextInt();
        switch (choice) {
            // Adding personal details to address book
            case 1:  addressBookmain.contact = addressFun.getUserContactDetails();
            case 2:addressFun.displayUserContactDetails();

            case 3:addressFun.editContactDetails();
            default:main(args);
        }
    }




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
}





