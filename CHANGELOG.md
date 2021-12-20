## Change log
----------------------

Version 5.6
-------------

ADDED:

- new test factory class for test class Permission
- new test class Factory created
- new test class CompanyGroup created

CHANGED:

- update gradle to new version 7.3.2
- improve gradle build performance by adding new gradle parameters for caching, parallel, configure on demand and file

Version 5.5
-------------

CHANGED:

- update gradle to new version 7.1
- changed all dependencies from groupid de.alpharogroup to new groupid io.github.astrapi69
- update gradle-plugin dependency of gradle.plugin.com.hierynomus.gradle.plugins:license-gradle-plugin to new version 0.16.1
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
- replaced obsolet dependency jobject-evaluate with new dependency jobj-contract-verifier in version
  3

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

- removed deprecated classes in the package io.github.astrapi69.test.objects.evaluations
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

- created new test objects(=tobs) and moved tobs to appropriated packages
  f5bd6832f4d1039e872440c5b56b23ffb4051681
- launch script for preparing release
- sorted pom.xml
- Donation buttons extended for paypal and bitcoin

CHANGED:

- javadoc extended and improved

Notable links:
[keep a changelog](http://keepachangelog.com/en/1.0.0/) Don’t let your friends dump git logs into
changelogs
