package com.obeidat.mohammad;

import java.util.*;

class PhoneBook {

    ArrayList<Contact> phoneBook = new ArrayList<>();

    // Utility Function To Add New Contact.
    public void addNewContact(Contact contact) {
        if(phoneBook.add(contact)){
            System.out.print("Contact Added Successfully. \n __________________________________________________________");
        }
    }

    // *************************************************************************************************************************************

    // Utility Function To Find Specific Contact Using Name.
    public Contact findContact(String name) {

        Contact result = new Contact();

        for (Contact contact : phoneBook) {
            if (contact.getName().equals(name)) {
                result = contact;
            } else {
                System.out.print("There is no contact in that given name !!");
            }
        }
        return result;
    }

    // *************************************************************************************************************************************

    // Utility Function To Find Specific Contact Using Phone Number.
    public Contact findContact(long phoneNumber) {

        Contact result = new Contact();

        for (Contact contact : phoneBook) {
            if (contact.getPhoneNumber() == phoneNumber) {
                result = contact;
            } else {
                System.out.print("There is no contact that have the given name !!");
            }
        }
        return result;
    }

    // *************************************************************************************************************************************

    // Utility Function To Remove Specific Contact.
    public String removeContact(String name) {

        Contact contact = findContact(name);

        String result;
        if (phoneBook.size() == 0) {
            result = "The PhoneBook Is Empty!!";
        } else if (!(phoneBook.contains(contact))) {
            result = "Contact Is Not Found! \n";
        } else {
            if (phoneBook.remove(contact)) {
                result = "Contact Deleted Successfully.\n";
            } else {
                result = "Cannot Delete the contact.\n";
            }
        }
        return result;
    }

    // *************************************************************************************************************************************

    // Utility Function To Show All Contacts.
    public void display() {
        if (phoneBook.size() == 0) {
            System.out.println("No Contacts.! \n ________________________________________________________________________________");
        } else {
            for (Contact contact : phoneBook) {
                System.out.print(
                        contact.getName() + "\n" + contact.getPhoneNumber() + "\n" + "_________________________________________ \n");
            }
        }
    }
}