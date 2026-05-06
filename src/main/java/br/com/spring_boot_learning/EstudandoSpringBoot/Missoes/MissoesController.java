package br.com.spring_boot_learning.EstudandoSpringBoot.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")

public class MissoesController {

    // Mandar requisição para listar missao (GET)
    @GetMapping("/listar")
    public String listarMissoes(){
        return "Missoes listadas com sucesso"
    }


    // Mandar requisição para criar missao  (POST)
    @PostMapping("/criar")
    public String criarMissao(){
        return "Missão criada com sucesso";
    }


    // Mandar requisição para alterar missao  (PUT)
    @PutMapping("/alterar")
    public String alterarMissao(){
        return "Missão alterada com sucesso";
    }

    //Mandar requisição para deletar missao (DELETE)
    @DeleteMapping("/deletar")
    public String deletarMissao(){
        return "Missão deletada com sucesso";
    }
}
