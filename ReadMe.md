# Codegen ktx

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
