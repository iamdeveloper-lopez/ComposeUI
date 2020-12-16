package com.composeui.composeui

import android.view.View

inline fun <T : View> T.style(block: T.() -> Unit): T {
    return this.apply(block)
}
