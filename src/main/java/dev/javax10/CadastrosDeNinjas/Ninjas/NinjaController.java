package dev.javax10.CadastrosDeNinjas.Ninjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;
import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    @Autowired
    private NinjaService ninjaService;

    @GetMapping("/boasvindas")
    public String boasvindas() {
        return "Essa é minha primeira mensagem nessa rota";
    }

    //Adicionar ninja - Criar
    @PostMapping("/adicionar")
    public String adicionarNinja(){
        return "Ninja Criado";
    }

    //Mostrar todos os Ninja - Read
    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas(){
        return ninjaService.listarNinjas();
    }

    //Mostrar Ninja por ID - Read
    @GetMapping("/todosID")
    public String mostrarTodosOsNinjasID(){
        return "Mostrar todos os Ninjas por ID";
    }

    //Alterar dados do Ninja - Update
    @PutMapping("/alterar")
    public String alterarNinjaPorID(){
        return "Alterar Ninja por ID";
    }

    //Deletar ninja - Delete
    @DeleteMapping("/deletarID")
    public String deletarNinjaPorID(){
        return "Deletar ninja por ID";
    }

}
