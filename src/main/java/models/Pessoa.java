package models;

import lombok.Getter;

@Getter
public abstract class Pessoa {

    protected String nome;
    protected String telefone;
    protected String endereco;
    protected String email;
    protected String cpf;
}
