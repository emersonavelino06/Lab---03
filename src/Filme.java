public class Filme {
    private String nome;
    private int ano;
    private String localAssistir;
    private String localStream;


    public Filme(String nome, int ano, String localAssistir) {

    }

    @Override
    public String toString() {
        return super.toString();
    }
    public int getAno() {
        return ano;
    }
    public String getLocalAssistir() {
        return localAssistir;
    }
    public String getNome() {
        return nome;
    }
    public boolean equals(Object o) {
        return true;
    }
    public int hashCode() {

    }


}
