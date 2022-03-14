package com.company.boba;
import java.util.*;

public class Varian {

    public static void ori() {
        List<String> boba = new ArrayList<>();
        boba.add("1 Brown Sugar Boba Fresh Milk (23k)");
        boba.add("2 Brown Sugar Boba Milk Tea (23k)");
        boba.add("3 Salted Caramel Boba Fresh Milk (28k)");
        boba.add("4 ---Kembali---");
        System.out.println("\n==Menu D'Boba==");
        for (int i = 0; i < boba.size(); i++) {
            System.out.println(" " + boba.get(i));
        }
    }

    public static void dalgona() {
        Set<String> dalseries = new LinkedHashSet<>();
        dalseries.add("1 Brown Sugar Dalgona Boba (23k)");
        dalseries.add("2 Salted Caramel Dalgona Boba (27k)");
        dalseries.add("3 Signature Dalgona Boba (24k)");
        dalseries.add("4 ---Kembali---");
        System.out.println("\n==Menu Dalgona Series==");
        for (String d : dalseries) {
            System.out.println(" " + d);
        }
    }

    public static void biscoff() {
        Map<Integer, String> biseries = new LinkedHashMap<>();
        biseries.put( 1, " Signature Biscoff Dalgona (29k)");
        biseries.put( 2, " Dirty Biscoff Dalgona (30k)");
        biseries.put( 3, " Salted Caramel Biscoff (30k)");
        biseries.put( 4, " ---Kembali---");
        System.out.println("\n==Menu Biscoff Series==");
        for(Map.Entry <Integer, String > map : biseries.entrySet()) {
            System.out.println(" " + map.getKey() + "" + map.getValue());
        }
    }
}