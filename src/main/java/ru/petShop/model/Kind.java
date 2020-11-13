package ru.petShop.model;

public enum Kind {
    CAT("Cat"),
    DOG("Dog"),
    MOUSE("Mouse")
    ;

    private String Kind;
    Kind(String kind) {
        this.Kind = kind;
    }
    public String getKind() {
        return Kind;
    }

    @Override
    public String toString() {
        return "Kind{" +
                "kind='" + Kind + '\'' +
                '}';
    }
}
