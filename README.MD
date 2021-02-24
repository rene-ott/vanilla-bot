# Vanilla Bot

<p align="center">
  <img src="https://github.com/rene-ott/vanilla-bot/blob/main/icon.png" />
</p>

Vanilla Bot is a [Runescape Classic Vanilla](https://www.runescapeclassic.org/) (Runescape Classic private server) client which enables to play the game automatically for the user.
The bot can execute scripts which define actions what the in game character must do. It comes with pre-defined scripts, but it's also possible to write your own scripts. To run the script the user must select one from the script list.

## Demo

*Example of how the user starts wooductting script and the in game character cuts trees.*

<p align="center">
  <img src="https://github.com/rene-ott/vanilla-bot/blob/main/demo.gif" />
</p>

## Features

 - Create & run custom scripts
 - Automatically reloads script list in GUI if detects change in scripts directory
 - Proxy support
 - Predefined user and proxy selection from `appsettings.yaml`
 - Captcha solver
 - Autologin 
 - Anti ban (if player near):
   - Set activation distance
   - Play sound
   - Stop the running script or take pause for X minutes
   - Logout in X minutes

## Description

The bot is using reflection to access the original client `client.jar` fields and methods. It reads those fields to get the current state of the in game character and invokes `client.jar` methods to send action commands through the client to server. Also, it uses Java instrumentation API in conjunction with Javassist to intercept some `client.jar` methods.

Each time the RSC Vanilla team updates `client.jar` the jar code is obfuscated. Specifically class fields and methods are renamed. As the `client.jar` is updated, and the class member names change, the bot must be also updated. In order to prevent the `client.jar` update from breaking the bot during compile-time, the `client.jar` methods and fields are accessed through reflection. 

The field and method names are described in the `cjci.yaml`[file](https://github.com/rene-ott/vanilla-bot/blob/main/vb-cjci-model/src/main/resources/cjci.yaml).

## Structure
The project is divided into multiple sub-projects:
 - vb-core
 - vb-core-instrumentation
 - vb-core-contracts
 - vb-cjci-model
 - vb-cjci-updater
 - vb-captcha-serializer

### vb-core
Core logic of the bot. Contains directories:

 - `config` - Logger configuration file `logback.xml` and `appsettings.yaml` for predefining in game user credentials and proxies.
 - `lib` - Original game client `client.jar` and instrumentation agent `agent.jar`
 - `scripts` - Compiled scripts classes which are loaded into bot. 
 - `src` - source code for the bot

### vb-core-instrumentation
Instrumentation agent `agent.jar` source code. The agent is used for modifying `client.jar` classes before running the bot.

### vb-core-contracts
Common code (interfaces) for `vb-core` and `vb-core-instrumentation`


### vb-cjci-model
Model classes for `cjci.yaml` file. Also contains the latest `cjci.yaml` file in the resource directory.

### vb-cjci-updater
Generates `cjci.yaml` file. Loads original `client.jar` into temp directory. Decompiles and extracts the jar. Based on `cjci_template.yaml` and regex pattern matchers tries to match necessary field and method names from the decompiled source code.  

### vb-captcha-serializer
Generates `ocr.dat` file which is used for in game captcha solving.

## Usage
The bot can be run through gradle

 - Run bot -  `./gradlew runBot`
 - Publish bot -  `./gradlew publishBot`