package org.ldv.sushiapi.service

import org.ldv.sushiapi.DTO.AlimentBoxDtoApi
import org.ldv.sushiapi.DTO.BoxDtoApi
import org.ldv.sushiapi.model.entity.AlimentBox
import org.ldv.sushiapi.model.entity.Box

fun boxtoBoxDtoApi(box: Box) : BoxDtoApi{
    return BoxDtoApi(
        box.boxId,
        box.nbPieces,
        box.nom,
        box.nomImage,
        box.prix,
        HashSet(box.saveurs.stream().map{it.nom}.toList()),
        box.alimentBox.stream().map { AlimentBoxDtoApi(it.aliment.nom, it.quantite!!.toFloat()) }.toList()
    )
}