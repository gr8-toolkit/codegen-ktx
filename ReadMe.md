# Codegen ktx

[![](https://jitpack.io/v/parimatchtech/codegen-ktx.svg)](https://jitpack.io/#parimatchtech/codegen-ktx)

This is a library with a small, extensible API which provides utility on code generation classes.

We copy this class into all the little internal libraries we make. We are tired of doing it. Now it's a library.

## Integration
Add it in your root build.gradle at the end of repositories:
```groovy
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```
Add the dependency
```groovy
implementation 'com.github.parimatchtech:codegen-ktx:0.1'
```

## Docs
#### Element
- get annotation mirrors by KClass `Element.getAnnotationMirror(Nullable::class)`
- get annotation mirrors by Name `Element.getAnnotationMirror(Nullable::class)`
- `Element.asTypeElement`
- `Element.asDeclaredType()`

## AnnotationMirror
- get AnnotationValue by property name `AnnotationMirror.getAnnotationValue(<Name>)`
- get annotation value by property `AnnotationMirror.getAnnotationValueAsString(Annotation::property)` 
- get annotation value by name `AnnotationMirror.getAnnotationValueAsString(<Name>)`

## ProcessingEnvironment
- `ProcessingEnvironment.isHasOption(<key>)`
- `ProcessingEnvironment.getRequireOption(<key>)`
- `ProcessingEnvironment.getOptionsOrDefault(<key>, <default>)`
- `ProcessingEnvironment.checkRequireOptions(String... keys)`
