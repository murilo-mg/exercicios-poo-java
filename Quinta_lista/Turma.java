import java.util.ArrayList;

public class Turma {
    public String nome;
    public String professor;
    public int numAlunos;
    public boolean acessivel;
    public ArrayList<Integer> horarios;

    public Turma() {
        horarios = new ArrayList<Integer>();
    }

    public Turma(String nome, String professor, int numAlunos, boolean acessivel) {
        this.nome = nome;
        this.professor = professor;
        this.numAlunos = numAlunos;
        this.acessivel = acessivel;
        this.horarios = new ArrayList<Integer>();
    }

    public void addHorario(int horario) {
        horarios.add(horario);
    }

    public String getHorariosString() {
        String resultado = "";

        for (int i = 0; i < horarios.size(); i++) {
            int horario = horarios.get(i);

            int indice = horario - 1;
            int dia = indice / 7;
            int faixa = indice % 7;

            String nomeDia = "";
            int hora = 0;

            if (dia == 0)
                nomeDia = "segunda";
            else if (dia == 1)
                nomeDia = "terça";
            else if (dia == 2)
                nomeDia = "quarta";
            else if (dia == 3)
                nomeDia = "quinta";
            else if (dia == 4)
                nomeDia = "sexta";

            if (faixa == 0)
                hora = 8;
            else if (faixa == 1)
                hora = 10;
            else if (faixa == 2)
                hora = 12;
            else if (faixa == 3)
                hora = 14;
            else if (faixa == 4)
                hora = 16;
            else if (faixa == 5)
                hora = 18;
            else if (faixa == 6)
                hora = 20;

            if (i > 0)
                resultado += ", ";

            resultado += nomeDia + " " + hora + "hs";
        }

        return resultado;
    }

    public String getDescricao() {
        return "Turma: " + nome
                + "\nProfessor: " + professor
                + "\nNúmero de Alunos: " + numAlunos
                + "\nHorário: " + getHorariosString()
                + "\nAcessível: " + (acessivel ? "sim" : "não");
    }
}