package country.code.persistence.repository

import country.code.persistence.model.Language
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface LanguageRepository : JpaRepository<Language, Long> {
    fun existsByLanguage(languageName: String): Boolean
}
