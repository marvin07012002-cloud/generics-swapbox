package com.pluralsight.generics;

public class Program {

    public static void main(String[] args) {

        SwapBox<String> words = new SwapBox<>("coffee", "tea");
        SwapBox<Integer> scores = new SwapBox<>(85, 92);
        SwapBox<Double> prices = new SwapBox<>(4.99, 9.49);

    }
}
