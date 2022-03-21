package com.agendaElectronica.app;

import com.agendaElectronica.dominio.Agenda;

public class AppAgenda {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.agregar("Ana", "Corrales", 3134556718l);
        agenda.agregar("Manuela", "Garzon", 3127264534l);
        agenda.agregar("Carolina", "Perez", 3155001423l);
        agenda.agregar("Tatiana", "Quintero", 3204264533l);
        agenda.agregar("Jorge", "Carmona", 3107654563l);
        agenda.agregar("Jorge", "Carmona", 3107654573l);
        agenda.agregar("JuanAle", "Osorio", 3144567623l);
        agenda.agregar("Edwin", "Castaño", 3117489893l);
        agenda.agregar("Juanes", "Lopez", 3104784568l);
        agenda.agregar("Cristian", "Florez", 3007895727l);
        agenda.agregar("Felipe", "Llanos", 3217582538l);

        System.out.println("----- IMPRIMIR CONTACTOS INGRESADOS ----- ");
        agenda.imprimirAgenda();

        System.out.println("----- EDITAR UN CONTACTO ----- ");
        agenda.editarCelular(3134556718l, 3214567961l);

        System.out.println("----- ORDENAR ALFABÉTICAMENTE ----- ");
        agenda.ordenarAlfabeticamente();

        System.out.println("----- IMPRIMIR CONTACTOS ORDENADOS ALFABETICAMENTE ----- ");
        agenda.imprimirAgenda();

        System.out.println("----- BUSCAR POR NOMBRE ----- ");
        agenda.buscarPorNombre("Carlos").forEach(c -> System.out
                .println(c.getNombre() + " " + c.getApellido() + " - " + c.getCelular()));
        //agenda.buscarPorNombre("Miguel").forEach(c -> System.out
        //      .println(c.getNombre() + " " + c.getApellido() + " - " + c.getCelular()));

        System.out.println("----- BUSCAR POR APELLIDO ----- ");
        agenda.buscarPorApellido("Ramirez").forEach(c -> System.out
                .println(c.getNombre() + " " + c.getApellido() + " - " + c.getCelular()));

        System.out.println("----- BUSCAR POR CELULAR ----- ");
        agenda.buscarPorCelular(3127264534l).forEach(c -> System.out
                .println(c.getNombre() + " " + c.getApellido() + " - " + c.getCelular()));

        System.out.println("----- ELIMINAR ----- ");
        agenda.eliminar(3104784568l);

        System.out.println("----- IMPRIMIR AGENDA FINAL ----- ");
        agenda.imprimirAgenda();
    }
}
