package model;

public class User {
//Одно поле, методов нет кроме геттера, запихал в model

    private final String name;

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override //Отображается без getName()
    public String toString() {
        return "пользователь "+ name;
    }


}
