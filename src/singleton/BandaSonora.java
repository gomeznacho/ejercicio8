package singleton;

public class BandaSonora {

    private static BandaSonora bandaSonora;
    int compases;
    String tonalidad;

    private BandaSonora(){}

    public static BandaSonora getInstance(){
        if(bandaSonora == null)
            bandaSonora = new BandaSonora();

        return bandaSonora;
    }

    public int getCompases() {
        return compases;
    }

    public void setCompases(int compases) {
        this.compases = compases;
    }

    public String getTonalidad() {
        return tonalidad;
    }

    public void setTonalidad(String tonalidad) {
        this.tonalidad = tonalidad;
    }
}
