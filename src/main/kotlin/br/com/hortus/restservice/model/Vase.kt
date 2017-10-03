package br.com.hortus.restservice.model

import org.springframework.data.jpa.repository.JpaRepository
import javax.persistence.*

@Entity
data class Vase (
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long?,
        @OneToMany(mappedBy = "vase")
        var vaseDatas: List<VaseData> = mutableListOf(),
        @ManyToOne
        var currentProfile: Profile?
)

interface VaseRepository: JpaRepository<Vase, Long>
