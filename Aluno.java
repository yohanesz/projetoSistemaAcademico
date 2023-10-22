import java.util.HashMap;

public class Aluno extends Pessoa {

    private int matricula;
    private Curso curso;
    private HashMap<String, Disciplina> disciplinasMatriculadas = new HashMap<>();
    private HashMap<String, Frequencia> frequencias = new HashMap<>();
    private HashMap<String, Avaliacao> avaliacoes = new HashMap<>();

    public Aluno() {

    }

    public Aluno(String nome, String cpf, int matricula, Curso curso, HashMap<String, Disciplina> disciplinasMatriculadas) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.matricula = matricula;
        this.curso = curso;
        this.disciplinasMatriculadas = disciplinasMatriculadas;
    }

    public String matricular(String nomeDisciplina, int fase) {
        
        boolean disciplinaJaExiste = this.getDisciplinaMatriculadaByName(nomeDisciplina) == null;

        if (disciplinaJaExiste) {
            return "Aluno já matriculado nesta disciplina";
        }
        //se a disciplina já existir o código para por aqui 
        
        Disciplina disciplina = curso.getFaseByNumber(fase).getDisciplinaByName(nomeDisciplina);
        disciplinasMatriculadas.put(disciplina.getNome(), disciplina);
        return "Matrícula realizada com sucesso!";
    }
    
    public void registrarFrequencia(String nomeDisciplina, String nomeProfessor, float porcentagemFrequencia) {
        Frequencia frequencia = new Frequencia();
        frequencia.setDisciplina(getDisciplinaMatriculadaByName(nomeDisciplina));
        frequencia.setFrequencia(porcentagemFrequencia);
        frequencia.setProfessor(getDisciplinaMatriculadaByName(nomeDisciplina).getProfessoreByName(nomeProfessor));

        frequencias.put(nomeProfessor, frequencia);
    }

    public void registrarAvaliacao(String nomeDisciplina, String nomeProfessor, float nota) {
        Avaliacao avaliacao = new Avaliacao();
        avaliacao.setDisciplina(getDisciplinaMatriculadaByName(nomeDisciplina));
        avaliacao.setNota(nota);
        avaliacao.setProfessor(getDisciplinaMatriculadaByName(nomeDisciplina).getProfessoreByName(nomeProfessor));
        
        avaliacoes.put(nomeProfessor, avaliacao);
    }

    public HashMap<String, Disciplina> getDisciplinasMatriculadas() {
        return disciplinasMatriculadas;
    }

    public Disciplina getDisciplinaMatriculadaByName(String nomeDisciplina) {
        return disciplinasMatriculadas.get(nomeDisciplina);
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
   
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno [curso=" + curso + ", disciplinas=" + disciplinasMatriculadas + ", matricula=" + matricula + "]";
    }

    public void setDisciplinasMatriculadas(HashMap<String, Disciplina> disciplinasMatriculadas) {
        this.disciplinasMatriculadas = disciplinasMatriculadas;
    }

    public HashMap<String, Frequencia> getFrequencias() {
        return frequencias;
    }

    public Frequencia getFrequenciaByProfessor(String nomeProfessor) {
        return frequencias.get(nomeProfessor);
    }

    public void setFrequencias(HashMap<String, Frequencia> frequencia) {
        this.frequencias = frequencia;
    }

    public HashMap<String, Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public Avaliacao getAvaliacaoByProfessor(String nomeProfessor) {
        return avaliacoes.get(nomeProfessor);
    }

    public void setAvaliacoes(HashMap<String, Avaliacao> avaliacao) {
        this.avaliacoes = avaliacao;
    }

}