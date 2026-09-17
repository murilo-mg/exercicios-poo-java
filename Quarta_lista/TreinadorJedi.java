/**
 * Exercício 2: Classe TreinadorJedi
 * Representa um mestre ou treinador responsável pela instrução dos iniciados.
 */
public class TreinadorJedi {
    public String titulacao;
    public String nome;

    public TreinadorJedi() {
        this("", "");
    }

    public TreinadorJedi(String titulacao, String nome) {
        this.titulacao = titulacao;
        this.nome = nome;
    }

    // Retorna a titulação acompanhada do nome do treinador
    public String getDescricao() {
        return titulacao + " " + nome;
    }
}