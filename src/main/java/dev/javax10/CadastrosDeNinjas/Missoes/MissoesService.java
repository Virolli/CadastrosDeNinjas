package dev.javax10.CadastrosDeNinjas.Missoes;

import jakarta.persistence.Id;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class MissoesService {

    private MissoesRepository missoesRepository;

    public MissoesService (MissoesRepository missoesRepository){
        this.missoesRepository = missoesRepository;
    }

    //Listar todas as missões
    public List<MissoesModel> listarMissoes(){
        return missoesRepository.findAll();
    }

    // Listar todos os minhas missões por ID
    public MissoesModel listarMissoesPorId(Long id){
        Optional<MissoesModel> missoesPorId= missoesRepository.findById(id);
        return missoesPorId.orElse(null);
    }

    //Criar um novo ninja
    public MissoesModel criarMissao(MissoesModel missao){
        return missoesRepository.save(missao);
    }

    //Deletar uma missão criada
    public void deletarMissao(@PathVariable Long id){
        missoesRepository.deleteById(id);
    }

}
