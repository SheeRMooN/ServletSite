package ru.petShop.model;

public class Pet {
    private String name;
    private String breed;
    private String kind;
    private String color;
    private String gender;

    public Pet() {
    }

    public Pet(String name, String breed, String kind, String color, String gender) {
        this.name = name;
        this.breed = breed;
        this.kind = kind;
        this.color = color;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", kind=" + kind +
                ", color='" + color + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String isGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
