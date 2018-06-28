package br.com.alura.listavip.service;

import br.com.alura.listavip.model.Convidado;
import br.com.alura.listavip.repository.ConvidadoRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ConvidadoService {

    @Autowired
    private ConvidadoRepository repository;

    public Iterable<Convidado> obterTodos() {
        return repository.findAll();
    }

    public void salvar(Convidado convidado) {
        repository.save(convidado);
    }
}
