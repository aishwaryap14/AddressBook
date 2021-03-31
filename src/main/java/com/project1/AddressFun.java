package com.project1;

import java.util.*;

public class AddressFun {
    AddressBookmain addressBookmain=new AddressBookmain();
    private static int count;
    Contact contact;
    private static Scanner sc = new Scanner(System.in);

    public static List<Contact> contacts = new ArrayList();

    //int count=0;

    static void createMultipleAddressBook()
    {
        //Add multiple Address Books
        System.out.println("Enter the number of Address Books created: ");
        int n=sc.nextInt();
        Contact[] contactsBook=new Contact[n];


        Map<List<Contact>,String> contactStringMap=new HashMap<>();
        for (int i=0;i<n;i++)
        {
            System.out.println("enter the City names To create different Address Books: ");
            String cityName=sc.nextLine();
            contactStringMap.put(contacts, cityName);
            getUserContactDetails(contactStringMap.get(i));
            //cityCount++;
        }

        //return contacts;
    }

    //Create contacts in address book
    static Contact getUserContactDetails(String s) {
        System.out.println("Enter City= ");
        String city = sc.nextLine();
       //if(city.equalsIgnoreCase())
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

        System.out.println("Enter State= ");
        String state = sc.nextLine();
        System.out.println("Enter Zip= ");
        String zip = sc.nextLine();

        Contact contact = new Contact(firstname, lastname, phoneNo, email, address, city, state, zip);
        contacts.add(contact);
        count++;

        return contact;

    }

    static void displayUserContactDetails()
    {
        //To display personal details
        for (int i = 0; i < count; i++) {
            System.out.println("Person's Details: " + contacts.get(i));
        }
        //getUserContactDetails();
    }


    static Contact editContactDetails() {
        System.out.println("Enter First name to modify details: ");
        String name = sc.nextLine();
        for (int i = 0; i < count; i++) {
            Contact contact = contacts.get(i);

            if (name.equalsIgnoreCase(contact.getFirstname())) {
                System.out.println("Enter below details: ");

                System.out.println("Update First Name= ");
                String firstname = sc.nextLine();
                System.out.println("Update Last Name= ");
                String lastname = sc.nextLine();
                System.out.println("Update Phone Number= ");
                String phoneNo = sc.nextLine();
                System.out.println("Update E-mail address= ");
                String email = sc.nextLine();
                System.out.println("Update address= ");
                String address = sc.nextLine();
                System.out.println("Update City= ");
                String city = sc.nextLine();
                System.out.println("Update State= ");
                String state = sc.nextLine();
                System.out.println("Update Zip= ");
                String zip = sc.nextLine();

                contact.setLastname(lastname);
                contact.setPhoneNo(phoneNo);
                contact.setEmail(email);
                contact.setAddress(address);
                contact.setCity(city);
                contact.setState(state);
                contact.setZip(zip);

            }
            else
            {
                System.out.println("No such Contact Available !!");
            }

        }

        Contact contact = new Contact();
        contacts.add(contact);
        displayUserContactDetails();
        return contact;
    }

    static void deleteContactDetails()
    {
        System.out.println("Enter First name which you want to delete: ");
        String name = sc.nextLine();
        for (int i = 0; i < count; i++) {
            Contact contact = contacts.get(i);
            if (name.equalsIgnoreCase(contact.getFirstname()))
            {
                contacts.remove(i);
                count--;
            }
            else
            {
                System.out.println("No such Contact Available !!");
            }
        }
        displayUserContactDetails();
    }
}