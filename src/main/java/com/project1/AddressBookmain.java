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

        System.out.println("Enter choice code for operation to perform: 1.Add contact details \n 2.Display Contact details \n" +
                "3.Edit Contact details \n 4.Delete contact details");
        int choice=sc.nextInt();
        switch (choice) {
            // Adding personal details to address book
            case 1:  addressBookmain.contact = addressFun.getUserContactDetails();
                     //break;
            case 2:  addressFun.displayUserContactDetails();
                     //break;
            case 3:  addressFun.editContactDetails();
                     //break;
            case 4:  addressFun.deleteContactDetails();
                    // break;
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
    public boolean deletecontact(Contact contact)
    {
        this.contact=contact;
        if(this.contact==null)
        {
            return false;}
        { return true;}
    }
}





