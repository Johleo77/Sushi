package org.ldv.sushiapi.model.entity

import jakarta.persistence.*

@Entity
@Table(name = "saveurs")
class Saveur(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var saveurId: Long? = null,
    var nom: String,

    @ManyToMany(mappedBy = "saveurs")
    var boxes: MutableList<Box> = mutableListOf()
) {

}