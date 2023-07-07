package com.aligunes.ornek04sleep;

public class AppMain {

    public static void main(String[] args)  {


        long baslangic = System.currentTimeMillis();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        long bitis = System.currentTimeMillis();


        System.out.println(bitis-baslangic);

    }
}
