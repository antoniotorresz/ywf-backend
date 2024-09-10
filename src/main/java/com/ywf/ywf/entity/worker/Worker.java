package com.ywf.ywf.entity.worker;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.Set;
import lombok.Data;

/**
 * Represents a worker in the system.
 */
@Entity
@Data
public class Worker {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String lastName;
  private String email;
  private String phone;
  private String address;
  private String city;
  private String country;
  private String jobTitle;
  private String imageUrl;
  @OneToMany(fetch = FetchType.LAZY)
  private Set<Education> education;
  private Boolean active;
}
