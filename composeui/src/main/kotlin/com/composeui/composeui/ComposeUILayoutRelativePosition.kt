package com.composeui.composeui

import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.constraintlayout.widget.Guideline

// Layout - Relative Position


// Top

fun <T : View> T.constraintTopToBottomOf(view: View, margin: Int = 0): T {
    return constraintTopToBottomOf(view.id, margin)
}

fun <T : View> T.constraintTopToBottomOf(viewId: Int, margin: Int = 0): T {
    (parent as? ConstraintLayout)?.addConstraints {
        connect(
            id,
            ConstraintLayout.LayoutParams.TOP,
            viewId,
            ConstraintLayout.LayoutParams.BOTTOM,
            margin.dp
        )
    }
    return this
}

fun <T : View> T.constraintTopToTopOf(view: View, margin: Int = 0): T {
    return constraintTopToTopOf(view.id, margin)
}

fun <T : View> T.constraintTopToTopOf(viewId: Int, margin: Int = 0): T {
    (parent as? ConstraintLayout)?.addConstraints {
        connect(
            id,
            ConstraintLayout.LayoutParams.TOP,
            viewId,
            ConstraintLayout.LayoutParams.TOP,
            margin.dp
        )
    }
    return this
}


// Left

fun <T : View> T.constraintLeftToRightOf(view: View, margin: Int = 0): T {
    return constraintLeftToRightOf(view.id, margin)
}

fun <T : View> T.constraintLeftToRightOf(viewId: Int, margin: Int = 0): T {
    (parent as? ConstraintLayout)?.addConstraints {
        connect(
            id,
            ConstraintLayout.LayoutParams.LEFT,
            viewId,
            ConstraintLayout.LayoutParams.RIGHT,
            margin.dp
        )
    }

    return this
}

fun <T : View> T.constraintLeftToLeftOf(view: View, margin: Int = 0): T {
    return constraintLeftToLeftOf(view.id, margin)
}

fun <T : View> T.constraintLeftToLeftOf(viewId: Int, margin: Int = 0): T {
    (parent as? ConstraintLayout)?.addConstraints {
        connect(
            id,
            ConstraintLayout.LayoutParams.LEFT,
            viewId,
            ConstraintLayout.LayoutParams.LEFT,
            margin.dp
        )
    }

    return this
}

fun <T : View> T.constraintStartToEndOf(view: View, margin: Int = 0): T {
    return constraintStartToEndOf(view.id, margin)
}

fun <T : View> T.constraintStartToEndOf(viewId: Int, margin: Int = 0): T {
    (parent as? ConstraintLayout)?.addConstraints {
        connect(
            id,
            ConstraintLayout.LayoutParams.START,
            viewId,
            ConstraintLayout.LayoutParams.END,
            margin.dp
        )
    }

    return this
}

fun <T : View> T.constraintStartToStartOf(view: View, margin: Int = 0): T {
    return constraintStartToStartOf(view.id, margin)
}

fun <T : View> T.constraintStartToStartOf(viewId: Int, margin: Int = 0): T {
    (parent as? ConstraintLayout)?.addConstraints {
        connect(
            id,
            ConstraintLayout.LayoutParams.START,
            viewId,
            ConstraintLayout.LayoutParams.START,
            margin.dp
        )
    }

    return this
}

// Right

fun <T : View> T.constraintRightToLeftOf(view: View, margin: Int = 0): T {
    return constraintRightToLeftOf(view.id, margin)
}

fun <T : View> T.constraintRightToLeftOf(viewId: Int, margin: Int = 0): T {
    (parent as? ConstraintLayout)?.addConstraints {
        connect(
            id,
            ConstraintLayout.LayoutParams.RIGHT,
            viewId,
            ConstraintLayout.LayoutParams.LEFT,
            margin.dp
        )
    }

    return this
}

fun <T : View> T.constraintRightToRightOf(view: View, margin: Int = 0): T {
    return constraintRightToRightOf(view.id, margin)
}

