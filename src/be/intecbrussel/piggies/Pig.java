package be.intecbrussel.piggies;

public interface Pig {
    void grunt();

    default void fly() {
        System.out.println(
                "Spider Cochon, Spider Cochon,\n" +
                        "Il peut marcher au plafond.\n" +
                        "Est-ce qu'il peut faire une toile ?\n" +
                        "Biensûr que non, c'est un cochon.\n" +
                        "Prends garde ! Spider Cochon est là.\n"

        );
    }
}
