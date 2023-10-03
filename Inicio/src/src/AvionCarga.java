package src;

public class AvionCarga extends Vuelo {
    private int capacidadCarga;
    private String modelo;

    public AvionCarga(String numeroVuelo, String salidaUbicacion, String llegadaUbicacion, String horaSalida,
            String horaLlegada, int asientoCapacidad, int capacidadCarga, String modelo) {
        super(numeroVuelo, salidaUbicacion, llegadaUbicacion, horaSalida, horaLlegada, asientoCapacidad);
        this.capacidadCarga = capacidadCarga;
        this.modelo = modelo;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
   