fun <T : View> T.constraintRightToRightOf(viewId: Int, margin: Int = 0): T {
    (parent as? ConstraintLayout)?.addConstraints {
        connect(
            id,
            ConstraintLayout.LayoutParams.RIGHT,
            viewId,
            ConstraintLayout.LayoutParams.RIGHT,
            margin.dp
        )
    }

    return this
}

fun <T : View> T.constraintEndToStartOf(view: View, margin: Int = 0): T {
    return constraintEndToStartOf(view.id, margin)
}

fun <T : View> T.constraintEndToStartOf(viewId: Int, margin: Int = 0): T {
    (parent as? ConstraintLayout)?.addConstraints {
        connect(
            id,
            ConstraintLayout.LayoutParams.END,
            viewId,
            ConstraintLayout.LayoutParams.START,
            margin.dp
        )
    }

    return this
}

fun <T : View> T.constraintEndToEndOf(view: View, margin: Int = 0): T {
    return constraintEndToEndOf(view.id, margin)
}

fun <T : View> T.constraintEndToEndOf(viewId: Int, margin: Int = 0): T {
    (parent as? ConstraintLayout)?.addConstraints {
        connect(
            id,
            ConstraintLayout.LayoutParams.END,
            viewId,
            ConstraintLayout.LayoutParams.END,
            margin.dp
        )
    }

    return this
}

// Bottom

fun <T : View> T.constraintBottomToTopOf(view: View, margin: Int = 0): T {
    return constraintBottomToTopOf(view.id, margin)
}

fun <T : View> T.constraintBottomToTopOf(viewId: Int, margin: Int = 0): T {
    (parent as? ConstraintLayout)?.addConstraints {
        connect(
            id,
            ConstraintLayout.LayoutParams.BOTTOM,
            viewId,
            ConstraintLayout.LayoutParams.TOP,
            margin.dp
        )
    }
    return this
}

fun <T : View> T.constraintBottomToBottomOf(view: View, margin: Int = 0): T {
    return constraintBottomToBottomOf(view.id, margin)
}

fun <T : View> T.constraintBottomToBottomOf(viewId: Int, margin: Int = 0): T {
    (parent as? ConstraintLayout)?.addConstraints {
        connect(
            id,
            ConstraintLayout.LayoutParams.BOTTOM,
            viewId,
            ConstraintLayout.LayoutParams.BOTTOM,
            margin.dp
        )
    }
    return this
}

//Gone Margin

fun <T : View> T.goneMarginStart(margin: Int = 0): T {
    (parent as? ConstraintLayout)?.addConstraints {
        setGoneMargin(id, ConstraintSet.START, margin)
    }
    return this
}

fun <T : View> T.goneMarginLeft(margin: Int = 0): T {
    (parent as? ConstraintLayout)?.addConstraints {
        setGoneMargin(id, ConstraintSet.LEFT, margin)
    }
    return this
}

fun <T : View> T.goneMarginTop(margin: Int = 0): T {
    (parent as? ConstraintLayout)?.addConstraints {
        setGoneMargin(id, ConstraintSet.TOP, margin)
    }
    return this
}

fun <T : View> T.goneMarginBottom(margin: Int = 0): T {
    (parent as? ConstraintLayout)?.addConstraints {
        setGoneMargin(id, ConstraintSet.BOTTOM, margin)
    }
    return this
}

fun <T : View> T.goneMarginEnd(margin: Int = 0): T {
    (parent as? ConstraintLayout)?.addConstraints {
        setGoneMargin(id, ConstraintSet.END, margin)
    }
    return this
}

fun <T : View> T.goneMarginRight(margin: Int = 0): T {
    (parent as? ConstraintLayout)?.addConstraints {
        setGoneMargin(id, ConstraintSet.RIGHT, margin)
    }
    return this
}


// Center Y

// This is made possible by creating a "GONE" guideline and center on the guideline instead :)
// TODO: use android guideline instead?
fun <T : View> T.constraintCenterYToBottomOf(view: View): T {
    (parent as? ConstraintLayout)?.let { constraintLayout ->
        constraintLayout.addConstraints {
            // TODO: use android guideline instead?
            val guideline = View(context)
            guideline.id = View.generateViewId()
            constraintLayout.addView(guideline)
            guideline.visibility = View.GONE
            guideline.constraintBottomToBottomOf(view)
            centerVertically(id, guideline.id)
        }
    }
    return this
}

