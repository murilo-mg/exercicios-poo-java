public class IniciadoJedi {
    public String nome;
    public String especie;
    public int anoNascimento;

    public IniciadoJedi() {
        this("", "", 0);
    }

    public IniciadoJedi(String nome, String especie, int anoNascimento) {
        this.nome = nome;
        this.especie = especie;
        this.anoNascimento = anoNascimento;
    }

    public String getAnoNascimento() {
        int ano = Math.abs(this.anoNascimento);
        String sigla = (this.anoNascimento < 0) ? "ABY" : "DBY";
        return ano + " " + sigla;
    }

    public String getDescricao() {
        return nome + " (especie=" + especie + ", nascimento=" + getAnoNascimento() + ")";
    }
}