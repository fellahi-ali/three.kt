@file:JsQualifier("THREE")

package org.three.geometries

import org.three.core.BufferGeometry
import org.three.core.Geometry

open external class BoxGeometry(
        width: Float,
        height: Float,
        depth: Float,
        widthSegments: Int = definedExternally,
        heightSegments:Int = definedExternally,
        depthSegments:Int = definedExternally
) : Geometry

open external class BoxBufferGeometry(
        width: Float,
        height: Float,
        depth: Float,
        widthSegments: Int = definedExternally,
        heightSegments:Int = definedExternally,
        depthSegments:Int = definedExternally
) : BufferGeometry
