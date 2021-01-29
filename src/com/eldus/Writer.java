package com.eldus;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Writer implements Runnable {

    List<Integer> list;

    Writer(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {

        for(int i = 0 ; i < 5;i++){
            Random random = new Random();
            list.add(list.size(), random.nextInt(100));
            try {
                Thread.sleep(2_500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
