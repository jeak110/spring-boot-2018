package my.spring.boot.demo;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController @AllArgsConstructor
public class CityRestController {
    private CityRepository cityRepository;

    @RequestMapping("citySearch")
    public List<City> getCityLikeName(@RequestParam(name = "city") String city) {
        return cityRepository.getCitiesByCityLike("%" +  city + "%");
    }
}
