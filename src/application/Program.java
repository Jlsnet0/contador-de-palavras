package application;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);
            System.out.println("----------- Contador de Palavras -----------");
            System.out.print("Digite a frase: ");
            String phrase = sc.nextLine().toUpperCase().strip();
            if (phrase.isEmpty()) {
                System.out.println("Não existem palavras.");
            } else {
                String[] words = phrase.split("\\s+");
                System.out.println("Total de palavras: " + words.length);
                System.out.println();
                Map<String, Integer> count = new LinkedHashMap<>();
                for (int i = 0; i < words.length ; i++) {
                    count.put(words[i], count.getOrDefault(words[i], 0) + 1);
                }

                for (Entry<String, Integer> entry : count.entrySet()) {
                    System.out.println("Palavra: " + entry.getKey());
                    System.out.println("Total: " + entry.getValue());
                }
            }
            sc.close();

    }
}       
