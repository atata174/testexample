package ru.dino.testexample.testexample;

import java.util.List;

public interface ContactManage {
    public Contact add(String name, String number);

    //получение по id
    public Contact getId(int id);

    // показать всех пользователей
    public List<Contact> showAll();

    // удаление пользователя
    public void remove(int id);

    // поиск пользователя
    public List<Contact> find(String name);

    // редактируем пользователя
    public Contact edit(String name, String number);

    void edit(Contact contact);
}
