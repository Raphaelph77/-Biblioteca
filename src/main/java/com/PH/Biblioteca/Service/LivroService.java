package com.PH.Biblioteca.Service;


import com.PH.Biblioteca.Modal.Livro;
import com.PH.Biblioteca.Repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {


    @Autowired
    private LivroRepository livroRepository;

    public List<Livro> lista(){
        return livroRepository.findAll();
    }

    public Optional<Livro> entidade(Long id){
        return livroRepository.findById(id);
    }

    public Livro save(Livro entidade){
        return livroRepository.save(entidade);
    }


}