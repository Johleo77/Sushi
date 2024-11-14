package org.ldv.sushiapi.controller

import org.springframework.boot.autoconfigure.web.ServerProperties
import org.springframework.core.io.Resource
import org.springframework.core.io.ResourceLoader
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(path = ["/api/images]"])
class ImageController(private val resourceLoader: ResourceLoader) {

    @GetMapping("/{imageName}")
    fun getImage(@PathVariable imageName: String):ResponseEntity<Resource>{
        val resource = resourceLoader.getResource("classpath:static/image/$imageName.png")
        return if (resource.exists()){
            ResponseEntity.ok()
                .contentType(MediaType.IMAGE_PNG)
                .body(resource)
        } else {
            ResponseEntity.notFound().build()
        }
    }
}