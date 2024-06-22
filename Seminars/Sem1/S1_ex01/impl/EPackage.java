package Seminars.Sem1.S1_ex01.impl;

public enum EPackage {
    PLASTIC("plastic"), GLASS("steklo");

    private final String material;

    EPackage(String material){
        this.material = material;
    }

    public String getMaterial(){
        return material;
    }
}