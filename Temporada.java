package series;
import java.util.ArrayList;
import java.util.List;

public class Temporada {
    private List<Episodio> episodios;

    public Temporada() {
        episodios = new ArrayList<>();
    }

    public void agregarEpisodio(Episodio episodio) {
        episodios.add(episodio);
    }

    public int totalEpisodiosVistos() {
        int total = 0;
        for (Episodio episodio : episodios) {
            if (episodio.estaVisto()) {
                total++;
            }
        }
        return total;
    }

    public double promedioCalificaciones() {
        int totalCalificaciones = 0;
        int totalEpisodiosVistos = 0;
        
        for (Episodio episodio : episodios) {
            if (episodio.estaVisto()) {
                totalCalificaciones += episodio.getCalificacion();
                totalEpisodiosVistos++;
            }
        }
        
        if (totalEpisodiosVistos == 0) {
            return 0.0; // Evitar división por cero
        }
        
        return (double) totalCalificaciones / totalEpisodiosVistos;
    }

    public List<Episodio> getEpisodios() {
        return episodios;
    }
    
    
    public int totalCalificacionesVistos() {
        int totalCalificaciones = 0;
        for (Episodio episodio : episodios) {
            if (episodio.estaVisto()) {
                totalCalificaciones += episodio.getCalificacion();
            }
        }
        return totalCalificaciones;
    }

    public int totalEpisodios() {
        return episodios.size();
    }

    // Otros métodos y propiedades de la clase Temporada
}
