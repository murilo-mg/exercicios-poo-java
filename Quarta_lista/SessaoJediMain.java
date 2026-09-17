public class SessaoJediMain {
    public static void main(String[] args) {
        TreinadorJedi treinador = new TreinadorJedi("Grão-Mestre", "Fae Coven");
        SessaoJedi sessao = new SessaoJedi("Instruções de Uso da Força", treinador);

        IniciadoJedi i1 = new IniciadoJedi("Katooni", "Tholothian", -23);
        IniciadoJedi i2 = new IniciadoJedi("Byph", "Ithorian", -21);
        IniciadoJedi i3 = new IniciadoJedi("Gungi", "Wookiee", -23);
        IniciadoJedi i4 = new IniciadoJedi("Petro", "Human", -22);

        sessao.addIniciado(i1);
        sessao.addIniciado(i2);
        sessao.addIniciado(i3);
        sessao.addIniciado(i4);

        System.out.println(sessao.getDescricao());
    }
}