package com.example.loginpage;

public class Student {
    private String _id;
    private String _Studentname;
    private String _Dep;

    public Student() {

    }

    public Student(String id, String Studentname, String Dep) {
        this._id = id;
        this._Studentname = Studentname;
        this._Dep = Dep;
    }

    public Student(String Studentname, String Dep) {
        this._Studentname = Studentname;
        this._Dep = Dep;
    }

    public void setID(String id) {
        this._id = id;
    }

    public String getID() {
        return this._id;
    }

    public void set_StudentName(String Studentname) {
        this._Studentname = Studentname;
    }

    public String get_StudentName() {
        return this._Studentname;
    }

    public void set_Dep(String Dep) {
        this._Dep = Dep;
    }

    public String get_Dep() {
        return this._Dep;
    }
}

