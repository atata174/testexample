package ru.dino.testexample.testexample;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ContactService implements ContactManage {

    private Contact contact;
    private User user;

    @Override // add contact
    public Contact add(String name, String number) {
        return new Contact(name, number);
    }

    @Override // get id
    public Contact getId(int id) {
        for (int i = 0; i < this.user.userPhoneBook.size(); i++) {
            if(this.user.userPhoneBook.get(i).getId() == id){
                return this.user.userPhoneBook.get(i);
            }
            else{
            }
        }
        return null;
    }

    @Override // show all contact
    public List<Contact> showAll() {
        return this.user.userPhoneBook;
    }

    @Override // remove contact
    public void remove(int id) {
        for (int i = 0; i < this.user.userPhoneBook.size(); i++) {
            if(this.user.userPhoneBook.get(i).getId() == id){
                this.user.userPhoneBook.remove(i);
                break;
            }
        }

    }

    @Override // find contact
    public List<Contact> find(String name) {
        List<Contact> list = new ArrayList<Contact>();
        int count = 0;
        for (int i = 0; i < this.user.userPhoneBook.size(); i++) {
            if(this.user.userPhoneBook.get(i).getName().contains(name)){
                list.add(this.user.userPhoneBook.get(i));
                count++;
            }
            else{
            }
        }
        if(count > 0){
            return list;
        } else return null;
    }

    @Override // edit contact
    public Contact edit(String name, String number) {
        this.contact.setName(name);
        this.contact.setNumber(number);

        return this.contact;
    }

    @Override
    public void edit(Contact contact) {

    }
}
