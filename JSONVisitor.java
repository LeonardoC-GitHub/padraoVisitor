public class JSONVisitor implements Visitor {
    @Override
    public String exibirAluno(Aluno aluno) {
        return exibirAlunoJSON(aluno);
    }

    @Override
    public String exibirProfessor(Professor professor) {
        return exibirProfessorJSON(professor);
    }

    @Override
    public String exibirFuncionario(Funcionario funcionario) {
        return exibirFuncionarioJSON(funcionario);
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
        return "{\"Aluno\":{\"nome\":\"" + aluno.getNome() + "\",\"matricula\":\"" + aluno.getMatricula() + "\"}}";
    }

    @Override
    public String exibirProfessorJSON(Professor professor) {
        return "{\"Professor\":{\"nome\":\"" + professor.getNome() + "\",\"titulacao\":\"" + professor.getTitulacao() + "\"}}";
    }

    @Override
    public String exibirFuncionarioJSON(Funcionario funcionario) {
        return "{\"Funcionario\":{\"nome\":\"" + funcionario.getNome() + "\",\"salario\":" + funcionario.getSalario() + "}}";
    }

    @Override
    public String exibirAlunoXML(Aluno aluno) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String exibirProfessorXML(Professor professor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String exibirFuncionarioXML(Funcionario funcionario) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
