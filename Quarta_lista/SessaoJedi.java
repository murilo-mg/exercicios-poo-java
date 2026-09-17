import java.util.ArrayList;

/**
 * Exercício 3: Classe SessaoJedi
 * Gerencia uma sessão de treinamento contendo um treinador responsável e uma lista de iniciados.
 */
public class SessaoJedi {
    public String nome;
    public TreinadorJedi treinador;
    public ArrayList<IniciadoJedi> iniciados;

    public SessaoJedi(String nome, TreinadorJedi treinador) {
        this.nome = nome;
        this.treinador = treinador;
        this.iniciados = new ArrayList<>();
    }

    // Adiciona o iniciado apenas se não houver outro com o mesmo nome na sessão
    public void addIniciado(IniciadoJedi iniciado) {
        if (iniciado == null) return;
        
        for (IniciadoJedi i : iniciados) {
            if (i.nome.equalsIgnoreCase(iniciado.nome)) {
                return;
            }
        }
        iniciados.add(iniciado);
    }

    // Busca um iniciado pelo nome
    public IniciadoJedi getIniciado(String nome) {
        for (IniciadoJedi i : iniciados) {
            if (i.nome.equalsIgnoreCase(nome)) {
                return i;
            }
        }
        return null;
    }

    // Calcula a média do ano de nascimento dos iniciados cadastrados
    public double getMediaAnoNascimento() {
        if (iniciados.isEmpty()) return 0.0;
        
        double soma = 0;
        for (IniciadoJedi i : iniciados) {
            soma += i.anoNascimento;
        }
        return soma / iniciados.size();
    }

    // Monta o relatório completo da sessão e de seus componentes
    public String getDescricao() {
        StringBuilder sb = new StringBuilder();
        sb.append("--> SESSÃO ").append(nome)
          .append(" (Treinador: ").append(treinador.getDescricao()).append(")");

        for (int i = 0; i < iniciados.size(); i++) {
            sb.append("\n - Iniciado ").append(i + 1).append(": ")
              .append(iniciados.get(i).getDescricao());
        }

        return sb.toString();
    }
}