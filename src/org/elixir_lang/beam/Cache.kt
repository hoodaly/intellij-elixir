package org.elixir_lang.beam

import org.elixir_lang.beam.chunk.Atoms
import org.elixir_lang.beam.chunk.CallDefinitions
import org.elixir_lang.beam.chunk.Chunk
import org.elixir_lang.beam.chunk.Imports

class Cache(private val beam: Beam) {
    val atoms: Atoms? by lazy { beam.atoms() }
    val exports: CallDefinitions? by lazy { beam.exports(atoms) }
    val locals: CallDefinitions? by lazy { beam.locals(atoms) }
    val imports: Imports? by lazy { beam.imports(atoms) }

    fun chunkCollection(): Collection<Chunk> = beam.chunkCollection()
}
