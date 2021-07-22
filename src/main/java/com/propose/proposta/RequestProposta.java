package com.propose.proposta;

import org.hibernate.validator.constraints.br.CNPJ;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

public class RequestProposta {

    @CNPJ
    @CPF
    private String CNPFCNPJ;

    private String nome;

    private String email;

    private String endereco;

    private BigDecimal salario;
}
