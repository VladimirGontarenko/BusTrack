package ru.aptek.bustrack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.aptek.bustrack.entities.User;

import java.util.UUID;
@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
}
