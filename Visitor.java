public interface Visitor {
    String exibirAluno(Aluno aluno);
    String exibirProfessor(Professor professor);
    String exibirFuncionario(Funcionario funcionario);

    String exibirAlunoCSV(Aluno aluno);
    String exibirProfessorCSV(Professor professor);
    String exibirFuncionarioCSV(Funcionario funcionario);

    String exibirAlunoJSON(Aluno aluno);
    String exibirProfessorJSON(Professor professor);
    String exibirFuncionarioJSON(Funcionario funcionario);

    String exibirAlunoXML(Aluno aluno);
    String exibirProfessorXML(Professor professor);
    String exibirFuncionarioXML(Funcionario funcionario);
}