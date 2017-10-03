package br.com.hortus.restservice.model

import org.springframework.data.jpa.repository.JpaRepository
import javax.persistence.*

@Entity
data class VaseData (
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long?,
        var humidity: Double = 0.0,
        var temperature: Double = 0.0,
        var luminosity: Double = 0.0,
        @ManyToOne
        var vase: Vase?
)

interface VaseDataRepository: JpaRepository<VaseData, Long>
