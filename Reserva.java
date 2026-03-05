
import java.time.LocalDate;

public class Reserva {
    private int numeroReserva;
    private String nombre;
    private LocalDate fechaReserva;
    private Libros libroReservado;
    private Estado estado;

    //Constructor
    public Reserva(int numeroReserva, String nombre, LocalDate fechaReserva, Libros libroReservado, Estado estado) {
        this.numeroReserva = numeroReserva;
        this.nombre = nombre;
        this.fechaReserva = LocalDate.now();
        this.libroReservado = libroReservado;
        this.estado = estado;
    }
    
    //Getters y setters
}
