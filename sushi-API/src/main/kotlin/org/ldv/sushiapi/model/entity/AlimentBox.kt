package org.ldv.sushiapi.model.entity

import jakarta.persistence.EmbeddedId
import jakarta.persistence.Entity
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.MapsId
import  jakarta.persistence.Table
import org.ldv.sushiapi.model.id.AlimentBoxId

@Entity
@Table(name="aliments_boxes")
class AlimentBox(
    @EmbeddedId
    var alimentBoxId: AlimentBoxId? = null,

    @MapsId("alimentId")
    @ManyToOne
    @JoinColumn(name = "fk_aliment_id")
    var aliment: Aliment,

    @MapsId("boxId")
    @ManyToOne
    @JoinColumn(name = "fk_box_id")
    var box: Box,

    val quantite: Int? = null


) {
}