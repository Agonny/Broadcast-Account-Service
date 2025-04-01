package com.broadcast.account.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@EqualsAndHashCode
@Table(name = "accounts")
@NamedEntityGraph(name = "accountWithEducationPeriods",
        attributeNodes = @NamedAttributeNode(value = "educationPeriods", subgraph = "periodWithEducationPlace"),
        subgraphs = @NamedSubgraph(name = "periodWithEducationPlace", attributeNodes = @NamedAttributeNode(value = "educationPlace")))
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String email;

    private String firstName;

    private String secondName;

    private String dateOfBirth;

    private Short age;

    private String photoId;

    @EqualsAndHashCode.Exclude
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "account")
    private Set<EducationPeriod> educationPeriods = new LinkedHashSet<>();

    private Boolean isOnline;

    private LocalDateTime lastOnlineAt;

}
