package org.ldv.sushiapi.model.id

import jakarta.persistence.Embeddable
import java.io.Serializable

@Embeddable
class AlimentBoxId(
    val AlimentId: Long,
    val BoxId: Long
): Serializable {
}