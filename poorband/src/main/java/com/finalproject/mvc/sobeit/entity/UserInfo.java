package com.finalproject.mvc.sobeit.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long user_info_seq;
    @ManyToOne
    @JoinColumn(name = "user_seq", referencedColumnName = "user_seq")
    private Users user_seq;
    private Long followingCount;
    private Long followerCount;
}
