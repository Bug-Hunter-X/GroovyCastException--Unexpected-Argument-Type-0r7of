```groovy
def myMethod(String str) {
  if (str == null) {
    return "Null string"
  } else if (str.isEmpty()) {
    return "Empty string"
  } else if (str instanceof String) {
    return str.toUpperCase()
  } else {
    return "Invalid input type"
  }
}

assert myMethod(null) == "Null string"
assert myMethod("") == "Empty string"
assert myMethod("hello") == "HELLO"
assert myMethod(["a","b"]) == "Invalid input type" 
```