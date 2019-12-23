package ru.dino.testexample.testexample;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserManage {

    User add(String name, String number);

    //получение по id
    User idGet(int id);

    // показать всех пользователей
    List<User> showAll();

    // удаление пользователя
    void remove(int id);

    // поиск пользователя
    List<User> find(String name);

    // редактируем пользователя
    User edit(String name, String number);

    User addContact(Contact contact);

    List<Contact> showAllContacts();

}
