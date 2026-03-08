package exercicios.DesafioOracle;

public class Funcionario {

   private String nome;
   private int numeroDepartamento;

    public Funcionario(String nome, int numeroDepartamento) {
        this.nome = nome;
        this.numeroDepartamento = numeroDepartamento;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroDepartamento() {
        return numeroDepartamento;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", numeroDepartamento=" + numeroDepartamento +
                '}';
    }
}
