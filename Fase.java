import java.util.HashMap;

public class Fase {
    
    private int numeroFase;
    private HashMap<String, Disciplina> disciplinas = new HashMap<String, Disciplina>();
    
    public HashMap<String, Disciplina> getDisciplinas() {
        return disciplinas;
    }
    public Disciplina getDisciplinaByName(String nomeDisciplina) {
        return disciplinas.get(nomeDisciplina);
    }
    public void setDisciplinas(HashMap<String, Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
    @Override
    public String toString() {
        return "Fase [periodo=" + numeroFase + ", disciplinas=" + disciplinas + "]";
    }
    public int getNumeroFase() {
        return numeroFase;
    }
    public void setNumeroFase(int numeroFase) {
        this.numeroFase = numeroFase;
    }
}
