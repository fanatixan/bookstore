package hu.javadev.bookstore.model;

public enum Genre {
    UTOPIA("UTO", "Utópisztikus regény"),
    BIOGRAPHY("BIO", "Életrajzi regény");

    private String code;
    private String name;

    private Genre(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return name;
    }

    public static Genre fromCode(String code) {
        for (Genre genre : values()) {
            if (genre.code.equals(code)) {
                return genre;
            }
        }

        throw new IllegalArgumentException(String.format("Unknown code '%s'", code));
    }

}
