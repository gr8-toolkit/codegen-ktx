package com.parimatch.codegenextension

import javax.lang.model.element.AnnotationMirror
import javax.lang.model.element.AnnotationValue
import kotlin.reflect.KProperty1

fun AnnotationMirror.getValueAsString(property: KProperty1<*, *>): String? {
    return this.getAnnotationValueAsString(property.name)
}

fun AnnotationMirror.getAnnotationValueAsString(key: String): String? {
    return this.getAnnotationValue(key)?.value?.toString()
}

fun AnnotationMirror.getAnnotationValue(key: String): AnnotationValue? {
    for ((element, value) in this.elementValues) {
        if (element!!.simpleName.toString() == key) {
            return value
        }
    }
    return null
}