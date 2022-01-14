package singleton;

public class Main {
    public static void main(String[] args) {

        BandaSonora tema1 = BandaSonora.getInstance();
        tema1.setCompases(128);
        tema1.setTonalidad("Bb");
        System.out.println("\nEl primer tema tiene " + tema1.getCompases() + "compases, está en " + tema1.getTonalidad() +
                " \nla Banda sonora esta alojada en " + tema1);

        BandaSonora tema2 = BandaSonora.getInstance();
        tema2.setCompases(32);
        tema2.setTonalidad("G#m");
        System.out.println("\nEl segundo tema tiene " + tema2.getCompases() + "compases, está en " + tema2.getTonalidad() +
                " \nla Banda sonora esta alojada en " + tema2);

        BandaSonora tema3 = BandaSonora.getInstance();
        tema3.setCompases(64);
        tema3.setTonalidad("Db");
        System.out.println("\nEl tercer tema tiene " + tema3.getCompases() + "compases, está en " + tema3.getTonalidad() +
                " \nla Banda sonora esta alojada en " + tema3);
    }
}
