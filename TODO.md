# TODO

##Features
 - Add methods getCurrentHp & getHp

### Bot
- Interrupt (script) autologin if login and password are wrong.
- Add antiban If player talks.
- Add private chat tab.

### Script
- Add all smelting options to AlKharid Smelter
- Add all certing options to DraynorCerter

## Refaktor
- Refaktor LoginActionHandler and UserSelectionPanel interaction logic.
- Rename module vb-core-instrumentation to vb-core-agent.
- Rename vb-core-contracts to vb-core-common and move common code from vb-core-instrumentation and vb-core to this module (E.g exception type, user.dir constants etc).
- Use common concept (LocalPlayer or User) instead of user, player, localplayer etc in code for current logged in user.
- Review & tidy defined DI depdencies in BotModule.
- Make GameSettingsHandler to use onAfterHandleOpcodeIn and SETTINGS_CHANGED OpCodeIn.


## Bugs
- Fix walkToTile after sector loading. 
- When the bot is sleeping it sometimes tries to construct double packets.
- When the bot frame finishes loading it randomly creates horizontal and vertical scrollbar to script list element.
- When current player is using sleeping bag then sometimes it refreshes word before it is detected.
- Sometimes when user is automatically logging in the first time after bot is loaded getName throws exception.
- When on GUI the ignore list is cleared and update button is pressed then the dialog hangs.