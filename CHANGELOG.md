## Change log
----------------------

Version 9-SNAPSHOT
-------------

ADDED:

- new test dependency meanbean-factory
- new maven repository for dependency jobj-contract-verifier
- new test dependency junit-jupiter-params in version 5.11.0 for parameterized unit tests
- new migration guide for migrate from test-ng to junit-juniper
- new singleton bean test class and added to the test object list in the class TestObjectFactory
- new package constructor for demonstrate the call order of static blocks and constructors of class hierarchy
- new libs.versions.toml file for new automatic catalog versions update

CHANGED:

- rename of module to new name 'io.github.astrapisixtynine.test.object'
- update of gradle to new version 8.10
- update of com.github.ben-manes.versions.gradle.plugin to new version 0.51.0
- update of gradle-plugin dependency 'org.ajoberstar.grgit:grgit-gradle' to new version 5.2.2
- update of gradle-plugin dependency of 'com.diffplug.spotless:spotless-plugin-gradle' in version 7.0.0.BETA2
- update of test dependency silly-collection to new version 27.1
- update of test dependency jobj-contract-verifier to new version 5.2
- update of test dependency mockito-core to new version 5.13.0
- update of test dependency junit-juniper to new version 5.11.0
- update of test dependency junit-platform-launcher to new version 1.11.0

Version 8.2
-------------

ADDED:

- new factory for test object creation from the package 'io.github.astrapi69.test.object.auth'
- new factory method that returns a list with all test objects
- new factory method that returns a map with all test objects with the class name as a key
- new required version info for dependency 'org.junit.platform:junit-platform-launcher' in current version 1.10.0

Version 8.1
-------------

ADDED:

- new factory methods for all missing test objects

CHANGED:

- update of gradle-plugin dependency 'org.ajoberstar.grgit:grgit-gradle' to new version 5.2.1
- update of test dependency silly-collection to new version 27
- rename of package enumtype to enumeration
- moved all abstract and base classes to its own package 'io.github.astrapi69.test.base'
- replaced all obsolete package.html files with the new appropriate package-info.java files

Version 8
-------------

CHANGED:

- update of jdk to version 17
- update of gradle to new version 8.4
- update of com.github.ben-manes.versions.gradle.plugin to new version 0.49.0
- update of gradle-plugin dependency 'org.ajoberstar.grgit:grgit-gradle' to new version 5.2.0
- update of gradle-plugin dependency of 'com.diffplug.spotless:spotless-plugin-gradle' in version 6.22.0
- update of test dependency silly-collection to new version 21
- update of test dependency meanbean to the new milestone version 3.0.0-M9
- update of test dependency junit-juniper-api to new version 5.10.0

Version 7.2
-------------

ADDED:

- new factory method for test object Person

CHANGED:

- update of com.github.ben-manes.versions.gradle.plugin to new version 0.43.0
- update of gradle-plugin dependency of 'com.diffplug.spotless:spotless-plugin-gradle' in version 6.11.0
- update of test dependency silly-collection to new version 20.1
- update of test dependency junit-juniper-api to new version 5.9.1

Version 7.1
-------------

CHANGED:

- update of test dependency jobj-contract-verifier to new version 4
- update of test dependency silly-collection to new version 20

Version 7
-------------

ADDED:

- new unit test framework junit-jupiter-api(junit5)
- new set of subordinates in data class Employee

CHANGED:

- update of jdk to version 11
- update of gradle to new version 7.5.1
- update of gradle-plugin dependency of 'com.diffplug.spotless:spotless-plugin-gradle' in version 6.9.1
- remove of unit test framework testng
- rename of module and repository from plural-form test-objects to singular-form test-object

Version 6.1
-------------

ADDED:

- new test class Club for unit tests
- new field location in test class Company

CHANGED:

- update gradle to new version 7.4.2
- extracted sections from build.gradle to own gradle files
- update of gradle plugin dependency com.diffplug.spotless:spotless-plugin-gradle to new patch version 6.6.1

Version 6
-------------

ADDED:

- new test interface class Animal created
- new test interface class Shape created
- new test class Dog created
- new test class Forbidden created
- new test class Snake created
- new test class Circle created
- new test class Rectangle created
- new test class ShapeStore created
- new gradle plugin spotless in version 6.3.0

CHANGED:

- update gradle to new version 7.4
- update of com.github.ben-manes.versions.gradle.plugin to new version 0.42.0
- update of test dependency jobj-contract-verifier to new version 3.5
- update of test dependency testng to new version 7.5
- renamed all packages that was in plural form to singular form

Version 5.7
-------------

ADDED:

- new test class PrimitiveArrays created
- new test class PrimitiveObjectClassArrays created

CHANGED:

- update gradle to new version 7.3.3
- update of com.github.ben-manes.versions.gradle.plugin to new version 0.40.0

Version 5.6
-------------

ADDED:

- new test factory class for test class Permission
- new test class Factory created
- new test class CompanyGroup created

