package my.spring.boot.demo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity @Data
public class City {
  @Id
  private Long id;

  private String city;
  private String cityAscii;
  private Long lat;
  private Long lng;
  private String country;
  private String iso2;
  private String iso3;
  private String adminName;
  private String capital;
  private Long population;
}
