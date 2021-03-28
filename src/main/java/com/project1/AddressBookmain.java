package com.project1;

import java.util.Scanner;

public class AddressBookmain {
    Contact contact;
    Address address;
    public static void main(String[] args) {
        AddressBookmain addressBookmain =new AddressBookmain();
        System.out.println("Welcome To Address Book");
        addressBookmain.contact=getUserContactDetails();
        addressBookmain.address=getUserAddressDetails();
    }


    private static Contact getUserContactDetails()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Name= ");
        String firstname=sc.nextLine();
        System.out.println("Enter Last Name= ");
        String lastname=sc.nextLine();
        System.out.println("Enter Phone Number= ");
        String phoneNo=sc.nextLine();
        System.out.println("Enter E-mail address= ");
        String email=sc.nextLine();
        return new Contact(firstname,lastname,phoneNo,email);
    }

    private static Address getUserAddressDetails()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter City Name= ");
        String city=sc.nextLine();
        System.out.println("Enter State Name= ");
        String state=sc.nextLine();
        System.out.println("Enter Zip Code= ");
        String zip=sc.nextLine();
        return new Address(city,state,zip);
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
