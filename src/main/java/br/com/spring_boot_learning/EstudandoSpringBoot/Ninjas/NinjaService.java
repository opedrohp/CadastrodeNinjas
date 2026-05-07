package br.com.spring_boot_learning.EstudandoSpringBoot.Ninjas;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {


    private  NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    // Listar todos os meus ninjas
    public List<NinjaModel> listarNinjas(){
        return ninjaRepository.findAll();
    }

// Procurar ninja por ID
    public NinjaModel listarPorID (long id) {
        Optional<NinjaModel> ninjaPorID = ninjaRepository.findById(id);
        return ninjaPorID.orElse(null);
    }

    // Criar um novo ninja
    public NinjaModel criarNinja(NinjaModel ninja){
        return ninjaRepository.save(ninja);
    }

    // Deletar o ninja -Tem que ser um metodo VOID
    public void deletarNinjaPorID(Long id){
        ninjaRepository.deleteById(id);
    }






}
