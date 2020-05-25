package com.parimatch.codegenextension

import javax.lang.model.element.AnnotationMirror
import javax.lang.model.element.Element
import javax.lang.model.element.TypeElement
import javax.lang.model.type.DeclaredType
import kotlin.reflect.KClass

fun <T : Annotation> Element.getAnnotationMirror(type: KClass<T>): AnnotationMirror? {
    return this.getAnnotationMirror(type.java.name)
}

fun Element.getAnnotationMirror(annotationClass: String): AnnotationMirror? {
    for (annotationMirror in this.annotationMirrors) {
        if (annotationMirror.annotationType.asElement().toString() == annotationClass) {
            return annotationMirror
        }
    }
    return null
}

fun Element.asTypeElement() = this as TypeElement
fun Element.asDeclaredType() = this.asType() as DeclaredType


