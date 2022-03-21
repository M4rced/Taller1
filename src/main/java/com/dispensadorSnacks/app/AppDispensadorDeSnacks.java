package com.dispensadorSnacks.app;

import com.dispensadorSnacks.dominio.DispensadorDeSnacks;
import com.dispensadorSnacks.dominio.Snack;

public class AppDispensadorDeSnacks {
    public static void main(String[] args) {
        DispensadorDeSnacks dispensador = new DispensadorDeSnacks();
        Snack snackDePrueba1 = new Snack("Snakers", 02, 3700.0, (short) 2);
        Snack snackDePrueba2 = new Snack("No estoy", 07, 2000.0, (short) 2);

        dispensador.agregar("Milky Way", 01, 3500.0, (short) 4);
        dispensador.agregar("Snakers", 02, 3700.0, (short) 2);
        dispensador.agregar("Twix", 03, 4300.0, (short) 5);
        dispensador.agregar("Barra Tosh", 04, 1500.0, (short) 3);
        dispensador.agregar("Kinder Bueno", 05, 6800.0, (short) 10);
        dispensador.agregar("Kit Kat", 06, 3300.0, (short) 1);

        System.out.println("----- IMPRIMIR SNACKS AGREGADOS ----- ");
        dispensador.imprimirDispensador();

        System.out.println("----- SACAR UN SNACK POR CODIGO ----- ");
        dispensador.sacarPorCodigo(03);

        System.out.println("----- IMPRIMIR CANTIDAD DEL SNACK SACADO ----- ");
        dispensador.obtenerCantidad("Milky Way");

        System.out.println("----- SACAR UN SNACK POR NOMBRE ----- ");
        dispensador.sacarPorNombre("Kit Kat");

        System.out.println("----- IMPRIMIR CANTIDAD DEL SNACK SACADO ----- ");
        dispensador.obtenerCantidad("Twix");

        System.out.println("----- AUMENTAR CANTIDAD ----- ");
        dispensador.aumentarCantidad("Kit Kat", 04, (short) 8);

        System.out.println("\n----- IMPRIMIR CANTIDAD DEL SNACK AGREGADO ----- ");
        dispensador.obtenerCantidad("Barra Tosh");

        System.out.println("----- QUITAR SNACK ----- ");
        dispensador.quitar(snackDePrueba1);
        dispensador.quitar(snackDePrueba2);

        System.out.println("----- IMPRIMIR CANTIDAD DEL SNACK QUITADO ----- ");
        dispensador.obtenerCantidad(snackDePrueba1.getNombre());
        dispensador.obtenerCantidad(snackDePrueba2.getNombre());

        System.out.println("----- OBTENER SNACKS AGOTADOS ----- ");
        dispensador.obtenerAgotados().forEach(c -> System.out.println(c));

        System.out.println("----- OBTENER NOMBRE Y CANTIDAD DE LOS SNACKS DEL DISPENSADOR ----- ");
        dispensador.obtenerInventario().forEach(c -> System.out.println(c));

        System.out.println("----- OBTENER DISPENSADOR ORDENADO DE MAYOR A MENOR VALOR ----- ");
        dispensador.obtenerValorMayorAMenor().forEach(c -> System.out.println(c.getNombre() + " "
                + c.getCodigo() + " " + c.getValor() + " " + c.getCantidadDeUnidades()));

        System.out.println("----- OBTENER DISPENSADOR ORDENADO DE MENOR A MAYOR ----- ");
        dispensador.obtenerCantidadMenorAMayor().forEach(c -> System.out.println(c.getNombre() + " "
                + c.getCodigo() + " " + c.getValor() + " " + c.getCantidadDeUnidades()));
    }
}
