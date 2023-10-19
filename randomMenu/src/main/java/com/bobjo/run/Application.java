package com.bobjo.run;

import java.util.ArrayList;

public class Application {
        public void main(String[] args) {
            ArrayList<Integer> A = new ArrayList<>();
            ArrayList<Integer> B = new ArrayList<>();
            ArrayList<Integer> C = new ArrayList<>();
            ArrayList<Integer> D = new ArrayList<>();

            // 리스트 A, B, C, D에 값을 추가
            A.add(1);
            A.add(2);
            A.add(3);
            A.add(4);
            A.add(5);

            B.add(6);
            B.add(7);
            B.add(8);
            B.add(9);
            B.add(10);

            C.add(11);
            C.add(12);
            C.add(13);
            C.add(14);

            D.add(15);
            D.add(16);
            D.add(17);
            D.add(18);
            D.add(19);
            D.add(20);

            int maxListSize = Math.max(Math.max(A.size(), B.size()), Math.max(C.size(), D.size()));

            System.out.println("A\tB\tC\tD");

            for (int i = 0; i < maxListSize; i++) {
                if (i < A.size()) {
                    System.out.print(A.get(i) + "\t");
                } else {
                    System.out.print("\t");
                }

                if (i < B.size()) {
                    System.out.print(B.get(i) + "\t");
                } else {
                    System.out.print("\t");
                }

                if (i < C.size()) {
                    System.out.print(C.get(i) + "\t");
                } else {
                    System.out.print("\t");
                }

                if (i < D.size()) {
                    System.out.print(D.get(i));
                }

                System.out.println();
            }
        }
}
