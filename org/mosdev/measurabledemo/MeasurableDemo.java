package org.mosdev.measurabledemo;

public class MeasurableDemo {

    public static void main(String[] args) {
        Result result = new Result("A", 123);
        result.setScore(1, 2);
        result.setScore(1, 5);

        System.out.println(result.getScore(1));
        System.out.println(result.toString());
        System.out.println(result.getTotalStore());

        result = new Result("B", 23);
        result.setScore(2, 2);
        result.setScore(2, 5);

        System.out.println(result.getScore(2));
        System.out.println(result.toString());
        System.out.println(result.getMeasure());
    }
}
