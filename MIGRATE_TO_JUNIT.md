# Step by step guide to migrate from testng to junit-jupiter

1. As first, you have to remove the dependency and the corresponding version from testng. Then add the required
   junit-jupiter dependencies and add them to the bundles section. The file 'libs.versions.toml' should look as the
   following:
```toml
[versions]
junit-jupiter-params-version = "5.11.0"
junit-jupiter-version = "5.11.0"
junit-platform-launcher-version = "1.11.0"

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

# Replace testng imports and annotations with junit-jupiter in unit tests

Now replace all imports from testng

```java
import org.testng.annotations.Test;
```
with this one from junit-jupiter:
```java
import org.junit.jupiter.api.Test;
```

also replace all imports from testng

```java
import static org.testng.AssertJUnit.*;
```
and
```java
import static org.testng.Assert.*;
```
with this one from junit-jupiter:
```java
import static org.junit.jupiter.api.Assertions.*;
```

also replace all imports from testng

```java
import org.testng.annotations.BeforeMethod;
```
with this one from junit-jupiter:
```java
import org.junit.jupiter.api.BeforeEach;
```
and all annotations from testng
```java
@BeforeMethod
void setUp(){}
```
with this one from junit-jupiter:
```java
@BeforeEach
void setUp(){}
```
and replace all imports from testng
```java
import org.testng.annotations.AfterMethod;
```
with this one:
```java
import org.junit.jupiter.api.AfterEach;
```
and all annotations from testng
```java
@AfterMethod
void tearDown(){}
```
with this one from junit-jupiter:
```java
@AfterEach
void tearDown(){}
```

# Replace testng enabled and disabled unit tests

Replace all disabled annotations from testng
```java
@Test(enabled = false)
void testMethod(){}
```
with this one from junit-jupiter:
```java
@Test@Disabled
void testMethod(){}
```

Replace all explicit enabled annotations from testng
```java
@Test(enabled = true)
void testMethod(){}
```
with this one:
```java
@Test
void testMethod(){}
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
