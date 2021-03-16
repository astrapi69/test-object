# test-objects

<div align="center">

[![Build Status](https://travis-ci.org/lightblueseas/test-objects.svg?branch=develop)](https://travis-ci.org/lightblueseas/test-objects)
[![Coverage Status](https://coveralls.io/repos/github/lightblueseas/test-objects/badge.svg?branch=develop)](https://coveralls.io/github/lightblueseas/test-objects?branch=develop)
[![Open Issues](https://img.shields.io/github/issues/lightblueseas/test-objects.svg?style=flat)](https://github.com/lightblueseas/test-objects/issues)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/io.github.astrapi69/test-objects/badge.svg)](https://maven-badges.herokuapp.com/maven-central/io.github.astrapi69/test-objects)
[![Javadocs](http://www.javadoc.io/badge/io.github.astrapi69/test-objects.svg)](http://www.javadoc.io/doc/io.github.astrapi69/test-objects)
[![MIT license](http://img.shields.io/badge/license-MIT-brightgreen.svg?style=flat)](http://opensource.org/licenses/MIT)
[![Donate](https://img.shields.io/badge/donate-❤-ff2244.svg)](https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=GVBTWLRAZ7HB8)

</div>

Project that holds test objects for unit tests.

If you like this project put a ⭐ and donate

## Note

No animals were harmed in the making of this library.

# Donations

If you like this library, please consider a donation through
paypal: <a href="https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=B37J9DZF6G9ZC" target="_blank">
<img src="https://www.paypalobjects.com/en_US/GB/i/btn/btn_donateCC_LG.gif" alt="PayPal this" title="PayPal – The safer, easier way to pay online!" border="0" />
</a>

or over bitcoin or bitcoin-cash with:

36JxRRDfRazLNqUV6NsywCw1q7TK38ukpC

or over ether with:

0x588Aa02De98B1Ef70afeDC3ec5290130a3E5e273

or over flattr:
<a href="https://flattr.com/submit/auto?fid=r7vp62&url=https%3A%2F%2Fgithub.com%2Flightblueseas%2Ftest-objects" target="_blank">
<img src="http://api.flattr.com/button/flattr-badge-large.png" alt="Flattr this" title="Flattr this" border="0" />
</a>

## License

The source code comes under the liberal MIT License, making test-objects great for all types of
applications.

## Maven dependency

Maven dependency is now on sonatype. Check
out [sonatype repository](https://oss.sonatype.org/index.html#nexus-search;gav~io.github.astrapi69~test-objects~~~)
for latest snapshots and releases.

Add the following maven dependency to your project `pom.xml` if you want to import the core
functionality of test-objects:

Than you can add the dependency to your dependencies:

	<properties>
			...
		<!-- TEST-OBJECTS version -->
		<test-objects.version>5.4</test-objects.version>
			...
	</properties>
			...
		<dependencies>
			...
			<!-- TEST-OBJECTS DEPENDENCY -->
			<dependency>
				<groupId>io.github.astrapi69</groupId>
				<artifactId>test-objects</artifactId>
				<version>${test-objects.version}</version>
				<scope>test</scope>
			</dependency>
			...
		</dependencies>

## gradle dependency

You can first define the version in the ext section and add than the following gradle dependency to
your project `build.gradle` if you want to import the core functionality of test-objects:

define version in file gradle.properties
```

testObjectsVersion=5.4
```

or in build.gradle ext area

```
ext {
			...
    testObjectsVersion = "5.4"
			...
}
```

and than add the dependency to the dependencies area

```
dependencies {
			...
    implementation("io.github.astrapi69:test-objects:$testObjectsVersion")
			...
}
	
```

## Semantic Versioning

The versions of jcommons-lang are maintained with the Semantic Versioning guidelines.

Release version numbers will be incremented in the following format:

`<major>.<minor>.<patch>`

For detailed information on versioning you can visit
the [wiki page](https://github.com/lightblueseas/mvn-parent-projects/wiki/Semantic-Versioning).

## Want to Help and improve it? ###

The source code for test-objects are on GitHub. Please feel free to fork and send pull requests!

Create your own fork
of [lightblueseas/test-objects/fork](https://github.com/lightblueseas/test-objects/fork)

To share your
changes, [submit a pull request](https://github.com/lightblueseas/test-objects/pull/new/develop).

Don't forget to add new units tests on your changes.

## Contacting the Developers

Do not hesitate to contact the test-objects developers with your questions, concerns, comments, bug
reports, or feature requests.

- Feature requests, questions and bug reports can be reported at
  the [issues page](https://github.com/lightblueseas/test-objects/issues).

# Similar projects

- [meanBean](http://meanbean.sourceforge.net/) Automated JavaBean Testing.
- [awaitility](https://github.com/awaitility/awaitility) Awaitility is a small Java DSL for
  synchronizing asynchronous operations
- [podam](https://github.com/devopsfolks/podam) PODAM is a lightweight tool to auto-fill Java POJOs
  with data.
- [random-beans](https://github.com/benas/random-beans) Because life is too short to generate random
  Java beans by hand.

## Credits

|**Travis CI**|
|     :---:      |
|[![Travis CI](https://travis-ci.com/images/logos/TravisCI-Full-Color.png)](https://coveralls.io/github/lightblueseas/test-objects?branch=master)|
|Special thanks to [Travis CI](https://travis-ci.org) for providing a free continuous integration service for open source projects|
|     <img width=1000/>     |

|**Nexus Sonatype repositories**|
|     :---:      |
|[![sonatype repository](https://img.shields.io/nexus/r/https/oss.sonatype.org/io.github.astrapi69/test-objects.svg?style=for-the-badge)](https://oss.sonatype.org/index.html#nexus-search;gav~io.github.astrapi69~test-objects~~~)|
|Special thanks to [sonatype repository](https://www.sonatype.com) for providing a free maven repository service for open source projects|
|     <img width=1000/>     |

|**coveralls.io**|
|     :---:      |
|[![Coverage Status](https://coveralls.io/repos/github/lightblueseas/test-objects/badge.svg?branch=master)](https://coveralls.io/github/lightblueseas/test-objects?branch=master)|
|Special thanks to [coveralls.io](https://coveralls.io) for providing a free code coverage for open source projects|
|     <img width=1000/>     |

|**javadoc.io**|
|     :---:      |
|[![Javadocs](http://www.javadoc.io/badge/io.github.astrapi69/test-objects.svg)](http://www.javadoc.io/doc/io.github.astrapi69/test-objects)|
|Special thanks to [javadoc.io](http://www.javadoc.io) for providing a free javadoc documentation for open source projects|
|     <img width=1000/>     |

