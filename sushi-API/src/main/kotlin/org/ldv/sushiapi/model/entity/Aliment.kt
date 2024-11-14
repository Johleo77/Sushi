package org.ldv.sushiapi.model.entity

import jakarta.persistence.*

@Entity
@Table(name = "aliments")
class Aliment(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var alimentId: Long? = null,
    var nom: String,

    @OneToMany(mappedBy = "aliment")
    val alimentBoxes: List<AlimentBox> = mutableListOf()
) {
}
