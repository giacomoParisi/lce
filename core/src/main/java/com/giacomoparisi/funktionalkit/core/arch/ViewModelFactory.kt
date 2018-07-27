package com.giacomoparisi.funktionalkit.core.arch

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import javax.inject.Provider

/**
 * Created by Giacomo Parisi on 16/07/18.
 * https://github.com/giacomoParisi
 */
class ViewModelFactory(val testProvider: (() -> ViewModel)? = null) {

    inline fun <reified VM : ViewModel> factory(
            provider: Provider<VM>, crossinline init: (VM) -> Unit
    ): ViewModelProvider.Factory {
        return object : ViewModelProvider.Factory {
            override fun <T1 : ViewModel> create(aClass: Class<T1>): T1 {
                val viewModel = testProvider?.invoke() as VM? ?: provider.get()
                return viewModel.also(init) as T1
            }
        }
    }

    inline operator fun <reified VM : ViewModel> invoke(
            fragment: Fragment, provider: Provider<VM>, crossinline init: (VM) -> Unit = {}
    ): VM {
        return ViewModelProviders.of(fragment, factory(provider, init)).get(VM::class.java)
    }

    inline operator fun <reified VM : ViewModel> invoke(
            activity: FragmentActivity, provider: Provider<VM>, crossinline init: (VM) -> Unit = {}
    ): VM {
        return ViewModelProviders.of(activity, factory(provider, init)).get(VM::class.java)
    }
}