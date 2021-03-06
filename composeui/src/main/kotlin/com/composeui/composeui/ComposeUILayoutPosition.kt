package com.composeui.composeui

import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout

// Layout - Position

fun <T : View> T.top(margin: Int): T {
    return position(ConstraintLayout.LayoutParams.TOP, margin)
}

fun <T : View> T.left(margin: Int): T {
    return position(ConstraintLayout.LayoutParams.LEFT, margin)
}

fun <T : View> T.right(margin: Int): T {
    return position(ConstraintLayout.LayoutParams.RIGHT, margin)
}

fun <T : View> T.start(margin: Int): T {
    return position(ConstraintLayout.LayoutParams.START, margin)
}

fun <T : View> T.end(margin: Int): T {
    return position(ConstraintLayout.LayoutParams.END, margin)
}

fun <T : View> T.bottom(margin: Int): T {
    return position(ConstraintLayout.LayoutParams.BOTTOM, margin)
}

fun <T : View> T.position(position: Int, margin: Int): T {
    (parent as? ConstraintLayout)?.let { constraintLayout ->
        constraintLayout.addConstraints {
            connect(id, position, ConstraintLayout.LayoutParams.PARENT_ID, position, margin.dp)
        }
    }
    return this
}
