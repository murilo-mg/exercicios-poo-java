import java.util.ArrayList;

public class SessaoJedi {
    public String nome;
    public TreinadorJedi treinador;
    public ArrayList<IniciadoJedi> iniciados;

    public SessaoJedi(String nome, TreinadorJedi treinador) {
        this.nome = nome;
        this.treinador = treinador;
        this.iniciados = new ArrayList<>();
    }

    public void addIniciado(IniciadoJedi iniciado) {
        if (iniciado == null) return;
        
        for (IniciadoJedi i : iniciados) {
            if (i.nome.equalsIgnoreCase(iniciado.nome)) {
                return;
            }
        }
        iniciados.add(iniciado);
    }

    public IniciadoJedi getIniciado(String nome) {
        for (IniciadoJedi i : iniciados) {
            if (i.nome.equalsIgnoreCase(nome)) {
                return i;
            }
        }
        return null;
    }

    public double getMediaAnoNascimento() {
        if (iniciados.isEmpty()) return 0.0;
        
        double soma = 0;
        for (IniciadoJedi i : iniciados) {
            soma += i.anoNascimento;
        }
        return soma / iniciados.size();
    }

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