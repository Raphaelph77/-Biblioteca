package com.PH.Biblioteca.Controller;

import com.PH.Biblioteca.Modal.Livro;
import com.PH.Biblioteca.Service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Livro")
public class ControllerLivro {

    @Autowired
    private LivroService livroService;


    @PostMapping
    public Livro criar(@RequestBody Livro entidade){
        return livroService.save(entidade);
    }

    @GetMapping
    public List<Livro> listar(){
        return livroService.lista();
    }

    @GetMapping("/{id}")
    public Livro buscar(@PathVariable Long id) {
        return livroService.entidade(id).orElse(null);
    }

    @PatchMapping("/{id}")
    public Livro atualizar(@PathVariable Long id, @RequestBody Livro entidade) {
        entidade.setId(id);
        return livroService.save(entidade);
    }

}