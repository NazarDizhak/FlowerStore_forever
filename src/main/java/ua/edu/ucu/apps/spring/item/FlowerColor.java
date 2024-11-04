package ua.edu.ucu.apps.spring.item;

public enum FlowerColor {
    GREEN("#00FF00"),
    RED("#FF0000"), 
    BLUE("#0000FF");

    private final String stringRepresentation;

    FlowerColor(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }

    @Override
    public String toString() {
        return stringRepresentation;
    }
}

