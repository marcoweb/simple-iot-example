package application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import application.model.Dado;

public interface DadoRepository extends JpaRepository<Dado, Long> {
    List<Dado> findByReferencia(String referencia);
}
