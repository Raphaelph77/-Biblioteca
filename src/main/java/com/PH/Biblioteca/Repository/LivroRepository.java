package com.PH.Biblioteca.Repository;


import com.PH.Biblioteca.Modal.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro,Long> {
}
