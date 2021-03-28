package com.project1;


import org.junit.Assert;
import org.junit.Test;

public class AddressBook {
    @Test
    public void createContact_whenProper_returnTRue() {
        Contact contact = new Contact("AA","bb","3344","aside");
        AddressBookmain addressBookmain = new AddressBookmain();
        boolean contactState= addressBookmain.createContact(contact);
        Assert.assertEquals(true,contactState);
    }

    @Test
    public void createAddress_whenProper_returnTrue() {
        Address address =new Address("Nagpur","MH","2345");
        AddressBookmain addressBookmain=new AddressBookmain();
        boolean addressContact= addressBookmain.createAddress(address);
        Assert.assertEquals(true,addressContact);
    }
}
