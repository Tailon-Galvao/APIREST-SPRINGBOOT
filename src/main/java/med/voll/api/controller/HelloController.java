package med.voll.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/* Aqui nao tem nada de SpringBoot abaixo é Spring MVC, logo preciso usar as anotações do MVC
 * 
 * No caso na aplicação Rest tradicional usamos as anotações REST na frente @RestController
 * para dizer a URL que o controller vai responder usamos a RequestMapping
 * 
 * 
 * Para que o Spring reconheça a classe como um Controller, ela deve ser anotada com @Controller ou com @RestController.
 */
@RestController
@RequestMapping("/hello")
public class HelloController{

    //Qualquer requisição do tipo get para esse controller com rota /hello chame o método ola mundo
    @GetMapping
    public String olaMundo(){
        return "Olá Mundo!";
    }

}
