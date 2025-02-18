public class XMLVisitor implements Visitor {

    @Override
    public String exibirAluno(Aluno aluno) {
        return exibirAlunoXML(aluno);
    }

    @Override
    public String exibirProfessor(Professor professor) {
        return exibirProfessorXML(professor);
    }

    @Override
    public String exibirFuncionario(Funcionario funcionario) {
        return exibirFuncionarioXML(funcionario);
    }

    @Override
    public String exibirAlunoCSV(Aluno aluno) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String exibirProfessorCSV(Professor professor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String exibirFuncionarioCSV(Funcionario funcionario) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String exibirAlunoJSON(Aluno aluno) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String exibirProfessorJSON(Professor professor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String exibirFuncionarioJSON(Funcionario funcionario) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String exibirAlunoXML(Aluno aluno) {
        return "<Aluno><nome>" + aluno.getNome() + "</nome><matricula>" + aluno.getMatricula() + "</matricula></Aluno>";
    }

    @Override
    public String exibirProfessorXML(Professor professor) {
        return "<Professor><nome>" + professor.getNome() + "</nome><titulacao>" + professor.getTitulacao() + "</titulacao></Professor>";
    }

    @Override
    public String exibirFuncionarioXML(Funcionario funcionario) {
        return "<Funcionario><nome>" + funcionario.getNome() + "</nome><salario>" + funcionario.getSalario() + "</salario></Funcionario>";
    }
}
