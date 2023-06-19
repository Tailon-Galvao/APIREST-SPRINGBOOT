package med.voll.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import med.voll.api.medico.DadosCadastroMedico;

/* Anotação para carregra a classe */
@RestController
@RequestMapping("medicos")
public class MedicosController {
    
    /* 
    Lembre-se que estou usando o insomia, para testar as requisições, e la passei um json
    Vai receber um json, por isso String json como parametro, ai para sinalizar que ele esta vindo do corpo da requisiçãoo 
    uso a anotação @RequestBody (corpo da requisição)
    IMPORTANTE: Se voce quer traer toda a requisição bata passar @RequestBody String json como parametro o 
    objeto JSON.
    Mas o correto é voce passar uma classe e organizar o recebimento desse parametro na classe./
    
    @RequestBody DadosCadastroMedico dados -> esse é um padrão DTO que é uma classe contendo um record com os
    valores que quermos receber ou devolver da nossa API
    */    
    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroMedico dados){
        System.out.println(dados);

    }
    
}
