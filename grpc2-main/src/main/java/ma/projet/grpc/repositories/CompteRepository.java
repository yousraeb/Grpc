package ma.projet.grpc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ma.projet.grpc.entities.Compte;

import java.util.List;

public interface CompteRepository extends JpaRepository<Compte,String> {
    List<Compte> findByType(String type);
}
