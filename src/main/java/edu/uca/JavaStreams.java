package edu.uca;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreams {
    //Ejercicio 1
    public static List<Integer> filtrarNumerosPares(List<Integer> numeros) {
        List<Integer> numerosPares = numeros.stream()
                .filter(numero -> (numero%2 == 0))
                .collect(Collectors.toList());
        return numerosPares;
    }

    @Test
    public void testFilterEvenNumbers() {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> esperado = Arrays.asList(2, 4, 6);
        Assert.assertEquals(esperado, filtrarNumerosPares(numeros));
    }

    //Ejercicio 2
    public static String concatenarNombres(List<String> nombres) {
        String nombresConcatenados = nombres.stream()
                .collect(Collectors.joining(", "));
        return nombresConcatenados;
    }

    @Test
    public void testConcatenateNames() {
        List<String> nombres = Arrays.asList("Alice", "Bob", "Charlie");
        String esperado = "Alice, Bob, Charlie";
        Assert.assertEquals(esperado, concatenarNombres(nombres));
    }
}
