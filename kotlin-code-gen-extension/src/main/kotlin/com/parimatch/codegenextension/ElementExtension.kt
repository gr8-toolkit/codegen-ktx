package com.parimatch.codegenextension

import javax.lang.model.element.AnnotationMirror
import javax.lang.model.element.Element
import kotlin.reflect.KClass

fun <T : Annotation> Element.getAnnotationMirror(type: KClass<T>): AnnotationMirror? {
    return this.getAnnotation(type.java.name)
}

fun Element.getAnnotation(annotationClass: String): AnnotationMirror? {
    for (annotationMirror in this.annotationMirrors) {
        if (annotationMirror.annotationType.asElement().toString() == annotationClass) {
            return annotationMirror
        }
    }
    return null
}
