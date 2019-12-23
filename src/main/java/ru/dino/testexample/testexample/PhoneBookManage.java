package ru.dino.testexample.testexample;


import java.util.List;

public interface PhoneBookManage {

    // add contact
    void addPB(Contact contact);


    // редактируем пользователя
    Contact edit(Contact contact);

    // show all contacts
    List<Contact> showAllContacts();
}
