package br.com.spring_boot_learning.EstudandoSpringBoot.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping ("/boasvindas")
    public String boasVindas(){
        return "Essa é minha primeira mensagem nessa rota";
    }

    // Adicionar Ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja criado";
    }

    // Mostrar todos os ninjas (READ)
    @GetMapping("/all")
    public String mostrarTodosOsNinjas(){
        return "Mostrar Ninja";
    }


    // Mostrar Ninjas por id (READ)
    @GetMapping("/todosID")
    public String mostrarTodosOsNinjasPorID(){
        return "Mostrar por ID";
    }

    //Alterar dados do Ninja (UPDATE)
    @PutMapping("/alterarNinjaID")
    public String alterarNinjaPorID(){
        return "Alterar Ninja por ID";
    }

    // Deletar Ninja (DELETE)
    @DeleteMapping("/deletarID")
    public String deletarNinjaPorId(){
        return "Ninja deletado por ID";
    }



}
