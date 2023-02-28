package fr.Zchen.models;

import java.util.ArrayList; // import the ArrayList class
public class Sqrt {
    private int min;
    private int max;
    ArrayList<Double> list = new ArrayList<>(); // Create an ArrayList object

    /**
     * get array list
     * @return
     */
    public ArrayList<Double> getList() {
        return list;
    }

    /**
     * get min
     * @return
     */
    public int getMin() {
        return min;
    }

    /**
     * get max
     * @return
     */
    public int getMax() {
        return max;
    }

    /**
     * init list min and max value
     * @param Min
     * @param Max
     */
    public void init(int Min, int Max) {
        if (Min<Max){
            min = Min;
            max = Max;
        }

    }

    /**
     * add Sqrt value into the list
     */
    public void addSqrtValue(){
        for (int i = min; i < max; i++) {
            list.add(Math.sqrt(i));
        }
    }

    /**
     * clear array
     */
    public void clearList(){
        list.clear();
    }

}
