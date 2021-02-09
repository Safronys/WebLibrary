package net.safronys.weblibrary.repository;

import net.safronys.weblibrary.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
