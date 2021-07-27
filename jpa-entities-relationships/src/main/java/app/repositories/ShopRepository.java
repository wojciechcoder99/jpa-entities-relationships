package app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.models.Shop;

@Repository
public interface ShopRepository extends JpaRepository<Shop, Long> {

}
