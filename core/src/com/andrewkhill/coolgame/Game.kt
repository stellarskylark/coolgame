package com.andrewkhill.coolgame

import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch

class Game : ApplicationAdapter() {
    lateinit internal var batch: SpriteBatch
    lateinit internal var img: Texture
    lateinit internal var mapDisplayer: MapDisplayer
    lateinit internal var tileMap : TileMap

    override fun create() {
        batch = SpriteBatch()
        img = Texture("badlogic.jpg")
        // Temporary declaration
        tileMap = TileMap("gsdgsd\ndgsdgs\ngsdgsd\ndgsdgs\ngsdgsd\ndgsdgs".lines().toTypedArray())
        mapDisplayer = MapDisplayer(tileMap, EntityMap())
    }

    override fun render() {
        Gdx.gl.glClearColor(1f, 0f, 0f, 1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
        batch.begin()
        mapDisplayer.render(batch)
        batch.end()
    }

    override fun dispose() {
        batch.dispose()
        img.dispose()
    }
}
