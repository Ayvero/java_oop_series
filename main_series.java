package series;

import java.util.ArrayList;
import java.util.List;

public class main_series {

	public static void main(String[] args) {
		
		
		        // Crear una serie con temporadas y episodios
		        Serie serie = new Serie("Mi Serie Favorita", "Una descripci�n", "Creador", "G�nero");
		        
		        Temporada temporada1 = new Temporada();
		        temporada1.agregarEpisodio(new Episodio("Episodio 1", "Descripci�n 1"));
		        temporada1.agregarEpisodio(new Episodio("Episodio 2", "Descripci�n 2"));

		        Temporada temporada2 = new Temporada();
		        temporada2.agregarEpisodio(new Episodio("Episodio 1", "Descripci�n 1"));
		        temporada2.agregarEpisodio(new Episodio("Episodio 2", "Descripci�n 2"));
		        temporada2.agregarEpisodio(new Episodio("Episodio 3", "Descripci�n 3"));

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


