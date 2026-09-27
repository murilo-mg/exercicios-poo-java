/**
 * Exercício 3: Classe TurmaEmSala
 * Representa a associação entre uma turma e a sala em que ela foi alocada.
 */
public class TurmaEmSala {
    public Turma turma;
    public Sala sala;

    public TurmaEmSala() {
        this(null, null);
    }

    public TurmaEmSala(Turma turma, Sala sala) {
        this.turma = turma;
        this.sala = sala;
    }
}