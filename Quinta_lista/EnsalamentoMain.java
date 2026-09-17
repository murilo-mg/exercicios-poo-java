public class EnsalamentoMain {
    public static void main(String[] args) {
        Ensalamento e = new Ensalamento();

        Sala s1 = new Sala(6, 101, 50, true);
        Sala s2 = new Sala(6, 102, 100, true);
        Sala s3 = new Sala(6, 203, 50, false);
        Sala s4 = new Sala(6, 204, 100, false);

        e.addSala(s1);
        e.addSala(s2);
        e.addSala(s3);
        e.addSala(s4);

        Turma t1 = new Turma(
                "Algoritmos e Estrutura de Dados I",
                "Edleno Silva",
                60,
                false
        );

        t1.addHorario(1);
        t1.addHorario(15);
        t1.addHorario(29);

        Turma t2 = new Turma(
                "Técnicas de Programação",
                "Horácio Fernandes",
                50,
                false
        );

        t2.addHorario(4);
        t2.addHorario(18);
        t2.addHorario(32);

        Turma t3 = new Turma(
                "Laboratório de Programação C",
                "Edson Nascimento",
                25,
                true
        );

        t3.addHorario(1);
        t3.addHorario(15);
        t3.addHorario(29);

        Turma t4 = new Turma(
                "Redes de Computadores",
                "Edjair Souza",
                70,
                true
        );

        t4.addHorario(2);
        t4.addHorario(16);

        e.addTurma(t1);
        e.addTurma(t2);
        e.addTurma(t3);
        e.addTurma(t4);

        e.alocarTodas();

        System.out.println(e.relatorioResumoEnsalamento());
        System.out.println();
        System.out.println(e.relatorioTurmasPorSala());
        System.out.println();
        System.out.println(e.relatorioSalasPorTurma());
    }
}