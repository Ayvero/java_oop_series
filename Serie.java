package series;
import java.util.ArrayList;
import java.util.List;

public class Serie {
    private String titulo;
    private String descripcion;
    private String creador;
    private String genero;
    private List<Temporada> temporadas;

    public Serie(String titulo, String descripcion, String creador, String genero) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.creador = creador;
        this.genero = genero;
        this.temporadas = new ArrayList<>();
    }

    public void agregarTemporada(Temporada temporada) {
        temporadas.add(temporada);
    }

    public int totalEpisodiosVistos() {
        int total = 0;
        for (Temporada temporada : temporadas) {
            total += temporada.totalEpisodiosVistos();
        }
        return total;
    }

    public double promedioCalificaciones() {
        int totalCalificaciones = 0;
        int totalEpisodiosVistos = 0;
        
        for (Temporada temporada : temporadas) {
            totalCalificaciones += temporada.totalCalificacionesVistos();
            totalEpisodiosVistos += temporada.totalEpisodiosVistos();
        }
        
        if (totalEpisodiosVistos == 0) {
            return 0.0; // Evitar división por cero
        }
        
        return (double) totalCalificaciones / totalEpisodiosVistos;
    }

    public boolean seVieronTodosEpisodios() {
        for (Temporada temporada : temporadas) {
            if (temporada.totalEpisodiosVistos() != temporada.totalEpisodiosVistos()) {
                return false;
            }
        }
        return true;
    }
    
    // Otros métodos y propiedades de la clase Serie
}
