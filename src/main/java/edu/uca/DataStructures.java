package edu.uca;

import org.testng.annotations.Test;

import java.util.*;

import static org.testng.Assert.assertEquals;

public class DataStructures {
//    Ejercicio 5:
    public static Map<String, Integer> contarPalabras(List<String> words) {
        Map<String, Integer> contadorDePalabras = new HashMap<>();
        for(String w1 : words) {
            Integer cant = 0;
            for(String w2 : words) {
                if(w1 == w2) {
                    cant ++;
                }
            }
            contadorDePalabras.put(w1, cant);
        }
        return contadorDePalabras;
    }

    @Test
    public void testContarPalabras() {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        Map<String, Integer> esperado = new HashMap<>();
        esperado.put("apple", 3);
        esperado.put("banana", 2);
        esperado.put("orange", 1);
        assertEquals(esperado, contarPalabras(words));
    }

    //    Ejercicio 6:
    public static Set<Integer> unionSets(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        return union;
    }

    @Test
    public void testUnionSets() {
        Set<Integer> set1 = new HashSet<>(Set.of(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Set.of(3, 4, 5));
        Set<Integer> expected = new HashSet<>(Set.of(1, 2, 3, 4, 5));
        assertEquals(expected, unionSets(set1, set2));
    }
}
