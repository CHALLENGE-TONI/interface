package org.mosdev.measurabledemo;

import java.util.ArrayList;
import java.util.HashMap;

public class Result implements Measurable{

    private static int internalID = 0;
    private ArrayList<Double> pointsList = new ArrayList<>();
    private static HashMap<Integer, String> idNames = new HashMap<>();
    private static HashMap<Integer, ArrayList> resultList = new HashMap<>();
    private int which; // Contains index (id) of Hasmap idNames


    public Result(String name, double score) {
        internalID++;
        which = internalID;

        idNames.put(internalID, name);
        pointsList.add(score);
        resultList.put(internalID, pointsList);
    }

    public int getWhich() {
        return which;
    }

    public int getWhich(String name) {
        int result = 0;
        for (int id:idNames.keySet()) {
            if (idNames.get(id). equals(name)) {
                result = id;
            }
        }

        return result;
    }

    public void setScore(int which, double score) {
        ArrayList<Double> points = resultList.get(which);
        points.add(score);
    }

    public double getScore(int which) {
        double result = 0;

        for (double value : (ArrayList<Double>)resultList.get(which)) {
            result += value;
        }

        return result;
    }

    public double getTotalStore() {
        double result = 0;

        for (ArrayList<Double> points:resultList.values()){
            for (double value:points) {
                result += value;
            }
        }

        return result;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int id:idNames.keySet()) {
            String name = idNames.get(id);
            int index = 0;
            double sum = 0;
            sb.append(name + ": ");
            for (double value : (ArrayList<Double>)resultList.get(id)) {
                index ++;
                sb.append("" + value);
                sum += value;
                if (resultList.get(id).size() > index) {
                    sb.append(" / ");
                }
            }
            sb.append(" = " + sum + "\n");
        }

        return sb.toString();
    }


    @Override
    public double getMeasure() {
        return getScore(which);
    }
}
