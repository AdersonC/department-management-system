package exercicios.DesafioOracle;

public class Main {

    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("Aderson Camargo", 103);
        Funcionario f2 = new Funcionario("Carlos Bezerra", 103);
        Funcionario f3 = new Funcionario("Julia Silva", 103);

        Funcionario[] funcionarios = {f1, f2, f3};

        for (Funcionario f : funcionarios) {

            Departamento departamento =
                    EncontrarDepartamento.buscar(f.getNumeroDepartamento());

            departamento.atribuir(f);
        }

        Departamento tecnologia = EncontrarDepartamento.buscar(103);

        System.out.println("Funcionários de " + tecnologia.getNome());

        for (Funcionario f : tecnologia.getFuncionarios()) {
            System.out.println(f.getNome());
        }
    }
}