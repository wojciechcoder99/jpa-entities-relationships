package app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.models.Weapon;

@Repository
public interface WeaponRepository extends JpaRepository<Weapon, Long> {

}
