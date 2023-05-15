package org.example.Singleton1;

public class Main {
    public static void main(String args[]){
        MySingleton mySingleton = MySingleton.getMySingleton();

        System.out.println("No. of instances : " + MySingleton.getCount());

        MySingleton mySingleton2 = MySingleton.getMySingleton();

        System.out.println("No. of instances : " + MySingleton.getCount());
    }
}
