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

        // Adding personal details to address book
        addressBookmain.contact = addressFun.getUserContactDetails();
        addressFun.displayUserContactDetails();

    }




    public boolean createContact(Contact contact)
    {
        this.contact=contact;
        if(this.contact==null)
        {
            return false;}
        { return true;}
    }}





