package com.example.connect.UseCases

import com.example.connect.MarsSpace
import com.example.connect.Repositories.MarsNetworkRepository
import javax.inject.Inject

class MarsUseCases @Inject constructor(private val gameRepository: MarsNetworkRepository) {

    suspend operator fun invoke(): List<MarsSpace> {

        return gameRepository.getGames().shuffled()

    }
}
/*class GetGamesUseCase @Inject constructor(private val gameRepository: GameRepository) {

    suspend operator fun invoke(): List<GameItem> {

        return gameRepository.getGames().shuffled()

    }

}*/