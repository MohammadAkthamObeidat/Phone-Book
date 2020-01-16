package com.obeidat.mohammad;

import java.util.*;

class Main {

    public static void main(String[] args) {
        // Welcome Message.
        System.out.println("Welcome To Simple PhoneBook App :) \n Please Select What you Want To Do By Pressing The Number of Below :");
        // Initialize The PhoneBook.
        PhoneBook phoneBook = new PhoneBook();
        // Initialize Scanner Object To Deal With Users Inputs.
        Scanner input = new Scanner(System.in);
        // Variable Used To Control User Inputs.
        int selection;

        // Declare Contact Name And Phone Number Variables To Make The User Deal With them.
        String name;
        long phoneNumber;

        // Variable To Control While Loop.
        int flag = 0;

        while (flag == 0) {

            System.out.println("\n 1. Show Users. \n 2. Add New Contact. \n 3. Search Contact By Name. \n 4. Search Contact By Phone Number. \n 5. Remove Contact. \n 0. EXIT. \n");
            selection = input.nextInt();
            // Invoke 'nextLine()' method to void console from skipping the user input in the next "nextLine()" method.
            input.nextLine();

            switch (selection) {
                case 0:
                    System.out.print("Thank For Using My Simple App. \n See You Later.");
                    flag++;
                case 1:
                    phoneBook.display();
                    break;
                case 2:
                    System.out.print("Please Enter The Name: \n");
                    name = input.nextLine();
                    System.out.print("Please Enter The Phone Number: \n");
                    phoneNumber = input.nextLong();
                    phoneBook.addNewContact(new Contact(name, phoneNumber));
                    break;
                case 3:
                    System.out.print("Please Enter The Contact Name To Search: ");
                    name = input.nextLine();
                    Contact searchedContact = phoneBook.findContact(name);
                    System.out.print("Name: " + searchedContact.getName() + "\n Phone Number: " + searchedContact.getPhoneNumber() + "\n");
                    break;
                case 4:
                    System.out.print("Please Enter The Contact Number To Search: ");
                    phoneNumber = input.nextLong();
                    Contact contactByPhoneNumber = phoneBook.findContact(phoneNumber);
                    System.out.print("Name: " + contactByPhoneNumber.getName() + "\n Phone Number: " + contactByPhoneNumber.getPhoneNumber() + "\n");
                    break;
                case 5:
                    System.out.print("Please Enter The Name To Delete: ");
                    name = input.nextLine();
                    System.out.print(phoneBook.removeContact(name));
                    break;
                default:
                    System.out.print("There is No Select");
                    break;
            }
        }
    }
}