fun <T : View> T.constraintCenterYToTopOf(view: View): T {
    (parent as? ConstraintLayout)?.let { constraintLayout ->
        constraintLayout.addConstraints {
            val guideline = View(context)
            guideline.id = View.generateViewId()
            constraintLayout.addView(guideline)
            guideline.visibility = View.GONE
            guideline.constraintTopToTopOf(view)
            centerVertically(id, guideline.id)
        }
    }
    return this
}

fun <T : View> T.constraintCenterYToCenterYOf(view: View): T {
    (parent as? ConstraintLayout)?.addConstraints {
        centerVertically(id, view.id)
    }
    return this
}


// Center X

fun <T : View> T.constraintCenterXToLeftOf(view: View): T {
    (parent as? ConstraintLayout)?.let { constraintLayout ->
        constraintLayout.addConstraints {
            val guideline = View(context)
            guideline.id = View.generateViewId()
            constraintLayout.addView(guideline)
            guideline.visibility = View.GONE
            guideline.constraintLeftToLeftOf(view)
            centerHorizontally(id, guideline.id)
        }
    }
    return this
}

fun <T : View> T.constraintCenterXToStartOf(view: View): T {
    (parent as? ConstraintLayout)?.let { constraintLayout ->
        constraintLayout.addConstraints {
            val guideline = View(context)
            guideline.id = View.generateViewId()
            constraintLayout.addView(guideline)
            guideline.visibility = View.GONE
            guideline.constraintStartToStartOf(view)
            centerHorizontally(id, guideline.id)
        }
    }
    return this
}

fun <T : View> T.constraintCenterXToRightOf(view: View): T {
    (parent as? ConstraintLayout)?.let { constraintLayout ->
        constraintLayout.addConstraints {
            val guideline = View(context)
            guideline.id = View.generateViewId()
            constraintLayout.addView(guideline)
            guideline.visibility = View.GONE
            guideline.constraintRightToRightOf(view)
            centerHorizontally(id, guideline.id)
        }
    }
    return this
}

fun <T : View> T.constraintCenterXToEndOf(view: View): T {
    (parent as? ConstraintLayout)?.let { constraintLayout ->
        constraintLayout.addConstraints {
            val guideline = View(context)
            guideline.id = View.generateViewId()
            constraintLayout.addView(guideline)
            guideline.visibility = View.GONE
            guideline.constraintEndToEndOf(view)
            centerHorizontally(id, guideline.id)
        }
    }
    return this
}


fun <T : View> T.constraintCenterXToCenterXOf(view: View): T {
    (parent as? ConstraintLayout)?.addConstraints {
        centerHorizontally(id, view.id)
    }
    return this
}


// Follow Edges

fun <T : View> T.followEdgesOf(view: View, margin: Int = 0): T {
    constraintTopToTopOf(view, margin)
    constraintBottomToBottomOf(view, margin)
    constraintLeftToLeftOf(view, margin)
    constraintRightToRightOf(view, margin)
    return this
}

fun <T : View> T.dimensionRatio(ratio: String): T {
    (parent as? ConstraintLayout)?.addConstraints {
        setDimensionRatio(id, ratio)
    }
    return this
}

// Guideline

fun <T : Guideline> T.orientation(orientation: Int): T {
    (parent as? ConstraintLayout)?.addConstraints {
        create(id, orientation)
    }
    return this
}

fun <T : Guideline> T.percent(ratio: Float): T {
    (parent as? ConstraintLayout)?.addConstraints {
        setGuidelinePercent(id, ratio)
    }
    return this
}


fun <T : Guideline> T.end(margin: Int): T {
    (parent as? ConstraintLayout)?.addConstraints {
        setGuidelineEnd(id, margin)
    }
    return this
}

fun <T : Guideline> T.begin(margin: Int): T {
    (parent as? ConstraintLayout)?.addConstraints {
        setGuidelineBegin(id, margin)
    }
    return this
}
