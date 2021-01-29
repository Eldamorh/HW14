package com.eldus;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Reader reader = new Reader(list);
        Writer writer = new Writer(list);
        Thread readerThread = new Thread(reader);
        Thread writerThread = new Thread(writer);
        readerThread.start();
        writerThread.start();


    }
}
