package com.finalproject.mvc.sobeit.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long comment_seq;
    @ManyToOne
    @JoinColumn(name = "user_seq", referencedColumnName = "user_seq")
    private Users user_seq;
    @ManyToOne
    @JoinColumn(name = "article_seq", referencedColumnName = "article_seq")
    private Article article_seq;
    @Column(nullable = false)
    private String comment_text;

    @Column(nullable = false)
    private Long parent_comment_seq;
    @Column(nullable = false)
    private LocalDateTime written_date;

    @PrePersist
    public void prePersist(){
        this.parent_comment_seq = this.parent_comment_seq == null ? 0L : this.parent_comment_seq;
    }

}
