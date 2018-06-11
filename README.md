# test-objects

<div align="center">

[![Build Status](https://travis-ci.org/lightblueseas/test-objects.svg?branch=master)](https://travis-ci.org/lightblueseas/test-objects)
[![Coverage Status](https://coveralls.io/repos/github/lightblueseas/test-objects/badge.svg?branch=develop)](https://coveralls.io/github/lightblueseas/test-objects?branch=develop)
[![Open Issues](https://img.shields.io/github/issues/lightblueseas/test-objects.svg?style=flat)](https://github.com/lightblueseas/test-objects/issues) 
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/de.alpharogroup/test-objects/badge.svg)](https://maven-badges.herokuapp.com/maven-central/de.alpharogroup/test-objects)
[![Javadocs](http://www.javadoc.io/badge/de.alpharogroup/test-objects.svg)](http://www.javadoc.io/doc/de.alpharogroup/test-objects)
[![MIT license](http://img.shields.io/badge/license-MIT-brightgreen.svg?style=flat)](http://opensource.org/licenses/MIT)

</div>

Project that holds test objects for unit tests and evaluators.

Currently supported evaluators:

- ComparableEvaluator is intended to evaluate Comparable objects
- EqualsEvaluator evaluates the equals method of objects
- HashcodeEvaluator evaluates the hashcode method of objects
- ToStringEvaluator evaluates the toString method of objects
- EqualsHashCodeAndToStringEvaluator is a combination of all the above evaluators
- SilentEqualsHashCodeAndToStringEvaluator evaluates classes in a silent manner

## License

The source code comes under the liberal MIT License, making test-objects great for all types of applications.

## Maven dependency

Maven dependency is now on sonatype.
Check out [sonatype repository](https://oss.sonatype.org/index.html#nexus-search;gav~de.alpharogroup~test-objects~~~) for latest snapshots and releases.

Add the following maven dependency to your project `pom.xml` if you want to import the core functionality of test-objects:

Than you can add the dependency to your dependencies:

		<!-- TEST-OBJECTS version -->
		<test-objects.version>4.26</test-objects.version>

		<dependencies>
			...
			<!-- TEST-OBJECTS DEPENDENCY -->
			<dependency>
				<groupId>de.alpharogroup</groupId>
				<artifactId>test-objects</artifactId>
				<version>${test-objects.version}</version>
			</dependency>
			...
		</dependencies>

## Semantic Versioning

The versions of jcommons-lang are maintained with the Semantic Versioning guidelines.

Release version numbers will be incremented in the following format:

`<major>.<minor>.<patch>`

For detailed information on versioning you can visit the [wiki page](https://github.com/lightblueseas/mvn-parent-projects/wiki/Semantic-Versioning).

## Want to Help and improve it? ###

The source code for test-objects are on GitHub. Please feel free to fork and send pull requests!

Create your own fork of [lightblueseas/test-objects/fork](https://github.com/lightblueseas/test-objects/fork)

To share your changes, [submit a pull request](https://github.com/lightblueseas/test-objects/pull/new/develop).

Don't forget to add new units tests on your changes.

## Contacting the Developers

Do not hesitate to contact the test-objects developers with your questions, concerns, comments, bug reports, or feature requests.
- Feature requests, questions and bug reports can be reported at the [issues page](https://github.com/lightblueseas/test-objects/issues).

## Note

No animals were harmed in the making of this library.

# Donations

If you like this library, please consider a donation through paypal: <a href="https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=B37J9DZF6G9ZC" target="_blank">
<img src="https://www.paypalobjects.com/en_US/GB/i/btn/btn_donateCC_LG.gif" alt="PayPal this" title="PayPal – The safer, easier way to pay online!" border="0" />
</a>

or over bitcoin or bitcoin-cash with:

1Jzso5h7U82QCNmgxxSCya1yUK7UVcSXsW

or over ether with:

0xaB6EaE10F352268B0CA672Dd6e999C86344D49D8

or over flattr: 
<a href="https://flattr.com/submit/auto?fid=r7vp62&url=https%3A%2F%2Fgithub.com%2Flightblueseas%2Ftest-objects" target="_blank">
<img src="http://api.flattr.com/button/flattr-badge-large.png" alt="Flattr this" title="Flattr this" border="0" />
</a>

# Similar projects

- [meanBean](http://meanbean.sourceforge.net/) Automated JavaBean Testing.
- [awaitility](https://github.com/awaitility/awaitility) Awaitility is a small Java DSL for synchronizing asynchronous operations
- [podam](https://github.com/devopsfolks/podam) PODAM is a lightweight tool to auto-fill Java POJOs with data.
- [random-beans](https://github.com/benas/random-beans) Because life is too short to generate random Java beans by hand.

## Credits

|Travis CI|
|:-:|
|![Travis CI](https://travis-ci.com/images/logos/TravisCI-Full-Color.png)|
|Many thanks to [Travis CI](https://travis-ci.org) for providing a free continuous integration service for open source projects.|
