package com.example.humanoop;

import android.util.Log;

public class Human {
   public String Name;
   public int age;
   public int weight;

    public Human(String name, int age, int weight) {
        Name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void eat(){
        Log.d("Human","Iam eating food");
    }
    public void sleep(){
        Log.d("Human","zzzzzzzzzz");
    }
    public void sleep(int hours){
        Log.d("Human","iam sleeping for" + hours +"hours");
    }
    public void speak(String speech){
        Log.d("Human",speech);
    }

    public void birthday(int age){
        age =age+1;
        Log.d("Human","New age is " +age);

    }
}


