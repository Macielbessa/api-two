package apirest.two.tarefando.Controller;

import apirest.two.tarefando.Model.Client;
import apirest.two.tarefando.Repository.ClientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController // classe que irá receber requisições
@RequestMapping("/clients")
public class ClientsController {
    @Autowired
    //atribuito
    private ClientsRepository clientsRepository;


    @GetMapping // uma requisição que irá retornar um cliente novo a cada registro
        // 1 método
    public List <Client> list() {
      return clientsRepository.findAll();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Client adicionar (@RequestBody Client client){
        return clientsRepository.save(client);
    }
}
