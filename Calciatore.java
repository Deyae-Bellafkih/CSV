public class Calciatore {

    private String squadra;
    private String nome;
    private String ruolo;
    private int partite;
    private int gol;
    private int assist;

    public Calciatore(String squadra, String nome, String ruolo, int partite, int gol, int assist) {
        this.squadra = squadra;
        this.nome = nome;
        this.ruolo = ruolo;
        this.partite = partite;
        this.gol = gol;
        this.assist = assist;
    }

    // Getter
    public int getGol() {
        return gol;
    }

    public int getAssist() {
        return assist;
    }

    public int getPartite() {
        return partite;
    }

    public String getNome() {
        return nome;
    }

    public String toCSV() {
        return squadra + "," + nome + "," + ruolo + "," + partite + "," + gol + "," + assist;
    }
}
