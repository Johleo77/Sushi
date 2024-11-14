package org.ldv.sushiapi.DTO

import org.ldv.sushiapi.dao.AlimentBox

class BoxDtoApi (
    val id : Long?,
    val pieces : Int,
    val nom : String,
    val image : String,
    val prix : Double,
    val saveurs : Set<String>,
    val aliments : List<AlimentBoxDtoApi>
){
}