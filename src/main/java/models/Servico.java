package models;

import lombok.Getter;
import java.time.LocalDateTime;
import java.util.List;

@Getter
public class Servico {

    private Gerente gerente;
    private double valor;
    private Cliente nomeCliente;
    private Calendario data;
    private Imovel local;
    private List<FuncionarioLimpeza> equipe;
    private FuncionarioLimpeza funcionario;

    public void agendarVisita(Cliente nomeCliente, LocalDateTime data, Imovel local, Gerente gerente) {
    }

    public void agendarLimpeza(Cliente nomeCliente, LocalDateTime data, Imovel local, List<FuncionarioLimpeza> equipe) {
    }
}
