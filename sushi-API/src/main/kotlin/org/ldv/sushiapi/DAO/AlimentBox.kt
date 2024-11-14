package org.ldv.sushiapi.dao

import org.ldv.sushiapi.model.entity.AlimentBox
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AlimentBox: JpaRepository<AlimentBox, Long> {
}