CHANGED:

- update gradle to new version 7.3.2
- improve gradle build performance by adding new gradle parameters for caching, parallel, configure on demand and file
  watch

Version 5.5
-------------

CHANGED:

- update gradle to new version 7.1
- changed all dependencies from groupid de.alpharogroup to new groupid io.github.astrapi69
- update gradle-plugin dependency of gradle.plugin.com.hierynomus.gradle.plugins:license-gradle-plugin to new version
  0.16.1
- moved testng dependency to test dependency
- update of jobj-contract-verifier version to 3.4
- update of com.github.ben-manes.versions.gradle.plugin to new version 0.39.0

Version 5.4
-------------

CHANGED:

- update of gradle to new version 6.8.3
- update of jobj-contract-verifier version to 3.3
- update of com.github.ben-manes.versions.gradle.plugin to new version 0.38.0
- changed to new package io.github.astrapi69

Version 5.3
-------------

ADDED:

- new build system gradle

CHANGED:

- update of dependency jobj-contract-verifier version to 3.2
- removed maven build system and all related files
- removed all lombok dependent imports

Version 5.2
-------------

ADDED:

- new Factory class created for create random objects with the new random-beans version

CHANGED:

- update of dependency jobj-contract-verifier version to 3.1.1
- replace lombok Data annotation with the corresponding annotations

Version 5.1
-------------

ADDED:

- new dependency jobj-contract-verifier in version 3 added

CHANGED:

- update of parent version to 4.8
- replaced obsolet dependency jobject-evaluate with new dependency jobj-contract-verifier in version 3

Version 5.0.1
-------------

CHANGED:

- update of parent version to 4.5
- replaced log4j2 dependencies with java util logging

Version 5
-------------

CHANGED:

- update of jobject-extensions version to 2.5
- removed unneeded dependency runtime-compiler
- changed dependencies that are needed only for unit test in the test scope

Version 4.29.1
-------------

CHANGED:

- update of parent version to 4.4

Version 4.29
-------------

ADDED:

- new lombok.config file added

CHANGED:

- update of parent version to 4.2
- update of jobject-extensions version to 2
- added general exception throw clause in setUp and tearDown methods in class AbstractTestCase
- changed to log4j2 configuration files and removed obsolet log4j properties files

Version 4.28
-------------

ADDED:

- new base unit test class for comparators

CHANGED:

- unit tests extended for improve code coverage to 100%

Version 4.27
-------------

ADDED:

- new coverage status icon
- new abstract class AbstractTestCase with generic types for actual and expected
- new dependency of jobject-extensions
- javadoc extended and improved

CHANGED:

- unit tests extended for improve code coverage

Version 4.26
-------------

CHANGED:

- removed deprecated classes in the package io.github.astrapi69.test.object.evaluations
- removed deprecated boolean flag result in class BaseTestCase

Version 4.25
-------------

ADDED:

- new boolean expected instance variable in class BaseTestCase

CHANGED:

- tagged evaluation classes as deprecated and made a note which class to use instead
- update of parent version to 3.11
- removed unneeded .0 at the end of version
- tagged boolean flag result in class BaseTestCase as deprecated

Version 4.24.0
-------------

ADDED:

- new evaluator that evaluates classes in a silent manner
- new launch script for display dependencies updates

CHANGED:

- update of parent version to 3.9.0

Version 4.23.0
-------------

ADDED:

- new evaluator method created for equals, hashcode and toString with class parameter
- new dependency of random-beans
- new dependency of commons-beanutils
- new launch script for display dependencies updates

CHANGED:

- update of parent version

Version 4.22.0
-------------

ADDED:

- new evaluator methods created for equals, hashcode and toString
- new section for credits in the README.md file

CHANGED:

- update of parent version
- moved build-status, maven-central and javadoc icons to the top
- javadoc extended and improved

Version 4.21.0
-------------

ADDED:

- new evaluator class for the toString method
- new class EqualsHashCodeAndToStringEvaluator created
- extended README.md with similar project reference link
- new launch script for change log created
- new CHANGELOG.md file created

FIXED:

- compare error fixed in HashcodeEvaluator

Version 4.20.0
-------------

ADDED:

- implement methods for evaluate contract conditions of equals method
- implement methods for evaluate contract conditions of hashcode method

Version 4.19.0
-------------

ADDED:

- new classes created for evaluation of equals, hashcode and comparable
- provide package.html for the javadoc of packages

CHANGED:

- update of documentation and javadoc

Version 4.18.0
-------------

ADDED:

- created new test objects(=tobs) and moved tobs to appropriated packages f5bd6832f4d1039e872440c5b56b23ffb4051681
- launch script for preparing release
- sorted pom.xml
- Donation buttons extended for paypal and bitcoin

CHANGED:

- javadoc extended and improved

Notable links:
[keep a changelog](http://keepachangelog.com/en/1.0.0/) Don’t let your friends dump git logs into changelogs
