package models;

import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
public class Calendario {

    private LocalDateTime dataDeVisita;
    private LocalDateTime dataDeLimpeza;
    private List<LocalDateTime> diasTrabalhados;

    public List<LocalDateTime> verificarDisponibilidadeGerente(Gerente gerente){
        return null;
    }

    public List<LocalDateTime> verificarDisponibilidadeFuncLimpeza(FuncionarioLimpeza funcionarioLimpeza){
        return null;
    }

    public List<LocalDateTime> verificarDiasTrabalhados(List<LocalDateTime> diasTrabalhados) {
        return null;
    }
}

