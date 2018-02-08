package model.repositories;

import model.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User findUsersByEmailAndPassword(String email,String pass);
    User saveAndFlush(Long id);
}
