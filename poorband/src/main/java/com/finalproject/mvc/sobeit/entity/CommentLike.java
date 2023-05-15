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
public class CommentLike {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long comment_like_seq;
    @ManyToOne
    @JoinColumn(name = "comment_seq", referencedColumnName = "comment_seq")
    private Comment comment_seq;
    @ManyToOne
    @JoinColumn(name = "user_seq", referencedColumnName = "user_seq")
    private Users user_seq;

}
