package com.broadcast.account.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
@EqualsAndHashCode
@NamedEntityGraph(name = "EducationPlaceWithAccountData", attributeNodes =
@NamedAttributeNode(value = "accountData", subgraph = "accountDataWithAccount"), subgraphs =
@NamedSubgraph(name = "accountDataWithAccount", attributeNodes = @NamedAttributeNode(value = "account")))
public class EducationPlace {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;

    private String address;

    private String type;

    @EqualsAndHashCode.Exclude
    @JoinTable(name = "education_places_account_data",
            joinColumns = @JoinColumn(name = "education_place_id"),
            inverseJoinColumns = @JoinColumn(name = "account_data_id"))
    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH})
    private Set<AccountData> accountData;

}
