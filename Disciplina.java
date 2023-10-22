import java.util.ArrayList;
import java.util.HashMap;


public class Disciplina {

    private String nomeDisciplina;
    private int fase;

    private HashMap<String, Professor> professores = new HashMap<>();
    private ArrayList<Avaliacao> avaliacoes = new ArrayList<>();
    private HashMap<String, Aluno> alunosMatriculados = new HashMap<>();

    public String getNome() {
        return nomeDisciplina;
    }
    public void setNome(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public int getFase() {
        return fase;
    }
    public void setFase(int fase) {
        this.fase = fase;
    }
    public HashMap<String, Professor> getProfessores() {
        return professores;
    }
    public Professor getProfessoreByName(String nomeProfessor) {
        return professores.get(nomeProfessor);
    }
    public boolean setProfessores(HashMap<String, Professor> professores) {
        if(professores.size() <= 4) {
            this.professores = professores;
            return true;
        }
        return false;
    }
    public ArrayList<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }
    public void setAvaliacoes(ArrayList<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }
    public String getNomeDisciplina() {
        return nomeDisciplina;
    }
    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }
    public HashMap<String, Aluno> getAlunosMatriculados() {
        return alunosMatriculados;
    }
    public Aluno getAlunoMatriculadoByName(String nomeAluno) {
        return alunosMatriculados.get(nomeAluno);
    }
    public void setAlunosMatriculados(HashMap<String, Aluno> alunosMatriculados) {
        this.alunosMatriculados = alunosMatriculados;
    }
}
