package com.example.humanoop;

import android.util.Log;

public class Anna extends Human {
    public int height;

    public Anna(String name, int age, int weight) {
        super(name, age, weight);
    }

    public Anna(String name, int age, int weight, int height) {
        super(name, age, weight);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void eat() {
        super.eat();
        weight=weight+2;
        Log.d("Anna","new weight is"+weight);
    }

    @Override
    public void birthday(int age) {
        //super.birthday(age);
        age = age + 4;
        Log.d("Anna","new age is"+age);
    }
}
