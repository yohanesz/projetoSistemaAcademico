import java.util.HashMap;
import java.util.Map;

public class Professor extends Pessoa {

    private HashMap<String, Disciplina> disciplinasLecionadas = new HashMap<>();

    
    public void listarDisciplinasLecionadas() {
        for (Map.Entry<String, Disciplina> entry : disciplinasLecionadas.entrySet()) {
            String nomeDisciplina = entry.getKey();
            System.out.println(nomeDisciplina);
        }
    }

    public HashMap<String, Disciplina> getDisciplinasLecionadas() {
        return disciplinasLecionadas;
    }

    public Disciplina getDisciplinaLecionadaByName(String nomeDisciplina) {
        return disciplinasLecionadas.get(nomeDisciplina);
    }

    public void setDisciplinasLecionadas(HashMap<String, Disciplina> disciplinasLecionadas) {
        this.disciplinasLecionadas = disciplinasLecionadas;
    }
}
