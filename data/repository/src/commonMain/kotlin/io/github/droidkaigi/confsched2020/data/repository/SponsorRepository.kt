package io.github.droidkaigi.confsched2020.data.repository

import io.github.droidkaigi.confsched2020.model.SponsorCategory
import kotlinx.coroutines.flow.Flow

interface SponsorRepository {
    suspend fun sponsors(): Flow<List<SponsorCategory>>
    suspend fun refresh()
}
