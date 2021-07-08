package com.ambika.game.twozerofoureight.play
import com.ambika.game.twozerofoureight.play.GameEngine
import com.ambika.game.twozerofoureight.play.GameEngineProtocol
import java.util.*


class TwoZeroFourEight(delegated: GameEngineProtocol) : GameEngine(delegate = delegated) {

    lateinit var startedPlaying : Date
        private set
    lateinit var startLastGame : Date
        private set

    init {
        this.startedPlaying = Date()
        this.startLastGame = this.startedPlaying
    }

    override fun newGame(newHighScore: Int) {
        super.newGame(newHighScore)
        this.startLastGame = Date()
    }

    fun getTotalTimePlaying() = (Date().time - startedPlaying.time)
    fun getTimePlayingCurrent() = (Date().time - startLastGame.time)
}