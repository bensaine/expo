package expo.modules.image.svg

import android.content.res.ColorStateList
import android.content.res.Resources
import android.graphics.BlendMode
import android.graphics.Canvas
import android.graphics.ColorFilter
import android.graphics.Insets
import android.graphics.Outline
import android.graphics.PorterDuff
import android.graphics.Rect
import android.graphics.Region
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.os.Build
import android.util.AttributeSet
import androidx.annotation.RequiresApi
import org.xmlpull.v1.XmlPullParser

class SVGBitmapDrawableDelegate(val drawable: Drawable, val svgIntrinsicWidth: Int, val svgIntrinsicHeight: Int) : BitmapDrawable() {
  override fun setColorFilter(color: Int, mode: PorterDuff.Mode) {
    drawable.setColorFilter(color, mode)
  }

  override fun setBounds(left: Int, top: Int, right: Int, bottom: Int) {
    drawable.setBounds(left, top, right, bottom)
  }

  override fun setBounds(bounds: Rect) {
    drawable.bounds = bounds
  }

  override fun getDirtyBounds(): Rect {
    return drawable.dirtyBounds
  }

  override fun setChangingConfigurations(configs: Int) {
    drawable.changingConfigurations = configs
  }

  override fun getChangingConfigurations(): Int {
    return drawable.changingConfigurations
  }

  override fun setDither(dither: Boolean) {
    drawable.setDither(dither)
  }

  override fun setFilterBitmap(filter: Boolean) {
    drawable.isFilterBitmap = filter
  }

  override fun isFilterBitmap(): Boolean {
    return drawable.isFilterBitmap
  }

  override fun getCallback(): Callback? {
    return drawable.callback
  }

  override fun invalidateSelf() {
    drawable.invalidateSelf()
  }

  override fun scheduleSelf(what: Runnable, `when`: Long) {
    drawable.scheduleSelf(what, `when`)
  }

  override fun unscheduleSelf(what: Runnable) {
    drawable.unscheduleSelf(what)
  }

  override fun getLayoutDirection(): Int {
    return drawable.layoutDirection
  }

  override fun onLayoutDirectionChanged(layoutDirection: Int): Boolean {
    return drawable.onLayoutDirectionChanged(layoutDirection)
  }

  override fun getAlpha(): Int {
    return drawable.alpha
  }

  override fun setTint(tintColor: Int) {
    drawable.setTint(tintColor)
  }

  override fun setTintList(tint: ColorStateList?) {
    drawable.setTintList(tint)
  }

  override fun setTintMode(tintMode: PorterDuff.Mode?) {
    drawable.setTintMode(tintMode)
  }

  @RequiresApi(Build.VERSION_CODES.Q)
  override fun setTintBlendMode(blendMode: BlendMode?) {
    drawable.setTintBlendMode(blendMode)
  }

  override fun getColorFilter(): ColorFilter? {
    return drawable.colorFilter
  }

  override fun clearColorFilter() {
    drawable.clearColorFilter()
  }

  override fun setHotspot(x: Float, y: Float) {
    drawable.setHotspot(x, y)
  }

  override fun setHotspotBounds(left: Int, top: Int, right: Int, bottom: Int) {
    drawable.setHotspotBounds(left, top, right, bottom)
  }

  override fun getHotspotBounds(outRect: Rect) {
    drawable.getHotspotBounds(outRect)
  }

  @RequiresApi(Build.VERSION_CODES.Q)
  override fun isProjected(): Boolean {
    return drawable.isProjected
  }

  override fun isStateful(): Boolean {
    return drawable.isStateful
  }

  @RequiresApi(Build.VERSION_CODES.S)
  override fun hasFocusStateSpecified(): Boolean {
    return drawable.hasFocusStateSpecified()
  }

  override fun setState(stateSet: IntArray): Boolean {
    return drawable.setState(stateSet)
  }

  override fun getState(): IntArray {
    return drawable.state
  }

  override fun jumpToCurrentState() {
    drawable.jumpToCurrentState()
  }

  override fun getCurrent(): Drawable {
    return drawable.current
  }

  override fun setVisible(visible: Boolean, restart: Boolean): Boolean {
    return drawable.setVisible(visible, restart)
  }

  override fun setAutoMirrored(mirrored: Boolean) {
    drawable.isAutoMirrored = mirrored
  }

  override fun applyTheme(t: Resources.Theme) {
    drawable.applyTheme(t)
  }

  override fun canApplyTheme(): Boolean {
    return drawable.canApplyTheme()
  }

  override fun getTransparentRegion(): Region? {
    return drawable.transparentRegion
  }

  override fun getMinimumWidth(): Int {
    return drawable.minimumWidth
  }

  override fun getMinimumHeight(): Int {
    return drawable.minimumHeight
  }

  override fun getPadding(padding: Rect): Boolean {
    return drawable.getPadding(padding)
  }

  @RequiresApi(Build.VERSION_CODES.Q)
  override fun getOpticalInsets(): Insets {
    return drawable.opticalInsets
  }

  override fun getOutline(outline: Outline) {
    drawable.getOutline(outline)
  }

  override fun mutate(): Drawable {
    return drawable.mutate()
  }

  override fun inflate(r: Resources, parser: XmlPullParser, attrs: AttributeSet) {
    drawable.inflate(r, parser, attrs)
  }

  override fun inflate(r: Resources, parser: XmlPullParser, attrs: AttributeSet, theme: Resources.Theme?) {
    drawable.inflate(r, parser, attrs, theme)
  }

  override fun getIntrinsicWidth(): Int {
    return drawable.intrinsicWidth
  }
  override fun getIntrinsicHeight(): Int {
    return drawable.intrinsicHeight
  }
  override fun draw(canvas: Canvas) {
    return drawable.draw(canvas)
  }

  override fun setAlpha(alpha: Int) {
    drawable.alpha = alpha
  }

  override fun setColorFilter(colorFilter: ColorFilter?) {
    drawable.colorFilter = colorFilter
  }

  override fun getOpacity(): Int {
    return drawable.opacity
  }
}