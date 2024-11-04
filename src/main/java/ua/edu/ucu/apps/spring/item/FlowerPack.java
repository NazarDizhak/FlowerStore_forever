package ua.edu.ucu.apps.spring.item;

import lombok.Getter;

public class FlowerPack {

    private Flower flower;
    @Getter
    private int quantity;

    public FlowerPack(Flower flower) {
        this.flower = flower;
        this.quantity = 1;
    }

    public FlowerPack(Flower flower, int quantity) {
        this.flower = flower;
        this.quantity = quantity;
    }

    public double getPrice() {
        return flower.getPrice()*quantity;
    }

}
