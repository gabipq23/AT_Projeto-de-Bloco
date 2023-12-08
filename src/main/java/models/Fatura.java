package models;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class Fatura {
    private double valor;
    private LocalDate dataEmissao;
    private Servico servico;

    public void atualizarPagamentoParcial(){}
}
