public class CSVVisitor implements Visitor {
    @Override
    public String exibirAluno(Aluno aluno) {
        return exibirAlunoCSV(aluno);
    }

    @Override
    public String exibirProfessor(Professor professor) {
        return exibirProfessorCSV(professor);
    }

    @Override
    public String exibirFuncionario(Funcionario funcionario) {
        return exibirFuncionarioCSV(funcionario);
    }

    @Override
    public String exibirAlunoCSV(Aluno aluno) {
        return "Aluno," + aluno.getNome() + "," + aluno.getMatricula();
    }

    @Override
    public String exibirProfessorCSV(Professor professor) {
        return "Professor," + professor.getNome() + "," + professor.getTitulacao();
    }

    @Override
    public String exibirFuncionarioCSV(Funcionario funcionario) {
        return "Funcionario," + funcionario.getNome() + "," + funcionario.getSalario();
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
