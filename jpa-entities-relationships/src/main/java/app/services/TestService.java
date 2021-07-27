package app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.models.Shop;
import app.models.Weapon;
import app.repositories.ShopRepository;
import app.repositories.WeaponRepository;

@Service
public class TestService {

	private ShopRepository shopRepository;
	private WeaponRepository weaponRepository;
	
	@Autowired
	public TestService(ShopRepository shopRepository, WeaponRepository weaponRepository) {
		this.shopRepository = shopRepository;
		this.weaponRepository = weaponRepository;
		initialize();
	} 
	
	public void initialize() {
		Shop s1 = new Shop("Danger");
		shopRepository.save(s1);
		Weapon w1 = new Weapon("Rifle");
		w1.setShop(s1);
		weaponRepository.save(w1);
		
		
	}
}
