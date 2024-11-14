package org.ldv.sushiapi.model.entity

import jakarta.persistence.*

@Entity
@Table(name = "boxes")
class Box(
    @Id
    @Column(name = "box_id")
    var boxId: Long,
    var nom: String,
    var nbPieces: Int,
    var prix: Double,
    var nomImage: String,


    @ManyToMany
    @JoinTable(
        name = "saveurs_boxes",
        joinColumns = [JoinColumn(name = "fk_box_id")],
        inverseJoinColumns = [JoinColumn(name = "fk_saveur_id")]
    )
    var saveurs: MutableList<Saveur> = mutableListOf(),

    @OneToMany(mappedBy = "box")
    val alimentBox: List<AlimentBox> = mutableListOf()
) {

}