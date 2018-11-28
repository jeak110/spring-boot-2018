package my.spring.boot.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "city", collectionResourceRel = "city")
public interface CityRestRepository extends JpaRepository<City, Long> {
}