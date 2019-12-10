package com.javarush.task.task17.task1714;

/* 
Comparable
*/

public class Beach implements Comparable<Beach> {
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public static void main(String[] args) {

        Beach b1 = new Beach("b1", 20, 4);
        Beach b2 = new Beach("b2", 30, 4);
        int a = b1.compareTo(b2);
        System.out.println(a);

    }

    @Override
    public synchronized int compareTo(Beach o) {
        int best = (int) ( (this.quality - this.distance ) - ( o.getQuality() - o.getDistance() ) );
        return best;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

}
