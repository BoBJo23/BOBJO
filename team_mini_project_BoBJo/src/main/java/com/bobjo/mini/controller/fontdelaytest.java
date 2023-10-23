package com.bobjo.mini.controller;

public class fontdelaytest {
        public static void main(String[] args) {
            String text = "헬로";

            for (int i = 0; i < text.length(); i++) {
                System.out.print(text.charAt(i));
                try {
                    Thread.sleep(2000); // 글자 간의 시간 간격 (200 밀리초)

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(); // 줄 바꿈
        }
    }



