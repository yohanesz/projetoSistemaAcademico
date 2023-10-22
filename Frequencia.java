public class Frequencia {

    private float frequencia;
    private Professor professor;
    private Disciplina disciplina;
    
    public Frequencia() {
    }

    public Frequencia(float frequencia, Professor professor, Disciplina disciplina) {
        this.frequencia = frequencia;
        this.professor = professor;
        this.disciplina = disciplina;
    }

    public float getFrequencia() {
        return frequencia;
    }
    public void setFrequencia(float frequencia) {
        this.frequencia = frequencia;
    }
    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    @Override
    public String toString() {
        return "Frequencia [frequencia=" + frequencia + ", professor=" + professor + "]";
    }
    public Disciplina getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
}
