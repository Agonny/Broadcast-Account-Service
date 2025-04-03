package com.broadcast.account.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@EqualsAndHashCode
@Table(name = "education_periods")
@NamedEntityGraph(name = "periodWithEducationPlace", attributeNodes = @NamedAttributeNode(value = "educationPlace"))
public class EducationPeriod {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private LocalDate dateFrom;

    private LocalDate dateTo;

    @JoinTable(name = "account_id")
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Account account;

    @JoinTable(name = "education_place_id")
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private EducationPlace educationPlace;

}
