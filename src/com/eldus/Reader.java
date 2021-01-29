package com.eldus;

import java.time.LocalTime;
import java.util.List;

public class Reader implements  Runnable {
    List<Integer> list;

    Reader (List<Integer> list){
        this.list = list;

    }

    @Override
    public void run() {
        for(int i = 0;i < 10;i ++){
            if(!list.isEmpty()){
                System.out.println(list);
                list.clear();
            }
            else{
                System.out.println("The list is empty " + LocalTime.now());
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
