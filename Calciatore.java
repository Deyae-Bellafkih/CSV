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

    public int getAssist() {
        return assist;
    }

    public int getGol() {
        return gol;
    }

    public int getPartite() {
        return partite;
    }

    public String getNome() {
        return nome;
    }

    public String getRuolo() {
        return ruolo;
    }

    public String getSquadra() {
        return squadra;
    }

    public static Calciatore fromCSV(String csv) {
        String[] campi = csv.split(",");
        String squadra = campi[0];
        String nome = campi[1];
        String ruolo = campi[2];
        int partite = Integer.parseInt(campi[3]);
        int gol = Integer.parseInt(campi[4]);
        int assist = Integer.parseInt(campi[5]);
        return new Calciatore(squadra, nome, ruolo, partite, gol, assist);
    }

    public String toCSV() {
        return squadra + "," + nome + "," + ruolo + "," + partite + "," + gol + "," + assist;
    }
}
