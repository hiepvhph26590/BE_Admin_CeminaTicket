package j5_60.cinematicket.cinematicket.repository;

import j5_60.cinematicket.cinematicket.entity.Ghe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

/**
 * GheRepository
 */
public interface GheRepository extends JpaRepository<Ghe, UUID> {

    List<Ghe> findAllByOrderByTen();
    List<Ghe> findByTenContainingIgnoreCase(String keyword);
}