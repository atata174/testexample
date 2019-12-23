package ru.dino.testexample.testexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/index")
public class AppController {

    PhoneBookManage phoneBookManage;

    UserManage userManage;

    ContactManage contactManage;

    UserService userService;


    //показать список всех пользователей
    @GetMapping(value = "/" )
    public List<User> showAll(){
        return userManage.showAll();
    }

    // добавить пользователя
    @PostMapping(value ="/")
    public User addUs(@RequestParam String name, @RequestParam String number){
        return userManage.add(name, number);
    }

    //Получение пользователя по айди
    @GetMapping(value = "/users/{id}")
    public User idGet(@RequestParam int id){
        return userService.idGet(id);
    }

    // редактировать пользователя
    @PostMapping(value = "/users/{id}")
    public User editU(@RequestParam String name, @RequestParam String number){
        return userManage.edit(name, number);
    }

    // удаление пользователя
    @DeleteMapping(value = "/users/{id}")
    public void delete(@RequestParam int id){
        userManage.remove(id);
    }

    // получение списка всех контактов пользователя
    @GetMapping(value = "/users/{id}/contacts")
    public List<Contact> showCL(@RequestParam int id){
        return phoneBookManage.showAllContacts();
    }

    // добавление контакта в телефонную книгу пользователя
    @PostMapping("/users/{id}/contacts")
    public List<Contact> addContact(@RequestParam int id){
        return null;
    }

    // поиск
    @GetMapping(value = "find{name}")
    public List<User> find(@RequestParam String name){
        return userManage.find(name);
    }

}
