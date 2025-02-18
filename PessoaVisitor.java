

public class PessoaVisitor implements Visitor {

    public String exibir(Pessoa pessoa) {
        return pessoa.aceitar(this);
    }

    @Override
    public String exibirAluno(Aluno aluno) {
        return "Aluno{" +
                "matricula=" + aluno.getMatricula() +
                ", nome='" + aluno.getNome() + '\'' +
                ", curso=" + aluno.getCurso() +
                '}';
    }

    @Override
    public String exibirProfessor(Professor professor) {
        return "Professor{" +
                "matricula=" + professor.getMatricula() +
                ", nome='" + professor.getNome() + '\'' +
                ", titulacao='" + professor.getTitulacao() + '\'' +
                '}';
    }

    @Override
    public String exibirFuncionario(Funcionario funcionario) {
        return "Funcionario{" +
                "codigo=" + funcionario.getCodigo() +
                ", nome='" + funcionario.getNome() + '\'' +
                ", salario=" + funcionario.getSalario() +
                '}';
    }

    @Override
    public String exibirAlunoCSV(Aluno aluno) {
        throw new UnsupportedOperationException("Unimplemented method 'exibirAlunoCSV'");
    }

    @Override
    public String exibirProfessorCSV(Professor professor) {
        throw new UnsupportedOperationException("Unimplemented method 'exibirProfessorCSV'");
    }

    @Override
    public String exibirFuncionarioCSV(Funcionario funcionario) {
        throw new UnsupportedOperationException("Unimplemented method 'exibirFuncionarioCSV'");
    }

    @Override
    public String exibirAlunoJSON(Aluno aluno) {
        throw new UnsupportedOperationException("Unimplemented method 'exibirAlunoJSON'");
    }

    @Override
    public String exibirProfessorJSON(Professor professor) {
        throw new UnsupportedOperationException("Unimplemented method 'exibirProfessorJSON'");
    }

    @Override
    public String exibirFuncionarioJSON(Funcionario funcionario) {
        throw new UnsupportedOperationException("Unimplemented method 'exibirFuncionarioJSON'");
    }

    @Override
    public String exibirAlunoXML(Aluno aluno) {
        throw new UnsupportedOperationException("Unimplemented method 'exibirAlunoXML'");
    }

    @Override
    public String exibirProfessorXML(Professor professor) {
        throw new UnsupportedOperationException("Unimplemented method 'exibirProfessorXML'");
    }

    @Override
    public String exibirFuncionarioXML(Funcionario funcionario) {
        throw new UnsupportedOperationException("Unimplemented method 'exibirFuncionarioXML'");
    }
}