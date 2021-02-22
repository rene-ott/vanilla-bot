# TODO
##Features
### Bot
- If bot is loaded the first time and user selectes username from list then login controls should be also populated with selected values (username, password).
- If username or proxy is changed then update bot frame title with format <username> <if has proxy then - [proxy] else empty>.
- Interrupt (script) autologin if login and password are wrong.
- Add antiban If player talks
- Add private chat tab

### Script
- Add all smelting options to AlKharid Smelter
- Add all certing options to DraynorCerter

##Refaktor:
- Refaktor LoginActionHandler and UserSelectionPanel interaction logic.
- Rename module vb-core-instrumentation to vb-core-agent
- Rename vb-core-contracts to vb-core-common and move common code from vb-core-instrumentation and vb-core to this module (E.g exception type, user.dir constants etc).
- Use common concept (LocalPlayer or User) instead of user, player, localplayer etc in code for current logged in user.
- Review & tidy defined DI depdencies in BotModule.

##Bugs
- When the bot frame finishes loading it randomly creates horizontal and vertical scrollbar to script list element.
- When current player is using sleeping bag then sometimes it refreshes word before it is detected.
- Sometimes when user is automatically logging in the first time after bot is loaded getName throws exception.