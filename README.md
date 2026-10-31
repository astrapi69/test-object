# Overview

<div style="text-align: center">

[![Java CI with Gradle](https://github.com/astrapi69/test-object/actions/workflows/gradle.yml/badge.svg)](https://github.com/astrapi69/test-object/actions/workflows/gradle.yml)
[![Open Issues](https://img.shields.io/github/issues/astrapi69/test-object.svg?style=flat)](https://github.com/astrapi69/test-object/issues)
[![Maven Central](https://img.shields.io/maven-central/v/io.github.astrapi69/test-object)](https://central.sonatype.com/artifact/io.github.astrapi69/test-object)
[![Javadocs](http://www.javadoc.io/badge/io.github.astrapi69/test-object.svg)](http://www.javadoc.io/doc/io.github.astrapi69/test-object)
[![MIT license](http://img.shields.io/badge/license-MIT-brightgreen.svg?style=flat)](http://opensource.org/licenses/MIT)
[![Donate](https://img.shields.io/badge/donate-❤-ff2244.svg)](https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=GVBTWLRAZ7HB8)
[![Hits Of Code](https://hitsofcode.com/github/astrapi69/test-object?branch=develop)](https://hitsofcode.com/github/astrapi69/test-object/view?branch=develop)

</div>

Project that holds test objects for unit tests.

# Support this project

> Please support this project by simply putting a Github <!-- Place this tag where you want the button to render. -->
<a class="github-button" href="https://github.com/astrapi69/test-object" data-icon="octicon-star" aria-label="Star astrapi69/test-object on GitHub">
> Star ⭐</a>
>
> Share this library with friends on Twitter and everywhere else you can
>
> If you love this
>
project [![donation](https://img.shields.io/badge/donate-❤-ff2244.svg)](https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=GVBTWLRAZ7HB8)
>
> or for more donation options go the [donations section](#Donations)

## Note

No animals were harmed in the making of this library.

## Import dependencies to your project

<details>
  <summary>gradle (click to expand)</summary>

## gradle dependency

Replace the variable ${latestVersion} with the current latest
version: [![Maven Central](https://img.shields.io/maven-central/v/io.github.astrapi69/test-object)](https://central.sonatype.com/artifact/io.github.astrapi69/test-object)

You can first define the version in the ext section and add than the following gradle dependency to
your project `build.gradle` if you want to import the core functionality of test-object:

define version in file gradle.properties

```
testObjectVersion=${latestVersion}
```

or in build.gradle ext area

```
    testObjectVersion = "${latestVersion}"
```

then add the dependency to the dependencies area

```
    implementation("io.github.astrapi69:test-object:$testObjectVersion")
```

# with new libs.versions.toml file

If you use the new libs.versions.toml file for new automatic catalog versions update

```
[versions]
test-object-version= "${latestVersion}"

[libraries]
test-object = { module = "io.github.astrapi69:test-object", version.ref = "test-object-version" }
```

then add the dependency to the dependencies area

```
    testImplementation libs.test.object
```

</details>

<details>
  <summary>Maven (click to expand)</summary>

## Maven dependency

The library is on Maven Central. Check out [Maven Central](https://central.sonatype.com/artifact/io.github.astrapi69/test-object) for the latest release.

Add the following maven dependency to your project `pom.xml` if you want to import the core
functionality of test-object:

Then you can add the dependency to your dependencies:

    <properties>
        ...

```xml
        <!-- test-object version -->
    <test-object.version>${latestVersion}</test-object.version>
```

        ...
    </properties>
        ...
        <dependencies>
        ...

```xml
            <!-- test-object DEPENDENCY -->
          <dependency>
              <groupId>io.github.astrapi69</groupId>
              <artifactId>test-object</artifactId>
              <version>${test-object.version}</version>
              <scope>test</scope>
          </dependency>
```

        ...
        </dependencies>

</details>


<details>
  <summary>Snapshots (click to expand)</summary>

## 📸 Snapshots

[![Snapshot](https://img.shields.io/badge/dynamic/xml?url=https://central.sonatype.com/repository/maven-snapshots/io/github/astrapi69/test-object/maven-metadata.xml&label=snapshot&color=red&query=.//versioning/latest)](https://central.sonatype.com/repository/maven-snapshots/io/github/astrapi69/test-object/maven-metadata.xml)

This section describes how to import snapshot versions into your project.
Add the following code snippet to your gradle file in the repositories section:

```
repositories {
   //...
```

```groovy
    maven {
    name "Central Portal Snapshots"
    url "https://central.sonatype.com/repository/maven-snapshots/"
    mavenContent {
        snapshotsOnly()
    }
}
```

```
}
```

</details>

## Support this project

If test-object is useful to you, a star on [GitHub](https://github.com/astrapi69/test-object) helps others find it.
Sharing it or reporting a bug helps just as much.

If you would like to contribute financially, the channels are on the repository's Sponsor button, which
reads [.github/FUNDING.yml](.github/FUNDING.yml): GitHub Sponsors, Liberapay, Ko-fi and PayPal.

## License

The source code comes under the liberal MIT License, making test-object great for all types of applications.

## Semantic Versioning

The versions of jcommons-lang are maintained with the Semantic Versioning guidelines.

Release version numbers will be incremented in the following format:

`<major>.<minor>.<patch>`

For detailed information on versioning you can visit
the [wiki page](https://github.com/lightblueseas/mvn-parent-projects/wiki/Semantic-Versioning).

## Want to Help and improve it? ###

The source code for test-object are on GitHub. Please feel free to fork and send pull requests!

Create your own fork of [astrapi69/test-object/fork](https://github.com/astrapi69/test-object/fork)

To share your changes, [submit a pull request](https://github.com/astrapi69/test-object/pull/new/develop).

Don't forget to add new units tests on your changes.

## Contacting the Developers

Do not hesitate to contact the test-object developers with your questions, concerns, comments, bug reports, or feature
requests.

- Feature requests, questions and bug reports can be reported at
  the [issues page](https://github.com/astrapi69/test-object/issues).

# Similar projects

- [meanBean](http://meanbean.sourceforge.net/) Automated JavaBean Testing.
- [awaitility](https://github.com/awaitility/awaitility) Awaitility is a small Java DSL for synchronizing asynchronous
  operations
- [podam](https://github.com/devopsfolks/podam) PODAM is a lightweight tool to auto-fill Java POJOs with data.
- [random-beans](https://github.com/benas/random-beans) Because life is too short to generate random Java beans by hand.

## Credits

|                                                                                                 **Maven Central**                                                                                                  |
|:--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|
| [![Maven Central](https://img.shields.io/maven-central/v/io.github.astrapi69/test-object?style=for-the-badge)](https://central.sonatype.com/artifact/io.github.astrapi69/test-object) |
|                                             Special thanks to [sonatype repository](https://www.sonatype.com) for providing a free maven repository service for open source projects                                             |
|                                                                                                        <img width=1000/>                                                                                                         |

|                                                                            **coveralls.io**                                                                            |
|:----------------------------------------------------------------------------------------------------------------------------------------------------------------------:|
| [![Coverage Status](https://coveralls.io/repos/github/astrapi69/test-object/badge.svg?branch=master)](https://coveralls.io/github/astrapi69/test-object?branch=master) |
|                           Special thanks to [coveralls.io](https://coveralls.io) for providing a free code coverage for open source projects                           |
|                                                                           <img width=1000/>                                                                            |

|                                                              **javadoc.io**                                                               |
|:-----------------------------------------------------------------------------------------------------------------------------------------:|
| [![Javadocs](http://www.javadoc.io/badge/io.github.astrapi69/test-object.svg)](http://www.javadoc.io/doc/io.github.astrapi69/test-object) |
|         Special thanks to [javadoc.io](http://www.javadoc.io) for providing a free javadoc documentation for open source projects         |
|                                                             <img width=1000/>                                                             |

## Git hooks

The repository's git hooks live in `.githooks`: `commit-msg` where present, and `pre-commit`, which refuses a
commit whose files Spotless would format. Activate them once per clone or worktree:

```bash
git config core.hooksPath .githooks
```
