package eu.laramartin.koinsample

import android.arch.lifecycle.ViewModel

class HelloViewModel(
    private val repo: HelloRepository
) : ViewModel() {

    fun sayHello() = "${repo.giveHello()} from $this"
}
