package models;

import lombok.Getter;

@Getter
public class Imovel {

    private int idImovel;
    private Cliente cliente;
    private String endereco;
    private int numero;
    private int complemento;
    private String cep;
}
