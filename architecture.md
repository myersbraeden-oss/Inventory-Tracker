Plan: inventory tracking system that allows users to add items to the inventory list, store that information, allow users to change inventory name and price, tracks item quantity upon sale and delivery of items and allows item lookup using name and or the item's associated code. Allow users to add a photo and description for each item. I want the system to also be user friendly. When users open the app, it should ask the user what he wants to do and he can select a prompt, such as check inventory or update price or quantity of an item. The prompts should be common commands that streamline the inventory process. Later, I'd like to add a reporting feature that shows expected quantity versus actualy quantity so owners can track inventory loss and account for those disparities in their revenue. Deliveries also need to be confirmed before quantities are updated.

Classes: 
1) Main
2) Items
3) SearchTool
4) InventoryService
5) PromptGuide
6) Menu
7) Users
8) UserRepository
9) InventoryTransaction
10) TaxCategory
11) TaxCalculator

Objects: Items

code flow: user opens app> app says "What would you like to do?" followed by a brief list of common commands> user selects one prompt> app takes user to the necessary page> user performs task and closes the app or returns home to perform another task. Users also have the option to select pages from a menu. Only certain users can change certain details about items. Manager can grant permissions or revoke permissions to other users.
