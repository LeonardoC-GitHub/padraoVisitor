public class VisitorTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(12345, "João", new Curso("Engenharia"));
        Professor professor = new Professor(67890, "Maria", "Doutora");
        Funcionario funcionario = new Funcionario(11223, "Carlos", 5000.0);

        Visitor csvVisitor = new CSVVisitor();
        Visitor jsonVisitor = new JSONVisitor();
        Visitor xmlVisitor = new XMLVisitor();

        // CSV Visitor Tests
        assert csvVisitor.exibirAluno(aluno).equals("Aluno,João,12345");
        assert csvVisitor.exibirProfessor(professor).equals("Professor,Maria,Doutora");
        assert csvVisitor.exibirFuncionario(funcionario).equals("Funcionario,Carlos,5000.0");

        // JSON Visitor Tests
        assert jsonVisitor.exibirAluno(aluno).equals("{\"Aluno\":{\"nome\":\"João\",\"matricula\":\"12345\"}}");
        assert jsonVisitor.exibirProfessor(professor).equals("{\"Professor\":{\"nome\":\"Maria\",\"titulacao\":\"Doutora\"}}");
        assert jsonVisitor.exibirFuncionario(funcionario).equals("{\"Funcionario\":{\"nome\":\"Carlos\",\"salario\":5000.0}}");

        // XML Visitor Tests
        assert xmlVisitor.exibirAluno(aluno).equals("<Aluno><nome>João</nome><matricula>12345</matricula></Aluno>");
        assert xmlVisitor.exibirProfessor(professor).equals("<Professor><nome>Maria</nome><titulacao>Doutora</titulacao></Professor>");
        assert xmlVisitor.exibirFuncionario(funcionario).equals("<Funcionario><nome>Carlos</nome><salario>5000.0</salario></Funcionario>");

        System.out.println("All tests passed.");
    }
}

class Curso {
    private String nome;

    public Curso(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class Aluno {
    private int matricula;
    private String nome;
    private Curso curso;

    public Aluno(int matricula, String nome, Curso curso) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public Curso getCurso() {
        return curso;
    }
}

class Professor {
    private int id;
    private String nome;
    private String titulacao;

    public Professor(int id, String nome, String titulacao) {
        this.id = id;
        this.nome = nome;
        this.titulacao = titulacao;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public String getMatricula() {
        throw new UnsupportedOperationException("Unimplemented method 'getMatricula'");
    }
}

class Funcionario {
    private int id;
    private String nome;
    private double salario;

    public Funcionario(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public String getCodigo() {
        throw new UnsupportedOperationException("Unimplemented method 'getCodigo'");
    }
}
