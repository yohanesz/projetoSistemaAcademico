public class Avaliacao {

    private float nota;
    private Professor professor;
    private Disciplina disciplina;


    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public float getNota() {
        return nota;
    }
    public void setNota(float nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Avaliacao [nota=" + nota + ", professor=" + professor + "]";
    }
    public Disciplina getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

}
