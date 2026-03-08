package exercicios.DesafioOracle;

import java.util.HashMap;

public class EncontrarDepartamento {

    public static HashMap<Integer, Departamento> departamentos = new HashMap<>();

    static {
        departamentos.put(101, new Departamento("Economia"));
        departamentos.put(102, new Departamento("Recursos Humanos"));
        departamentos.put(103, new Departamento("Tecnologia"));
    }

    public static Departamento buscar (int numeroDepartamento){

        Departamento departamento = departamentos.get(numeroDepartamento);

        if (departamento == null){
            throw new RuntimeException("Departamento não encontrado");
        }

        return departamento;
    }
}
