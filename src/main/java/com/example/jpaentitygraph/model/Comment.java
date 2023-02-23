package com.example.jpaentitygraph.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@NamedEntityGraph(
        name = "comment-entity-graph",
        attributeNodes = {
                @NamedAttributeNode("reply"),
                @NamedAttributeNode("user"),
                @NamedAttributeNode("post"),
        }
)
@NamedEntityGraph(
        name = "comment-entity-graph-user",
        attributeNodes = {
                @NamedAttributeNode("user"),
        }
)
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String reply;

    @ManyToOne(fetch = FetchType.LAZY)  //cascade = CascadeType.ALL
    @JoinColumn
    private Post post;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private User user;
}