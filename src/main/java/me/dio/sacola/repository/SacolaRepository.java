package me.dio.sacola.repository;

import me.dio.sacola.model.Sacola;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Faz com que esse repositorio se conecte/tenha acesso com o BD
public interface SacolaRepository extends JpaRepository <Sacola, Long > {
}
