package com.composeui.composeui

import android.content.res.Resources
import android.util.TypedValue
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.annotation.ColorInt
import androidx.annotation.ColorRes
import androidx.annotation.StringRes
import androidx.appcompat.widget.AppCompatButton
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.core.content.ContextCompat
import kotlin.math.ceil

// Constants
val matchConstraint = ConstraintSet.MATCH_CONSTRAINT
val matchParent: Int = android.view.ViewGroup.LayoutParams.MATCH_PARENT
val wrapContent: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT

// Style - Colors

fun View.color(@ColorRes resId: Int): Int {
    return ContextCompat.getColor(context, resId)
}

var TextView.textColor: Int
    get() = 0
    set(v) = setTextColor(v)

var Button.textColor: Int
    get() = 0
    set(v) = setTextColor(v)

var View.padding: Int
    get() = 0
    inline set(value) = setPadding(value, value, value, value)

var View.backgroundColor: Int
    get() = 0
    set(v) = setBackgroundColor(v)

// Style - Pixel densities

var Int.dp: Int
    get() {
        val metrics = Resources.getSystem().displayMetrics
        val density = metrics.density
        val dp = this.toDouble() * density
        return ceil(dp).toInt()
    }
    set(_) {}


var Float.dp: Float
    get() {
        val metrics = Resources.getSystem().displayMetrics
        val density = metrics.density
        val dp = this.toDouble() * density
        return ceil(dp).toFloat()
    }
    set(_) {}

var Float.dpInt: Int
    get() {
        val metrics = Resources.getSystem().displayMetrics
        val density = metrics.density
        val dp = this.toDouble() * density
        return ceil(dp).toInt()
    }
    set(_) {}

fun <V : View> V.matchConstraintWrapContent(): V {
    layoutParams = ConstraintLayout.LayoutParams(
        ConstraintLayout.LayoutParams.MATCH_CONSTRAINT,
        ConstraintLayout.LayoutParams.WRAP_CONTENT
    )
    return this
}

fun <V : View> V.wrapContent(): V {
    layoutParams = ConstraintLayout.LayoutParams(
        ConstraintLayout.LayoutParams.WRAP_CONTENT,
        ConstraintLayout.LayoutParams.WRAP_CONTENT
    )
    return this
}

fun <V : View> V.matchContent(): V {
    layoutParams = ConstraintLayout.LayoutParams(
        ConstraintLayout.LayoutParams.MATCH_CONSTRAINT,
        ConstraintLayout.LayoutParams.MATCH_CONSTRAINT
    )
    return this
}

fun <V : View> V.matchParentWrapContent(): V {
    layoutParams = ConstraintLayout.LayoutParams(
        ConstraintLayout.LayoutParams.MATCH_PARENT,
        ConstraintLayout.LayoutParams.WRAP_CONTENT
    )
    return this
}

fun <V : AppCompatButton> V.wrapContent(padding: Int = 48): V {
    layoutParams = ConstraintLayout.LayoutParams(
        ConstraintLayout.LayoutParams.WRAP_CONTENT,
        ConstraintLayout.LayoutParams.WRAP_CONTENT
    )
    setPadding(padding.dp, 0, padding.dp, 0)
    return this
}

fun <V : TextView> V.textSize(size: Float): V {
    setTextSize(TypedValue.COMPLEX_UNIT_SP, size)
    return this
}

fun <V : TextView> V.text(value: CharSequence): V {
    text = value
    return this
}

fun <V : TextView> V.text(@StringRes resId: Int): V {
    text = resources.getString(resId)
    return this
}

fun <V : TextView> V.textColor(@ColorInt resId: Int): V {
    textColor = resId
    return this
}

fun <V : TextView> V.textAllCaps(allCaps: Boolean = true): V {
    isAllCaps = allCaps
    return this
}

fun <V : TextView> V.gravity(_gravity: Int): V {
    gravity = _gravity
    return this
}

// Events

//fun View.onClick(context: CoroutineContext = Dispatchers.Main,
//                 handler: suspend CoroutineScope.(v: android.view.View?) -> Unit) {
//    setOnClickListener { v ->
//        GlobalScope.launch(context, CoroutineStart.DEFAULT) {
//            handler(v)
//        }
//    }
//}

// Layout - Helpers

fun ConstraintLayout.addConstraints(block: ConstraintSet.() -> Unit) {
    val cs = ConstraintSet()
    cs.clone(this)
    block(cs)
    cs.applyTo(this)
}
