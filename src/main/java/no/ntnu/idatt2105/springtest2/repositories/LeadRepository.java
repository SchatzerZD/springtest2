package no.ntnu.idatt2105.springtest2.repositories;

import no.ntnu.idatt2105.springtest2.entities.Lead;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeadRepository extends JpaRepository<Lead, Long> {



}
