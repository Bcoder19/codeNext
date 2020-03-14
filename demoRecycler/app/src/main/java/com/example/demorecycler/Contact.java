package com.example.demorecycler;

public class Contact {
    private int profilePicture;
    private String name;
    private String number;

    public Contact(int profilePicture, String name, String number){
        this.profilePicture = profilePicture;
        this.name = name;
        this.number = number;
    }


    public int getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(int profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
