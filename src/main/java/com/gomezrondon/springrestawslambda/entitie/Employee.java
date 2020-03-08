package com.gomezrondon.springrestawslambda.entitie;


import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String  firstName;
    private String  lastName;
    private String primary_skills;
    private String location; // 3 char(3)

    public Employee(String  firstName, String  lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

}

/*@Getter
@Setter
@NoArgsConstructor
@ToString(exclude = {"location"})
@EqualsAndHashCode*/