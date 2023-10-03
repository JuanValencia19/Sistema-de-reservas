package src;

public class AvionPersona extends Vuelo {
    private int capacidadPersonas;
    private String modelo;

    public AvionPersona(String numeroVuelo, String salidaUbicacion, String llegadaUbicacion, String horaSalida,
    String horaLlegada, int asientoCapacidad, int capacidadPersonas, String modelo) {
    super(numeroVuelo, salidaUbicacion, llegadaUbicacion, horaSalida, horaLlegada, asientoCapacidad);{
        this.capacidadPersonas=capacidadPersonas;
        this.modelo=modelo;
        }
    }
     public int getCapacidadPersonas(){
        return capacidadPersonas;
        }   
        public void setCapacidadPersonas(int capacidadPersonas) {
            this.capacidadPersonas = capacidadPersonas;
        }
        public String getModelo() {
            return modelo;
        }
        public void setModelo(String modelo) {
            this.modelo = modelo;
        }       
}

