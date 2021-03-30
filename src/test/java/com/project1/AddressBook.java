package com.project1;


import org.junit.Assert;
import org.junit.Test;

public class AddressBook {
    @Test
    public void createContact_whenProper_returnTRue() {
        Contact contact = new Contact("Aishwarya","P","9876543","aishwarya@gmail.com","Nashik road","Nashik","maharashtra","333444");
        AddressBookmain addressBookmain = new AddressBookmain();
        boolean contactState= addressBookmain.createContact(contact);
        Assert.assertEquals(true,contactState);
    }

    @Test
    public void editContact_whenproper_returntrue() {
        Contact contact = new Contact("Aishwarya","P","9876543","aishwarya@gmail.com","Nashik road","Nashik","maharashtra","333444");
        AddressBookmain addressBookmain = new AddressBookmain();
        boolean contactState= addressBookmain.editcontact(contact);
        Assert.assertEquals(true,contactState); }

    @Test
    public void deleteContact_whenproper_returntrue() {
        Contact contact = new Contact("Aishwarya","P","9876543","aishwarya@gmail.com","Nashik road","Nashik","maharashtra","333444");
        AddressBookmain addressBookmain = new AddressBookmain();
        boolean contactState= addressBookmain.deletecontact(contact);
        Assert.assertEquals(true,contactState);}
}
