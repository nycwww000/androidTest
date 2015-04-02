package com.example.nycwww000.fucker;

public class Person {

    private int _id;
    private String _name;

    public Person(String _name)
    {
        this._name = _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public int get_id() {
        return _id;
    }

    public String get_name() {
        return _name;
    }
}
