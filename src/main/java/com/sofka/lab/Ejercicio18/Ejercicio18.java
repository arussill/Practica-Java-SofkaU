package com.sofka.lab.Ejercicio18;

import com.sofka.lab.Ejercicio17.Electrodomesticos;
import com.sofka.lab.Ejercicio17.Lavadora;

import java.time.LocalTime;

public class Ejercicio18 {
    public static void main(String[] args) {

        Serie[] series = new Serie[5];
        Videojuego[] videojuegos = new Videojuego[5];
        Integer contadorSeries = 0;
        Integer contadorVidejuegos = 0;


        series[0] = new Serie();
        series[1] = new Serie();
        series[3] = new Serie("The Simpson ", "Matt Groening");
        series[2] = new Serie("Friends", "David Crane y Marta Kauffman");
        series[4] = new Serie("Euphoria ", 2, "Drama", "Sam Levinson");
        videojuegos[0] = new Videojuego();
        videojuegos[1] = new Videojuego();
        videojuegos[2] = new Videojuego("Mortal kombat", LocalTime.of(3, 0, 0));
        videojuegos[3] = new Videojuego("FREEFIRE", LocalTime.of(8, 0, 0));
        videojuegos[4] = new Videojuego("FORTNITE", LocalTime.of(5, 0, 0), "Battle royale game", "Epic Games");

//        Entrega
        series[3].entregar();
        series[4].entregar();
        videojuegos[3].entregar();
        System.out.println(series[3].isEntregado() +"\n"
                + series[4].isEntregado() + "\n"
                +videojuegos[3].isEntregado());

//        Cuenta
        for (Serie serie : series) {
            if (serie.entregado) {
                contadorSeries += 1;
                serie.devolver();
            }
        }
        for (Videojuego videojuego : videojuegos){
            if (videojuego.entregado){
                contadorVidejuegos += 1;
                videojuego.devolver();
            }
        }
        System.out.println("Series devueltos: " + contadorSeries + "\n" +
                "Video Juegos devueltos: " + contadorVidejuegos);
        System.out.println(series[3].isEntregado() +"\n"
                + series[4].isEntregado() + "\n"
                +videojuegos[3].isEntregado());

    }
}
