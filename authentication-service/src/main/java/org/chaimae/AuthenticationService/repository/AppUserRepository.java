package org.chaimae.AuthenticationService.repository;


import org.chaimae.AuthenticationService.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    public AppUser findByUsername(String username);
}
