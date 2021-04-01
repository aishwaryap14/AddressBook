package com.project1;

import java.util.*;
import java.util.stream.Collectors;

public class AddressFun {
    //private static Object contact;
    AddressBookmain addressBookmain=new AddressBookmain();
    private static int count;
    private static Contact contact;
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
            getUserContactDetails();
        }
    } //End of createMultipleAddressBook

    //Create contacts in address book
    static Contact getUserContactDetails() {
        System.out.println("Enter City= ");
        String city = sc.nextLine();
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
        findDuplicateContacts(contacts);
        return contact;
    } //End of getUserContactDetails



    static void findDuplicateContacts(List<Contact> contacts)
    {
        List<Contact> displayContact = new ArrayList<>();
        for (Contact num : contacts)
        {

            if (Collections.frequency(contacts, num) > 1)
            {
                displayContact.add(num);
            }
        }
                displayUserContactDetails(contacts);
    }//End of findDuplicateContacts

    static void displayUserContactDetails(List<Contact>contacts)
    {
        contacts.forEach(System.out::println);
        displayContactsByCity(contacts);
        sortContactDetails(contacts);
        sortByZipCode(contacts);
    } //End of displayUserContactDetails


    static Contact editContactDetails()
    {
        System.out.println("Enter First name to modify details: ");
        String name = sc.nextLine();
             if(name.equals(contact.getFirstname()) )
            {
                  for (int i = 0; i < count; i++) {
                  Contact contact = contacts.get(i);
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
            }
            else
            {
                System.out.println("No such Contact Available !!");
            }
        
        contacts.add(contact);
        displayUserContactDetails(contacts);
     return contact;
    }// End of editContactDetails

    static void deleteContactDetails()
    {
        System.out.println("Enter First name which you want to delete: ");
        String name = sc.nextLine();


            if (name.equalsIgnoreCase(contact.getFirstname()))
            {
                for (int i = 0; i < count; i++) {
                    Contact contact = contacts.get(i);
                contacts.remove(i);
                count--;
            }  }
            else
            {
                System.out.println("No such Contact Available !!");
            }
        
        displayUserContactDetails(contacts);
    }  //End of deleteContactDetails


    static void displayContactsByCity(List<Contact>contacts)
    {
        System.out.println("Please enter the name of city:");
        String choice = sc.nextLine();
        int countContacts=0;
        for (int i = 0; i< contacts.size(); i++)
        {
            try
            {
                if (contacts.get(i).getCity().equalsIgnoreCase(choice)  )
                {
                countContacts++;
                System.out.println("Address Book of City: " + choice + " " + contacts);
                System.out.println("There are total " + countContacts + "Contacts available of City: " + choice);
                }
            else
                {
                System.out.println("Wrong City name");
                }
            }
            catch (NullPointerException e)
            {
                
            }
        }

    } //End of displayContactsByCity

    static void sortContactDetails(List<Contact>contacts)
    {
        Collections.sort(contacts, new SortAddress());

        System.out.println("\nSorted by First name: ");
        for (int i=0; i<contacts.size(); i++)
        {
            System.out.println(contacts.get(i));
        }
    } //End of sortContactDetails

    static  void sortByZipCode(List<Contact>contacts)
    {
        Collections.sort(contacts, new SortZip());

        System.out.println("\nSorted by zip code: ");
        for (int i=0; i<contacts.size(); i++)
        {
            System.out.println(contacts.get(i));
        }

    }//End of sortByZipCode
}

