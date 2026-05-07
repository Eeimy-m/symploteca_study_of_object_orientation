package com.example.symploteca.domain.entities.book;

public enum BookGender {
    ACTION ("Ação"),
    DRAMA ("Drama"),
    HISTORY ("História"),
    HORROR ("Terror"),
    SCIENCE ("Ciência"),
    TECHNICAL ("Técnico");

    private String label;

    BookGender(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}
