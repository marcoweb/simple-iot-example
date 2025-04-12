package application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.model.Dado;
import application.repository.DadoRepository;

@RestController
@RequestMapping("/api/v1/dados")
public class DadoController {
    @Autowired
    private DadoRepository dadoRepo;

    @GetMapping
    public Iterable<Dado> findAll() {
        return dadoRepo.findAll();
    }

    @PostMapping
    public Dado insert(@RequestBody Dado dados) {
        return dadoRepo.save(dados);
    }
}
