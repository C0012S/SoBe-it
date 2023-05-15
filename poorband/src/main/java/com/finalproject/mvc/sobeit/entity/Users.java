package com.finalproject.mvc.sobeit.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Users {

    @Id
    @Column (name = "user_seq", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long user_seq;

    @Column (nullable = false)
    private String user_id;
    @Column (nullable = false)
    private String email;
    private String introduction;
    @Column (nullable = false)
    private String user_name;
    @Column (nullable = false)
    private String password;
    @Column (nullable = false)
    private String nickname;
    @Column(nullable = false)
    private String user_tier;
    @Column(nullable = false)
    private Long challenge_count;
    @Column(nullable = false, length = 20)
    private String phone_number;
    private String profile_image_url;

    @PrePersist
    public void prePersist(){
        this.user_tier = this.user_tier == null ? "BRONZE" : this.user_tier;
        this.challenge_count = this.challenge_count == null ? 0 : this.challenge_count;
    }
}
