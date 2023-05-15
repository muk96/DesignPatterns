package org.example.Singleton1;

public class MySingleton {

    private static int count = 0;
    private final static MySingleton mySingleton = new MySingleton();
    private MySingleton (){
        count += 1;
    }

    public static MySingleton getMySingleton(){
        return mySingleton;
    }

    public static int getCount(){
        return count;
    }
}
