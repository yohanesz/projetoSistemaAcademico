import java.util.HashMap;

public class Sistema {
    
    private HashMap <String, Aluno> alunos = new HashMap<>();

    public boolean criarAluno(String nome, String cpf, int matricula) {
        if(getAlunoByName(nome) == null) {
            return false;
        }
        Aluno aluno = new Aluno();
        aluno.setNome(nome);
        aluno.setCpf(cpf);
        aluno.setMatricula(matricula);
        return true;
    }

    public HashMap<String, Aluno> getAlunos() {
        return alunos;
    }

    public Aluno getAlunoByName(String nomeAluno) {
        return alunos.get(nomeAluno);
    }

    public void setAlunos(HashMap<String, Aluno> alunos) {
        this.alunos = alunos;
    }
    

}