package src;

import java.util.Iterator;
import java.util.Scanner;

public class Main {
    // Variable de instancia privada estática
    private static Main instance = null;

    // Constructor privado
    private Main() {
        // Aquí puedes inicializar cualquier cosa que necesites para tu clase Main
    }

    // Método público estático
    public static Main getInstance() {
        if (instance == null) {
            instance = new Main();
        }
        return instance;
    }
    Scanner scanner = new Scanner(System.in);
    public void run() {
        Aerolinea aerolinea = new Aerolinea();
        while (true) {
            System.out.println("Por favor, selecciona una opción:");
            System.out.println("1. Crear nuevo vuelo");
            System.out.println("2. Crear nueva reserva");
            System.out.println("3. Crear nuevo usuario");
            System.out.println("4. Ver todos los vuelos");
            System.out.println("5. Ver todas las reservas");
            System.out.println("6. Ver información del usuario");
            System.out.println("7. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Aca se puede crear un nuevo vuelo
                    System.out.println("Por favor, introduce la siguiente información para el nuevo vuelo:");
                    System.out.print("Número de vuelo: ");
                    String numeroVuelo = scanner.next();
                    System.out.print("Ubicación de salida: ");
                    String salidaUbicacion = scanner.next();
                    System.out.print("Ubicación de llegada: ");
                    String llegadaUbicacion = scanner.next();
                    System.out.print("Hora de salida: ");
                    String horaSalida = scanner.next();
                    System.out.print("Hora de llegada: ");
                    String horaLlegada = scanner.next();
                    System.out.print("Capacidad de asientos: ");
                    int asientoCapacidad = scanner.nextInt();

                    Vuelo nuevoVuelo = new Vuelo(numeroVuelo, salidaUbicacion,
                            llegadaUbicacion, horaSalida, horaLlegada, asientoCapacidad);

                    aerolinea.agregarVuelo(nuevoVuelo);
                    break;
                case 2:
                    // Crear nueva reserva
                    System.out.println("Por favor, introduce la siguiente información para la nueva reserva:");

                    // Mostrar lista de vuelos disponibles
                    System.out.println("Vuelos disponibles:");
                    Iterator<Vuelo> vuelosIterator = aerolinea.getVuelosIterator();
                    int contador = 1;
                    while (vuelosIterator.hasNext()) {
                        Vuelo vuelo = vuelosIterator.next();
                        System.out.println(contador + ". " + vuelo.getNumeroVuelo());
                        contador++;
                    }

                    // Pedir al usuario que seleccione un vuelo
                    System.out.print("Selecciona el número de vuelo: ");
                    int numVuelo = scanner.nextInt();

                    // Recuperar el vuelo seleccionado de la lista
                    Vuelo vueloSeleccionado = aerolinea.getVueloPorIndice(numVuelo - 1);

                    // Mostrar lista de usuarios disponibles
                    System.out.println("Usuarios disponibles:");
                    Iterator<Usuario> usuariosIterator = aerolinea.getUsuarioIterator();
                    contador = 1;
                    while (usuariosIterator.hasNext()) {
                        Usuario usuario = usuariosIterator.next();
                        System.out.println(contador + ". " + usuario.getNombreUsuario());
                        contador++;
                    }

                    // Pedir al usuario que seleccione un usuario
                    System.out.print("Selecciona el número de usuario: ");
                    int numUsuario = scanner.nextInt();

                    // Recuperar el usuario seleccionado de la lista
                    Usuario usuarioSeleccionado = aerolinea.getUsuarioPorIndice(numUsuario - 1);

                    // Pedir al usuario el número de asiento a reservar
                    System.out.print("Número de asiento a reservar: ");
                    int numAsiento = scanner.nextInt();

                    // Crear la nueva reserva y agregarla a la lista de reservas
                    String idReserva = "reserva" + (aerolinea.getReservasSize() + 1);
                    Reserva nuevaReserva = new Reserva(idReserva, vueloSeleccionado, usuarioSeleccionado, numAsiento);
                    aerolinea.agregarReservas(nuevaReserva);

                    break;

                case 3:
                    // Aca se puede crear un nuevo usuario
                    System.out.println("Por favor, introduce la siguiente información para el nuevo usuario:");
                    System.out.print("Nombre del usuario: ");
                    scanner.nextLine(); // Consumir la nueva línea pendiente
                    String nombreUsuario = scanner.nextLine();
                    System.out.print("Número de pasaporte: ");
                    String numeroPasaporte = scanner.next();

                    // Crear el nuevo usuario y agregarlo a la lista de usuarios
                    Usuario nuevoUsuario = new Usuario(nombreUsuario, numeroPasaporte);
                    aerolinea.agregarUsuario(nuevoUsuario);
                    break;

                case 4:
                    // Utilizar el iterador para recorrer todos los vuelos
                    Iterator<Vuelo> vuelosIterator2 = aerolinea.getVuelosIterator();
                    while (vuelosIterator2.hasNext()) {
                        Vuelo vuelo = vuelosIterator2.next();
                        System.out.println("Vuelo: " + vuelo.getNumeroVuelo());
                        System.out.println("Salida de vuelo: " + vuelo.getSalidaUbicacion());
                        System.out.println("Llegada de Vuelo: " + vuelo.getLlegadaUbicacion());
                        System.out.println("Hora Salida: " + vuelo.getHoraSalida());
                        System.out.println("Hora Llegada: " + vuelo.getHoraLlegada());
                    }
                    break;

                case 5:
                    // Utilizar el iterador para recorrer todas las reservas
                    Iterator<Reserva> reservasIterator = aerolinea.getReservasIterator();
                    while (reservasIterator.hasNext()) {
                        Reserva reserva = reservasIterator.next();
                        System.out.println("Reserva: " + reserva.getNumReserva());
                        System.out.println("Usuario: " + reserva.getUsuario().getNombreUsuario());
                        System.out.println("Número de asiento: " + reserva.getNumAsiento());
                    }
                    break;

                case 6:
                    // Utilizar el iterador para recorrer todas los usuarios
                    Iterator<Usuario> usuariosIterator2 = aerolinea.getUsuarioIterator();
                    while (usuariosIterator2.hasNext()) {
                        Usuario usuario = usuariosIterator2.next();
                        System.out.println("Usuario: " + usuario.getNombreUsuario());
                        System.out.println("Número de Pasaporte: " + usuario.getNumeroPasaporte());
                    }
                    break;

                case 7:
                    System.out.println("Gracias por utilizar nuestro sistema de reservaciones de vuelos!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opción inválida, por favor elige nuevamente");
            }
        }
    }
}
