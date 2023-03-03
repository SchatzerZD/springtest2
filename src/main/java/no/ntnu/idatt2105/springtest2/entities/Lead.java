package no.ntnu.idatt2105.springtest2.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Table(name = "lead_data")
@Entity
public class Lead {

  @Id
  @GeneratedValue
  private Long id;

  private int firstNumber;

  private int secondNumber;

  private String operation;

  private double equals;

}
