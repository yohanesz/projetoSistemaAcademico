import java.util.HashMap;


public class SistemaMain {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setNome("nomeCurso");
        Aluno aluno = new Aluno();
        aluno.setNome("nomeAluno1");
        aluno.setCpf("cpfAluno1");
        aluno.setCurso(curso);
        System.out.println(aluno.getCurso().getNome());
        
        Disciplina disciplina = new Disciplina();
        HashMap<String, Professor> professores = new HashMap<>();

        Professor p1 = new Professor();
        p1.setNome("prof1");
        Professor p2 = new Professor();
        p2.setNome("prof2");
        Professor p3 = new Professor();
        p3.setNome("prof3");
        Professor p4 = new Professor();
        p4.setNome("prof4");
        Professor p5 = new Professor();
        p5.setNome("prof5");

        professores.put("prof1", p1);
        System.out.println(disciplina.setProfessores(professores));
        professores.put("prof2", p2);
        professores.put("prof3", p3);
        professores.put("prof4", p4);
        System.out.println(disciplina.setProfessores(professores));
        professores.put("prof5", p5);
        System.out.println(disciplina.setProfessores(professores));

        
        // Scanner read = new Scanner(System.in);
        // Map <String, Aluno> alunos = new HashMap<>();

        // boolean verificador = true;

        // do {

        //     System.out.println("Seja bem vindo(a), selecione a opção desejada: ");
        //     System.out.println("[1] - Cadastrar novo aluno");
        //     System.out.println("[2] - Remover aluno");
        //     System.out.println("[3] - Cadastrar novo curso");
        //     System.out.println("[3] - Registrar frequência/avaliação");
        //     System.out.println("[4] - Informações sobre aluno/professor");
        //     System.out.println("[5] - Informações sobre disciplina");
        //     System.out.println("[6] - Informações sobre curso");
        //     System.out.println("[7] - Sair do programa");

        //     int answ = read.nextInt();
        //     read.nextLine();
                    
        //     switch (answ) {

        //         case 1:

        //             System.out.println("Insira as seguintes informações do aluno:");

        //             System.out.print("Nome:");
        //             String nomeAluno = read.nextLine();
        //             System.out.print("CPF: ");
        //             String cpf = read.nextLine();

        //             Aluno novoAluno = new Aluno();
        //             novoAluno.setNome(nomeAluno);
        //             novoAluno.setCpf(cpf);

        //             alunos.put(nomeAluno, novoAluno);

                    
                    
        //             break;
                    
        //             case 2:
                    
        //             break;
                    
        //             case 3:
                    
        //             break;
                    
        //             case 4:

        //             System.out.print("Informe o nome do aluno:");
        //             String nomeProcurarAluno = read.nextLine();

        //             Aluno alunoEncontrado = alunos.get(nomeProcurarAluno);
        
        //             if (alunoEncontrado != null) {
        //             System.out.println("Informações do aluno:");
        //             System.out.println("Nome: " + alunoEncontrado.getNome());
        //             System.out.println("CPF: " + alunoEncontrado.getCpf());
        //             } else {
        //             System.out.println("Aluno não encontrado.");
        //             }


        //         break;

        //         case 5: 

        //         break;

        //         case 6:

        //         break;

        //         case 7:

        //             System.out.println("Até logo! :D");
        //             verificador = false;

        //         break;

        //     default:

        //     break;
        //     }

        // } while (verificador);


        
    }
}
