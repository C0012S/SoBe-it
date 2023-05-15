package com.finalproject.mvc.sobeit.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Challenge {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long challenge_seq;
    @Column(nullable = false, length = 40)
    private String challenge_name;
}
