package service;

import java.util.ArrayList;
import java.util.List;

import model.User;


public class Persister {
    //имитация работы DB
    //конструктор не нужен, а аргумент передаём в метод
    
    private static final List<User> UsersDB = new ArrayList<>();

    public int saveUser(User user){
        int id = UsersDB.size();
        UsersDB.add(user);
        System.out.println("Saved user: " + user + " assigned id="+id);
        return id;
    }

    public int findUser(User user){
        return UsersDB.indexOf(user);
    }
    
}
