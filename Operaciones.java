package com.ORMUZ09a.Tecmilenio;

import java.util.Scanner;

public class Operaciones {

    private String participante;
    private int calif[] = new int[5];
    private char estado;
    private double promedio;


    public void calcular_promedio() {
        Scanner scaner = new Scanner(System.in);

        int suma = 0;

        System.out.println("Primera Calificacion: ");
        calif[0] = scaner.nextInt();
        System.out.println("Seguda Calificacion: ");
        calif[1] = scaner.nextInt();
        System.out.println("Tercera Calificacion: ");
        calif[2] = scaner.nextInt();
        System.out.println("Cuarta Calificacion: ");
        calif[3] = scaner.nextInt();
        System.out.println("Quinta Calificacion: ");
        calif[4] = scaner.nextInt();

        for (int i = 0; i < calif.length; i++) {
            suma += calif[i];
        }
        promedio = (suma / calif.length);

    }


    public void setEstado() {


        if (promedio > 50 && promedio <= 60){
           this.estado = 'E';
        } else if (promedio > 60 && promedio <= 70) {
            this.estado = 'D';
        } else if (promedio > 70 && promedio <= 80) {
            this.estado = 'C';
        } else if (promedio > 80 && promedio <= 90) {
            this.estado = 'B';
        } else if (promedio > 90 && promedio <= 100) {
            this.estado = 'A';
        } else {
            this.estado = 'F';
        }
    }


    public void mostrar_mensajes(){
        Scanner nom = new Scanner(System.in);
        System.out.println("Ingresar Nombre del Participante:");
        participante = nom.nextLine();

        System.out.println("Calificacion 1:"+calif[0]);

        System.out.println("Calificacion 2:"+calif[1]);

        System.out.println("Calificacion 3:"+calif[2]);

        System.out.println("Calificacion 4:"+calif[3]);

        System.out.println("Calificacion 5:"+calif[4]);
        
        this.setEstado();

        System.out.println("Promedio: " + promedio);

        System.out.println("Calificacion: " + estado);
    }

}




