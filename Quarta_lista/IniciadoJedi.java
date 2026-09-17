/**
 * Exercício 1: Classe IniciadoJedi
 * Representa um jovem iniciado Jedi com nome, espécie e ano de nascimento.
 * Suporta formatação da era Galáctica (ABY / DBY).
 */
public class IniciadoJedi {
    public String nome;
    public String especie;
    public int anoNascimento;

    // Construtor padrão que redireciona para o parametrizado (encadeamento)
    public IniciadoJedi() {
        this("", "", 0);
    }

    // Construtor principal
    public IniciadoJedi(String nome, String especie, int anoNascimento) {
        this.nome = nome;
        this.especie = especie;
        this.anoNascimento = anoNascimento;
    }

    // Formata o ano de nascimento: negativo -> ABY, positivo/zero -> DBY
    public String getAnoNascimento() {
        int ano = Math.abs(this.anoNascimento);
        String sigla = (this.anoNascimento < 0) ? "ABY" : "DBY";
        return ano + " " + sigla;
    }

    // Retorna a descrição formatada do iniciado
    public String getDescricao() {
        return nome + " (especie=" + especie + ", nascimento=" + getAnoNascimento() + ")";
    }
}