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
@NamedEntityGraph(name = "accountDataWithAccountAndEducationPlaces",
        attributeNodes = {@NamedAttributeNode(value = "educationPlaces"), @NamedAttributeNode(value = "account")})
public class AccountData {

    @Id
    private String id;

    private String firstName;

    private String secondName;

    private String dateOfBirth;

    private Short age;

    @EqualsAndHashCode.Exclude
    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH}, mappedBy = "accountData")
    private Set<EducationPlace> educationPlaces;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE, mappedBy = "accountData")
    private Account account;

}
