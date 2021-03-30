package com.project1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressFun {

    private static Scanner sc = new Scanner(System.in);
    public static List<Contact> contacts = new ArrayList();

    //Create contacts in address book
    static Contact getUserContactDetails() {
        //Contact c;

        System.out.println("Enter First Name= ");
        String firstname = sc.nextLine();
        System.out.println("Enter Last Name= ");
        String lastname = sc.nextLine();
        System.out.println("Enter Phone Number= ");
        String phoneNo = sc.nextLine();
        System.out.println("Enter E-mail address= ");
        String email = sc.nextLine();
        System.out.println("Enter address= ");
        String address = sc.nextLine();
        System.out.println("Enter City= ");
        String city = sc.nextLine();
        System.out.println("Enter State= ");
        String state = sc.nextLine();
        System.out.println("Enter Zip= ");
        String zip = sc.nextLine();

        Contact contact = new Contact(firstname, lastname, phoneNo, email, address, city, state, zip);
        contacts.add(contact);

        return contact;

    }

    static void displayUserContactDetails() {
        //To display personal details
        for (int i=0;i<contacts.size();i++)
        {
            System.out.println("Person's Details: "+contacts.get(i));

        }

    }
}