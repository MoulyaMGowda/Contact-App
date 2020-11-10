package com.example.contactapp;

public class ContactModel {

    String ContactName, ContactNumber,ContactEmail;
    int imageResId = 0;

    public ContactModel(String mContactName, String mContactNumber, String mContactEmail, int mImageResId){
        this.ContactName = mContactName;
        this.ContactNumber = mContactNumber;
        this.ContactEmail = mContactEmail;
        this.imageResId = mImageResId;
    }

    public String getContactName() {
        return ContactName;
    }

    public void setContactName(String ContactName) {
        ContactName = ContactName;
    }

    public String getContactNumber() {
        return ContactNumber;
    }

    public void setContactNumber(String ContactNumber) {
        ContactNumber = ContactNumber;
    }

    public String getContactEmail() {
        return ContactEmail;
    }

    public void setContactEmail(String ContactEmail) {
        ContactEmail = ContactEmail;
    }

    public int getImageResId() {
        return imageResId;
    }

    public void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }
    public boolean hasImage(){
        return imageResId!=0;

    }

}


