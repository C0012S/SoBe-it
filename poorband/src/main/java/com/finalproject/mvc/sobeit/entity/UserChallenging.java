package com.finalproject.mvc.sobeit.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class UserChallenging {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long user_challenging_seq;
    @ManyToOne
    @JoinColumn(name = "user_seq", referencedColumnName = "user_seq")
    private Users user_seq;
    @ManyToOne
    @JoinColumn(name = "challenge_seq", referencedColumnName = "challenge_seq")
    private Challenge challenge_seq;
    @Column(nullable = false, length = 4)
    private String is_success;
}
