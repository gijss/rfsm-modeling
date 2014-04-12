rFSM modeling
===

Introduction
---
The purpose of this project is to create a meta-model for the representation of [rFSM](http://people.mech.kuleuven.be/~mklotzbucher/rfsm/README.html) programs. This meta-model is to be used in the [Rodinia project](http://www.roboticsmodelling.eu/tooling/rodinia). Note that this is very much a work in progress!

This project contains:
* A [meta-model](https://github.com/gijss/rfsm-modeling/blob/master/be.kuleuven.rodinia.model.rfsm/model/rfsm.xcore) of rFSM
* A [grammar](https://github.com/gijss/rfsm-modeling/blob/master/be.kuleuven.rodinia.dsl.rfsm/be.kuleuven.rodinia.dsl.rfsm/src/be/kuleuven/rodinia/dsl/Rfsm.xtext) which is only defined for testing purposes
* A complete programming environment based on that Xtext grammar
* Lua [code generation](https://github.com/gijss/rfsm-modeling/tree/master/be.kuleuven.rodinia.transform.rfsm/epsilon) based on the model of an rFSM program

This project illustrates the creation of a meta-model, DSL and proper programming tools through the use of Eclipse Modeling Framework. In particular, Xcore is used to define the meta-model, Xtext to define the grammar and create the programming environment, Epsilon to transform the meta-model and to generate source code for an interpreter.

Installation and usage
---
###Installation instructions
1. Download sources: `git clone https://github.com/gijss/rfsm-modeling.git`
2. Install dependencies
    1. Install Java (tested with openjdk-7-jdk)
    2. Install Lua (tested with lua5.2)
    3. Install [Eclipse](https://www.eclipse.org/downloads/) (tested with Eclipse 4.3.2)
    4. Install [Xcore](https://wiki.eclipse.org/Xcore) (tested with Xcore 1.1.2)
    5. Install [Xtext](https://www.eclipse.org/Xtext/) (tested with Xtext 2.5.3)
    6. Install [Epsilon](https://www.eclipse.org/epsilon/) (tested with Epsilon 1.1.0)
    7. Download Rodinia sources: `git clone http://git.mech.kuleuven.be/robotics/rodinia.git` (tested with branch Graphiti from 2014-02-03)
    8. Download rFSM sources: `git clone https://github.com/kmarkus/rFSM.git` (tested with branch master from 2014-02)

###Build programming environment
3. Start Eclipse and import into workspace:
    1. All projects from rFSM repository
    2. Project `be.kuleuven.rodinia.epsilon.service` from Rodinia repository (Graphiti branch)
4. Generate Xtext Artifacts:
    1. Select `Rfsm.xtext` from `be.kuleuven.rodinia.model.rfsm` project and
    2. Right click and choose Run As -> Generate Xtext Artifacts from its context menu
5. Register metamodel into Epsilon:
    1. Select `rfsm.ecore` from `be.kuleuven.rodinia.model.rfsm` project and
    2. Right click and choose Register EPackages from its context menu
6. Launch Runtime Eclipse:
    1. Choose Run As -> Run Configurations...
    2. Choose Eclipse Application -> Launch Runtime Eclipse
    3. Click Run to run with default configuration

###Program and run an rFSM

8. Create new project
10. Create new file with an .rfsm extension
11. Define rFSM program using the right grammar (example in `be.kuleuven.rodinia.transform.rfsm/examples`)
12. Select .rfsm file and choose rFSM -> Create Structural Code from menu bar
13. A generated .lua file should be generated in the src/ folder
14. Run this file with the rFSM simulator

###Tutorial
See [tutorial](https://github.com/gijss/rfsm-modeling/blob/master/doc/demo.md)

Current issues
---
###Meta-model:
* Constraints:
    * More need to be defined
* Needs to be linked with Lua or other programming language meta-model?
        * To specify real function instead of string

###Grammar:
* Very temporary for testing purposes only: needs complete rework

###Code generation:
* No indentation (can be implemented with org.eclipse.epsilon.egl.formatter)
