package Seminars.Sem1.S1_ex01.impl;

import java.time.LocalDate;

import Seminars.Sem1.S1_ex01.Product;

public class BottleOfWater extends Product {
    
    private float volume;
    private String pack;
    private boolean isSparkling;

    public BottleOfWater(String name, double price, LocalDate releaseDate) {
        super(name, price, releaseDate);
        this.isSparkling = false;
        this.volume = 1;
        this.pack = EPackage.PLASTIC.getMaterial();
    }

    public BottleOfWater(String name, double price, LocalDate releaseDate, boolean isSparkling, String pack, float volume) {
        super(name, price, releaseDate);
        this.isSparkling = false;
        this.volume = volume;
        this.pack = pack;
    }

    public float getVolume() {
        return volume;
    }

    public String getPack() {
        return pack;
    }

    public boolean isSparkling() {
        return isSparkling;
    }

    @Override
    public String toString() {
        return "BottleOfWater{" + 
        "name='" + name + '\'' +
        ", price='" + price +
        ", releaseDate='" + releaseDate +
        "volume='" + volume + '\'' +
        ", pack='" + pack +
        ", isSpark='" + isSparkling + '\'' +
        '}';
    }
}
