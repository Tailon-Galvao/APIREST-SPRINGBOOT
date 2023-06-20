package med.voll.api.medico;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable //A anotação @Embeddable é usada para especificar tipos incorporáveis. Como os tipos básicos, os tipos incorporáveis não tem identidade, sendo gerenciados por sua entidade proprietária.
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Endereco {
    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;

}
