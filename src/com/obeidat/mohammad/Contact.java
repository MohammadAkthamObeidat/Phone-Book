package com.obeidat.mohammad;

class Contact {
    private String name;
    private long phoneNumber;

    // Empty Constructor.
    public Contact() {

    }

    public Contact(String name, long phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

}