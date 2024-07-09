# Step by step guide to migrate from testng to junit-jupiter

1. As first, you have to remove the dependency and the corresponding version from testng. Then add the required
   junit-jupiter dependencies and add them to the bundles section. The file 'libs.versions.toml' should look as the
   following:
```toml
[versions]
junit-jupiter-params-version = "5.11.0-M2"
junit-jupiter-version = "5.11.0-M2"
junit-platform-launcher-version = "1.11.0-M2"

[libraries]
junit-jupiter = { module = "org.junit.jupiter:junit-jupiter", version.ref = "junit-jupiter-version" }
junit-jupiter-params = { module = "org.junit.jupiter:junit-jupiter-params", version.ref = "junit-jupiter-params-version" }
junit-platform-launcher = { module = "org.junit.platform:junit-platform-launcher", version.ref = "junit-platform-launcher-version" }
[bundles]
unit-testing = [
    "junit-jupiter",
    "junit-jupiter-params",
]
```
now change in the dependencies section:
```groovy
dependencies {
    // Note: use of bundles...
    testImplementation libs.bundles.unit.testing
    testRuntimeOnly libs.junit.platform.launcher
}
```
and change also the test section:
```groovy
test {
    useJUnitPlatform()
}
```
Now replace all imports from testng

```java
import org.testng.annotations.Test;
```
with this one:
```java
import org.junit.jupiter.api.Test;
```

Now replace all imports from testng

```java
import static org.testng.AssertJUnit.*;
```
and
```java
import static org.testng.Assert.*;
```
with this one:
```java
import static org.junit.jupiter.api.Assertions.*;
```

# Replace testng expectedExceptions with the corresponding

```java
 @Test(expectedExceptions = UnsupportedOperationException.class)
 public void targetReadOnly()
 {
    // ...
 }
```

```java

@Test
public void targetReadOnly()
{
   Assertions.assertThrows(UnsupportedOperationException.class, () -> {
      // ...
   });
}
```
