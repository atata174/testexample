package ru.dino.testexample.testexample;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PhoneBookService implements PhoneBookManage {

    UserManage userManage;
    ContactManage contactManage;


    @Override
    public void addPB(Contact contact) {
        this.userManage.addContact(contact);
    }

    @Override
    public Contact edit(Contact contact) {
        this.contactManage.edit(contact);
        return null;
    }

    @Override
    public List<Contact> showAllContacts() {
        return userManage.showAllContacts();
    }

}
