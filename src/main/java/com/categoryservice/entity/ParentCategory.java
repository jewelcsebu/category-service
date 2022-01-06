package com.categoryservice.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Optional;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity(name = "parent_categories")

public class ParentCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "category_title")
    private String ParentCategoryTitle;

    private Long grandParentCategoryId;

//    @ManyToOne( optional = false)
//    @JoinColumn(name = "grant_category_id", nullable = false)
//    private GrandParentCategory grandParentCategory;


    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY)
    private List<Category> categories;



}
