package org.ldv.sushiapi.controller



import org.ldv.sushiapi.DTO.BoxDtoApi
import org.ldv.sushiapi.dao.BoxDAO
import org.ldv.sushiapi.service.boxtoBoxDtoApi
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/boxes")
@CrossOrigin
class BoxController(val boxDAO: BoxDAO) {
    @GetMapping
    @CrossOrigin(origins = ["*"])
    fun getAllBoxes(): ResponseEntity<List<BoxDtoApi>>{
        return ResponseEntity.ok(boxDAO.findAll().map { boxtoBoxDtoApi(it) })
    }
}