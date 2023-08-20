package series;

import java.util.ArrayList;
import java.util.List;

public class main_series {

	public static void main(String[] args) {
		
		
		        // Crear una serie con temporadas y episodios
		        Serie serie = new Serie("Mi Serie Favorita", "Una descripción", "Creador", "Género");
		        
		        Temporada temporada1 = new Temporada();
		        temporada1.agregarEpisodio(new Episodio("Episodio 1", "Descripción 1"));
		        temporada1.agregarEpisodio(new Episodio("Episodio 2", "Descripción 2"));

		        Temporada temporada2 = new Temporada();
		        temporada2.agregarEpisodio(new Episodio("Episodio 1", "Descripción 1"));
		        temporada2.agregarEpisodio(new Episodio("Episodio 2", "Descripción 2"));
		        temporada2.agregarEpisodio(new Episodio("Episodio 3", "Descripción 3"));

		        serie.agregarTemporada(temporada1);
		        serie.agregarTemporada(temporada2);

		        // Marcar episodios como vistos y asignar calificaciones
		        temporada1.getEpisodios().get(0).marcarVisto();
		        temporada1.getEpisodios().get(0).calificar(4);
		        temporada1.getEpisodios().get(1).marcarVisto();
		        temporada1.getEpisodios().get(1).calificar(5);
		        temporada2.getEpisodios().get(0).marcarVisto();
		        temporada2.getEpisodios().get(0).calificar(3);
		        temporada2.getEpisodios().get(1).marcarVisto();
		        temporada2.getEpisodios().get(1).calificar(4);
		        temporada2.getEpisodios().get(2).marcarVisto();
		        temporada2.getEpisodios().get(2).calificar(5);

		        // Consultas
		        System.out.println("Total episodios vistos en la temporada 1: " + temporada1.totalEpisodiosVistos());
		        System.out.println("Total episodios vistos en la serie: " + serie.totalEpisodiosVistos());

		        System.out.println("Promedio de calificaciones de la temporada 1: " + temporada1.promedioCalificaciones());
		        System.out.println("Promedio de calificaciones de la serie: " + serie.promedioCalificaciones());

		        if (serie.seVieronTodosEpisodios()) {
		            System.out.println("Se vieron todos los episodios de la serie.");
		        } else {
		            System.out.println("No se vieron todos los episodios de la serie.");
		        }
		    }
		

		
		
		
		
			}


