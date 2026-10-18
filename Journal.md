# Journal
## Phase 3

I noticed that Main is a lot simpler now because instead of calling every security method individually, it just calls one method from the Facade. This makes the All-Clear process easier since the Facade already knows what needs to be restored. If we changed the network controller to another vendor, Main wouldn't need to change as long as the Facade still provides the same commands.