package med.voll.api.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import med.voll.api.paciente.DadosPaciente;

@RestController
@RequestMapping ("paciente")
public class PacientesController {
    //Utilizar a anotação @RequestBody para receber os dados do corpo da requisição em um parâmetro no Controller;
    @PostMapping
    public void cadastrar(@RequestBody DadosPaciente dados){
        System.out.println("Dados Recebido com sucesso: " + dados);
        
    }

    
}
