package src;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Aerolinea {
  private List<Vuelo> vuelos;
  private List<Reserva> reservas;
  private List<Usuario> usuarios;

  // Constructor
  public Aerolinea() {
    vuelos = new ArrayList<>();
    reservas = new ArrayList<>();
    usuarios = new ArrayList<>();
  }
  // Crear indices para cada una de las clases
  public Usuario getUsuarioPorIndice(int indice) {
    return usuarios.get(indice);
}

  public Vuelo getVueloPorIndice(int indice) {
    return vuelos.get(indice);
}
  // Métodos para obtener iteradores de las listas
  public Iterator<Usuario> getUsuarioIterator() {
    return usuarios.iterator();
  }

  public Iterator<Vuelo> getVuelosIterator() {
    return vuelos.iterator();
  }

  public Iterator<Reserva> getReservasIterator() {
    return reservas.iterator();
  }
// Metodos para mostrar el tamaño de las listas
  public int getReservasSize() {
    return this.reservas.size();
}


  // Métodos para agregar y eliminar vuelos
  public void agregarVuelo(Vuelo vuelo) {
    vuelos.add(vuelo);
  }

  public void eliminarVuelo(Vuelo vuelo) {
    vuelos.remove(vuelo);
  }

  // Métodos para agregar y eliminar reservas
  public void agregarReservas(Reserva reserva) {
    reservas.add(reserva);
  }

  public void eliminarReserva(Reserva reserva) {
    reservas.remove(reserva);
  }

  // Métodos para agregar y eliminar usuarios
  public void agregarUsuario(Usuario usuario) {
    usuarios.add(usuario);
  }

  public void eliminarUsuario(Usuario usuario) {
    usuarios.remove(usuario);
  }
}
