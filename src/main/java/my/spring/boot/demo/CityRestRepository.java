package my.spring.boot.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "city", collectionResourceRel = "city")
public interface CityRestRepository extends JpaRepository<City, Long> {
    List<City> getCitiesByCityLike(@Param("city") String city);
}