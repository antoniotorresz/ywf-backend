package com.ywf.ywf.entity.worker;

import com.ywf.ywf.entity.company.Company;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import java.time.LocalDate;
import lombok.Data;

/**
 * Represents an education record for a worker.
 */
@Entity
@Data
public class Education {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String degree;
  private String schoolName;
  @OneToOne(fetch = FetchType.LAZY)
  private Company college;
  private LocalDate startDate;
  private LocalDate endDate;
}
