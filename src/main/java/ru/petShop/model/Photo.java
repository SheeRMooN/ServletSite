package ru.petShop.model;

public enum Photo {
    CAT1("Cat1"),
    CAT2("Cat2"),
    DOG1("Dog1"),
    MOUSE1("Mouse1")
    ;

    private String photo;
    Photo(String photo) {
        this.photo=photo;
    }

    public String getPhoto() {
        return photo;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "photo='" + photo + '\'' +
                '}';
    }
}
