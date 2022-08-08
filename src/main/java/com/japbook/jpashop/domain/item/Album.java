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
@DiscriminatorValue("A")
@Entity
public class Album extends Item{
    private String artist;
    private String etc;
}
