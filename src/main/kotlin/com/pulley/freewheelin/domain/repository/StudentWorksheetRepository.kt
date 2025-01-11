package com.pulley.freewheelin.domain.repository

import com.pulley.freewheelin.domain.entity.StudentWorksheetEntity
import org.springframework.data.jpa.repository.JpaRepository

interface StudentWorksheetRepository : JpaRepository<StudentWorksheetEntity, Long>