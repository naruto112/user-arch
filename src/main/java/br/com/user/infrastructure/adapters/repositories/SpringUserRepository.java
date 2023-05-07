package br.com.user.infrastructure.adapters.repositories;

import br.com.user.infrastructure.adapters.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface SpringUserRepository extends JpaRepository<UserEntity, UUID> {
    @Override
    Optional<UserEntity> findById(UUID uuid);
}
