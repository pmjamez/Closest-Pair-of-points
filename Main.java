package com.company;

import java.time.Duration;
import java.time.Instant;

class Main {
    public static void main(String[] args) {
        Instant start = Instant.now();
        Point[] points = new Point[101];
        int min = 1;
        int max = 100;
        int i;
        for (i = 0; i <= points.length; i++) {
            points[i] = new Point(min + Math.random() * (max - min), min + Math.random() * (max - min));
            if (i == 100) {
                break;
            }
        }

        Pair pair = Pair.getClosestPair(points);



        Instant finish = Instant.now();
        System.out.println("The shortest distance is " + pair.getDistance() + " between the points: " + pair.getP1() + " and " + pair.getP2());

        long timeElapsed = Duration.between(start, finish).toMillis();
        System.out.print("\n" + "Time spent on the divide-and-conquer algorithm is " + timeElapsed + " milliseconds.");
    }
}
