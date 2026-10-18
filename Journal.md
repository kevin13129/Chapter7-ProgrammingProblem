# Journal
## Phase 1

From what I understand, the Adapter Pattern allows the dashboard to communicate with an older firewall without needing to know how its methods work. Instead of changing the LegacyFirewall class, the adapter translates the calls for us. This follows the Principle of Least Knowledge because the dashboard only needs to know about the SecurityLog interface, making it easier to work with different devices.