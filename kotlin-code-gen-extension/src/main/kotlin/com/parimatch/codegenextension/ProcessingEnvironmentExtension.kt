package com.parimatch.codegenextension

import javax.annotation.processing.ProcessingEnvironment
import javax.tools.Diagnostic

fun ProcessingEnvironment.isHasOption(key: String): Boolean {
    return this.options[key] != null
}

/**
 * Call [isHasOption] first
 */
fun ProcessingEnvironment.getRequireOption(key: String): String {
    return requireNotNull(this.options[key])
}

fun ProcessingEnvironment.getOptionsOrDefault(key: String, default: String): String {
    return this.options[key] ?: default
}

fun ProcessingEnvironment.checkRequireOptions(vararg keys: String): Boolean {
    keys.forEach { key ->
        if (!this.isHasOption(key)) {
            messager.printMessage(Diagnostic.Kind.ERROR, "Parameter $key require.")
            return false
        }
    }

    return true
}