rFSM Modeling Demo
===

Introduction
---

This demo will illustrate the purpose and features of the current rFSM modeling project. Basic usage is explained using a simple "hello world" program and more advanced features and constraints on the language are explained using an extended model. For installation instructions, read this project's [README.md](https://github.com/gijss/rfsm-modeling).

The rest of this document assumes at least some basic knowledge of [rFSM Statecharts](https://github.com/kmarkus/rFSM), so please read its [documentation](http://people.mech.kuleuven.be/~mklotzbucher/rfsm/README.html) if you aren't familiar with rFSM.

Installation
---

To get started with the demo, it's necessary to have the rFSM modeling tools up and running. A complete installation guide can be found in this project's [README.md](https://github.com/gijss/rfsm-modeling). Before continuing this demo, make sure to have completed the installation and building instructions from that readme. The following paragraph assumes the reader completed these instructions and has an Eclipse based rFSM IDE open and ready for use.

Creating your first program
---

The first task of this demo is not yet based on rFSM's Extended example, but involves creating a ["hello world" program](http://people.mech.kuleuven.be/~mklotzbucher/rfsm/README.html#sec-3). This traditional approach allows the reader to become familiar with the very basics of the framework.

###Create an rFSM Project
1. Do __File > New > Project__.
2. Select __General > Project__ and click __Next__.
3. Use _helloworld_ as the project's name and click __Next__.
4. Click __Finish__.

###Create rFSM model
1. Select the _helloworld_ project in the _Project Explorer_.
2. __Right click__ to bring up the context menu and select __New > File__.
3. Use "_helloworld.rfsm_" as the _File Name_ in the wizard and click __Finish__.
4. Click __Yes__ to add the Xtext nature to the project.
5. Type the following in the editor (Hint: Ctrl+Space is autocomplete):

```
state helloworld {
	state hello {
		exit: 'print("hello")'
	}
	
	state world {
		entry: 'print("world")'
	}
	
	connector initial {}
	
	transition from initial to hello
	transition from hello to world onevent 'e_done'
	transition from world to hello onevent 'e_restart'	
}
```

####Clarifications on the model/grammar
Every model should have one toplevel composite state. In this model, _helloworld_ takes that role. Two substates, namely _hello_ and _world_ are defined. The former defines an exit function in pure Lua code, the latter an entry function in pure Lua. An initial connector has to be defined to determine the starting state.

This starting position is then further defined in a transition from _initial_ to _hello_. Further transitions from _hello_ to _world_ and vice versa will happen when certain events occur.

###Transforming the rFSM model to Lua input for the rFSM simulator
1. Select the _helloworld.rfsm_ file in the _Project Explorer_.
2. Select from the main menu: __rFSM > Create Structural Code__.
3. Select the _helloworld_ project and hit __F5__ to refresh the workspace.
4. A generated file _src/helloworld.lua_ should be visible now.

###Run the generated Lua code in the rFSM simulator

The generated code can now be run in the rFSM simulator. This text uses $RFSMPATH as the location of the git rFSM repository. Now, open a terminal, go to your current workspace and type:

```shell
$RFSMPATH/tools/rfsm-sim helloworld/src/helloworld.lua
```

To advance the machine, execute `step(p)` in the simulator. An event can be executed by typing `se("eventname")` e.g. `se_restart`.

Note: If the simulator doesn't run the program, check if the rFSM folder is in your LUA_PATH. Otherwise, do:

```shell
export LUA_PATH="$LUA_PATH;$RFSMPATH/?.lua"
```

More information on the rFSM simulator can be found in the [rFSM readme](http://people.mech.kuleuven.be/~mklotzbucher/rfsm/README.html).

