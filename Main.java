import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Calciatore[] giocatori = new Calciatore[100];
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("input.csv"))) {
            String header = reader.readLine();
            String line;

            while ((line = reader.readLine()) != null) {
                String[] campi = line.split(",");
                if (campi.length == 6) {
                    String squadra = campi[0];
                    String nome = campi[1];
                    String ruolo = campi[2];
                    int partite = Integer.parseInt(campi[3]);
                    int gol = Integer.parseInt(campi[4]);
                    int assist = Integer.parseInt(campi[5]);

                    giocatori[count++] = new Calciatore(squadra, nome, ruolo, partite, gol, assist);
                }
            }

        } catch (IOException e) {
            System.out.println("Errore nella lettura del file: " + e.getMessage());
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("copia.csv"))) {

            writer.write("Squadra,Calciatore,Ruolo,Partite,Gol,Assist");
            writer.newLine();

            for (int i = 0; i < count; i++) {
                writer.write(giocatori[i].toCSV());
                writer.newLine();
            }

            System.out.println("File 'copia.csv' creato con successo!");

        } catch (IOException e) {
            System.out.println("Errore nella scrittura del file: " + e.getMessage());
        }
    }
}

