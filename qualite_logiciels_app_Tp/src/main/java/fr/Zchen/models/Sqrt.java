package fr.Zchen.models;

import java.util.ArrayList; // import the ArrayList class
public class Sqrt {
    private Integer min;
    private Integer max;
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
    public void init(Integer Min, Integer Max) {

        //Vérification de la non-nullité des paramètres
        if(Min==null) throw new IllegalArgumentException("Entier Min nul");
        else if(Max==null) throw new IllegalArgumentException("Entier Max nul");

        //Vérification de la valeur du paramètre
        if(Min<0) throw new IllegalArgumentException("Entier Min négatif");
        else if(Max<0) throw new IllegalArgumentException("Entier Max négatif");
        else if(Min > Max) throw new IllegalArgumentException("Entier Min supérieur à Max");

        min = Min;
        max = Max;
    }

    /**
     * add Sqrt value into the list
     */
    public void addSqrtValue(){
        for (Integer i = min; i < max; i++) {
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
