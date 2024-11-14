package org.ldv.sushiapi.dao

import org.ldv.sushiapi.model.entity.Saveur
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface Saveur: JpaRepository<Saveur, Long> {
}