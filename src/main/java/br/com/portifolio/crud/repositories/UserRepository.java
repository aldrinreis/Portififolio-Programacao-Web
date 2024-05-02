package br.com.portifolio.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.portifolio.crud.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
   
}
