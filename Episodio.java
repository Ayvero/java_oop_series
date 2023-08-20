package series;

import java.util.ArrayList;
import java.util.List;


public class Episodio {
    private String titulo;
    private String descripcion;
    private boolean visto;
    private int calificacion;

    public Episodio(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.visto = false;
        this.calificacion = -1; // Valor negativo indica no visto
    }

    public void calificar(int calificacion) {
        if (calificacion >= 1 && calificacion <= 5) {
            this.calificacion = calificacion;
        } else {
            System.out.println("Calificación incorrecta. No se cambió la calificación anterior.");
        }
    }

    public void marcarVisto() {
        this.visto = true;
    }

    public boolean estaVisto() {
        return visto;
    }

    public int getCalificacion() {
        return calificacion;
    }
    
    // Otros métodos y propiedades de la clase Episodio
}
