package com.ywf.ywf.entity;

import com.ywf.ywf.entity.worker.OrganizationType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

/**
 * Represents a company entity.
 */
@Entity
@Data
public class Company {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String description;
  private String address;
  private String city;
  private String country;
  private String email;
  private String phone;
  private String webSite;
  private String logo;
  @OneToOne
  private OrganizationType organizationType;
  private Boolean active;
}
