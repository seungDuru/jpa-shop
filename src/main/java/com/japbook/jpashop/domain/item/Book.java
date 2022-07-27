package com.japbook.jpashop.domain.item;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@DiscriminatorValue("B")
@Entity
public class Book extends Item {
    private String author;
    private String isbn;
}
