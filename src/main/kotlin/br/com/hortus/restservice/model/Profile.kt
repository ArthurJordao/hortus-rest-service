package br.com.hortus.restservice.model

import org.hibernate.validator.constraints.NotBlank
import org.springframework.data.jpa.repository.JpaRepository
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Profile (
        @Id
        @GeneratedValue
        var id: Long? = null,
        @get:NotBlank
        var name: String = "",
        var imagePath: String = "",
        var description: String = "",
        var minHumidity: Double = 0.0,
        var maxHumidity: Double = 0.0,
        var minTemperature: Double = 0.0,
        var maxTemperature: Double = 0.0,
        var minLuminosity: Double = 0.0
)

interface ProfileRepository: JpaRepository<Profile, Long>
