package br.com.hortus.restservice.model

import org.springframework.data.jpa.repository.JpaRepository
import javax.persistence.*

@Entity
class Vase (
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long? = null,
        @OneToMany(mappedBy = "vase")
        var vaseDatas: List<VaseData> = mutableListOf(),
        @ManyToOne
        var currentPlantProfile: PlantProfile? = null
)

interface VaseRepository: JpaRepository<Vase, Long>
