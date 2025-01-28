# GroovyCastException Bug

This repository demonstrates a common error in Groovy stemming from its dynamic typing: the `GroovyCastException`.  The `bug.groovy` file contains a method that expects a String, but when an unexpected type (in this case, a List) is passed, a `GroovyCastException` is thrown.

The solution, found in `bugSolution.groovy`, shows how to robustly handle such situations using type checking or more explicit type declarations.