package com.giftm.databindingtestapplication;

public final class Sword implements ISword{

    String name ;

    public Sword(String name) {
        this.name = name;
    }

    public void equip(){
        System.out.println("검을 장착");
    }
}
