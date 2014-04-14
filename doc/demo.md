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

The first task of this demo involves creating a ["hello world" program](http://people.mech.kuleuven.be/~mklotzbucher/rfsm/README.html#sec-3). This traditional approach allows the reader to become familiar with the very basics of the framework.

![hello world model](http://people.mech.kuleuven.be/~mklotzbucher/rfsm/example1.png)

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

###Transform the rFSM model to Lua input for the rFSM simulator
1. Select the _helloworld.rfsm_ file in the _Project Explorer_.
2. Select from the main menu: __rFSM > Create Structural Code__.
3. Select the _helloworld_ project and hit __F5__ to refresh the workspace.
4. A generated file _src/helloworld.lua_ should be visible now.

###Run the generated Lua code in the rFSM simulator

The generated code can now be run in the rFSM simulator. This text uses $RFSMPATH as the location of the git rFSM repository. Now, open a terminal, go to your current workspace and type:

```shell
$RFSMPATH/tools/rfsm-sim helloworld/src/helloworld.lua
```

To advance the machine, execute `step(p)` in the simulator. An event can be executed by typing `se("eventname")` e.g. `se_restart`. To stop the simulator, type __Ctrl+C__.

Note: If the simulator doesn't run the program, check if the rFSM folder is in your LUA_PATH. Otherwise, do:

```shell
export LUA_PATH="$LUA_PATH;$RFSMPATH/?.lua"
```

More information on the rFSM simulator can be found in the [rFSM readme](http://people.mech.kuleuven.be/~mklotzbucher/rfsm/README.html).

An extended example
---

To get more familiar with the language and to understand more advanced feature, a more complete example is included in this demo. This example is based on the [a more complete example](http://people.mech.kuleuven.be/~mklotzbucher/rfsm/README.html#sec-8-1) from the rFSM documentation.

The rest of this document assumes the reader already created the "hello world" program and will focus on the features and constraints of the modeling language, instead of the methods how to use the framework.

![an extended example](http://people.mech.kuleuven.be/~mklotzbucher/rfsm/example2.png)

###Create the model
1. Create a new project (i.e. extexample) with a new rFSM file (i.e. extexample.rfsm).
2. Insert the following code in the newly created file:

```
state root {
	state on {
		
		state moving {
			entry: 'print("starting to move")'
			exit: 'print("stopping")'
		}
		
		state waiting {}
		
		connector initial {}		
		
		transition from initial to waiting
		transition from waiting to moving onevent 'e_start'
		transition from moving to waiting onevent 'e_stop'
		
		entry: 'print("disabling brakes")'
		exit: 'print("enabling brakes")'     
	}
	
	state error {
		doo: '   print ("Error detected - trying to fix")
                 rfsm.yield()
                 math.randomseed( os.time() )
                 rfsm.yield()
                 if math.random(0,100) < 40 then
                    print("unable to fix, raising e_fatal_error")
                    rfsm.send_events(fsm, "e_fatal_error")
                 else
                    print("repair succeeded!")
                    rfsm.send_events(fsm, "e_error_fixed")
                 end
              '
	}
	
	state fatal_error {}
	
	connector initial {}
	
	transition from initial to on effect: 'print("initializing system")'	
	
	transition from on to error onevent 'e_error'
	transition from error to on onevent 'e_error_fixed'
	transition from error to fatal_error onevent 'e_fatal_error'
	transition from fatal_error to initial onevent 'e_reset' 
}
```

3. Generate the corresponding Lua code.
4. Run the model in the rFSM simulator.

This model also shows the definition of a pure Lua doo function.

###Constraints on the modeling language
A considerable advantage of using an external DSL with a specialized toolkit, like this project, over an internal DSL, like the Lua rFSM implementation, is direct feedback about the written code. The IDE can warn the user immediately about wrong or incomplete code, where those things only become noticable in an internal DSL while running the code.

This section illustrates some, not all, implemented constraints. The reader is encouraged to try to implement the faulty elements in the extended example.

####Exactly one root state
rFSM explicitly says that every program is defined inside one composite state. The IDE throws an error when a programmer tries to define multiple root states.

Try to add the following line to the end of the extended example:

```
state secondroot {}
```

####One initial connector if state is composite
An initial connector can be used to define the entrypoint of a composite state. Every composite state needs to define exactly one initial connector.

Try to add the following line right under `connector initial {}` of the state `on` in the extended example.

```
connector initial {}
```

####Right owner of transition
Transitions are owned by composite states, not by the states from which the transition originates. To ensure composability, a transition can't be owned by a state less nested then the transition's least common ancestor.

Try to add the following line to the state `on` of the extended example:

```
transition from moving to error onevent 'wrongowner'
```

####Legal boundary crossing
Again for composability reasons, the transition target should point to a node less or equally nested than source node.

Try to add the following line to the state `root`:

```
transition from error to on.moving onevent 'wrongdirection'
```


