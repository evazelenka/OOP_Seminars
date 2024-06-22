package Seminars.Sem1.S1_ex01.impl;

import java.time.LocalDate;

import Seminars.Sem1.S1_ex01.Product;

public class HotDrink extends Product{

    private int temp;
    private float volume;

    public HotDrink(String name, double price, LocalDate releaseDate) {
        super(name, price, releaseDate);
        this.temp = 45;
        this.volume = 1f;
    }

    public HotDrink(String name, double price, LocalDate releaseDate, int temp, float volume) {
        super(name, price, releaseDate);
        this.temp = temp;
        this.volume = volume;
    }

    public int getTemp() {
        return temp;
    }

    public float getVolume(){
        return volume;
    }

    @Override
    public String toString() {
        return "HotDrink{" + 
        "name='" + name + '\'' +
        ", price='" + price + '\'' +
        ", releaseDate='" + releaseDate + '\'' +
        "volume='" + volume + '\'' +
        ", temp='" + temp + "C'"+
        '}';
    }

}
