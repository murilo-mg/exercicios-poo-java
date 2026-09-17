import java.util.ArrayList;

public class Ensalamento {
    public ArrayList<Sala> salas;
    public ArrayList<Turma> turmas;
    public ArrayList<TurmaEmSala> ensalamento;

    public Ensalamento() {
        salas = new ArrayList<Sala>();
        turmas = new ArrayList<Turma>();
        ensalamento = new ArrayList<TurmaEmSala>();
    }

    public void addSala(Sala sala) {
        salas.add(sala);
    }

    public void addTurma(Turma turma) {
        turmas.add(turma);
    }

    public Sala getSala(Turma turma) {
        for (TurmaEmSala item : ensalamento) {
            if (item.turma == turma) {
                return item.sala;
            }
        }

        return null;
    }

    public boolean salaDisponivel(Sala sala, int horario) {
        for (TurmaEmSala item : ensalamento) {
            if (item.sala == sala) {
                if (item.turma.horarios.contains(horario)) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean salaDisponivel(Sala sala, ArrayList<Integer> horarios) {
        for (Integer horario : horarios) {
            if (!salaDisponivel(sala, horario)) {
                return false;
            }
        }

        return true;
    }

    public boolean alocar(Turma turma, Sala sala) {
        if (getSala(turma) != null) {
            return false;
        }

        if (turma.acessivel && !sala.acessivel) {
            return false;
        }

        if (turma.numAlunos > sala.capacidade) {
            return false;
        }

        if (!salaDisponivel(sala, turma.horarios)) {
            return false;
        }

        ensalamento.add(new TurmaEmSala(turma, sala));

        return true;
    }

    public void alocarTodas() {
        for (Turma turma : turmas) {
            for (Sala sala : salas) {
                if (alocar(turma, sala)) {
                    break;
                }
            }
        }
    }

    public int getTotalTurmasAlocadas() {
        return ensalamento.size();
    }

    public int getTotalEspacoLivre() {
        int total = 0;

        for (TurmaEmSala item : ensalamento) {
            total += item.sala.capacidade - item.turma.numAlunos;
        }

        return total;
    }

    public String relatorioResumoEnsalamento() {
        return "Total de Salas: " + salas.size()
                + "\nTotal de Turmas: " + turmas.size()
                + "\nTurmas Alocadas: " + getTotalTurmasAlocadas()
                + "\nEspaços Livres: " + getTotalEspacoLivre();
    }

    public String relatorioTurmasPorSala() {
        String resultado = relatorioResumoEnsalamento() + "\n";

        for (Sala sala : salas) {
            resultado += "\n--- " + sala.getDescricao() + " ---\n";

            for (TurmaEmSala item : ensalamento) {
                if (item.sala == sala) {
                    resultado += "\n" + item.turma.getDescricao() + "\n";
                }
            }
        }

        return resultado;
    }

    public String relatorioSalasPorTurma() {
        String resultado = relatorioResumoEnsalamento() + "\n";

        for (Turma turma : turmas) {
            resultado += "\n" + turma.getDescricao() + "\n";

            Sala sala = getSala(turma);

            if (sala == null) {
                resultado += "Sala: SEM SALA\n";
            } else {
                resultado += "Sala: " + sala.getDescricao() + "\n";
            }
        }

        return resultado;
    }
}