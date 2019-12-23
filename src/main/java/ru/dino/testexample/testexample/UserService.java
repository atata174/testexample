package ru.dino.testexample.testexample;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements UserManage{

    private User user;
    private ContactManage contactManage;


    @Override
    public User add(String name, String number) {
        return new User(name, number);
    }

    @Override
    public User idGet(int id) {
        for (int i = 0; i < User.usersList.size(); i++) {
            if(id == User.usersList.get(i).getId()){
                return User.usersList.get(i);
            }
            else{
            }
        }
        return null;
    }

    @Override
    public List<User> showAll() {
        return User.usersList;
    }

    @Override
    public void remove(int id) {
        for (int i = 0; i < User.usersList.size(); i++) {
            if(User.usersList.get(i).getId() == id){
                User.usersList.get(i).userPhoneBook = null;
                User.usersList.remove(i);
                break;
            }
        }
    }

    @Override
    public List<User> find(String name) {
        List<User> list = new ArrayList<User>();
        int count = 0;
        for (int i = 0; i < User.usersList.size(); i++) {
            if(User.usersList.get(i).getName().contains(name)){
                list.add(User.usersList.get(i));
                count++;
            }
            else{
            }
        }
        if(count > 0){
            return list;
        } else return null;
    }

    @Override
    public User edit(String name, String number) {
        for (int i = 0; i < User.usersList.size(); i++) {
            if (User.usersList.get(i).getId() == this.user.getId()) {
                User.usersList.get(i).setName(name);
                User.usersList.get(i).setNumber(number);
            }
        }
        return this.user;
    }

    @Override
    public User addContact(Contact contact) {
        contactManage.add(contact.getName(), contact.getNumber());
        return this.user;
    }

    @Override
    public List<Contact> showAllContacts() {
        return this.user.userPhoneBook;
    }

}
