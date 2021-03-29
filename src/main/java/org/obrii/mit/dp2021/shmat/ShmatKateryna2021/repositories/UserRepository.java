package org.obrii.mit.dp2021.shmat.ShmatKateryna2021.repositories;

import org.obrii.mit.dp2021.shmat.ShmatKateryna2021.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<Users, Long> {
    List<Users> findUsersByName(String name);
}
