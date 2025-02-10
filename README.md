This project is a refactored version of a simple adventure game that originally had all the logic inside one big class. The goal of refactoring was to follow the SOLID principles and make the code more modular and maintainable.
How the refactoring applies SOLID principles
1.	Single Responsibility Principle (SRP):
The original code had everything in one class, handling player stats, enemies, inventory, and level progression.
Now, there are separate classes for Player, EnemyManager, ItemManager, LevelManager, and Game, each handling only one part of the logic.
2.	Open/Closed Principle (OCP):
The new structure makes it easy to add new types of enemies and items without changing existing classes.
For example, if we want to add a new enemy, we can extend the Enemy class instead of modifying the whole game logic.
3.	Liskov Substitution Principle (LSP):
If new enemy or item types are added, they should work the same way as the existing ones without breaking the game.
The refactored version ensures that all enemy types follow the same behavior.
4.	Interface Segregation Principle (ISP):
Instead of having huge, overloaded classes, responsibilities are split into smaller, more focused classes.
This makes it easier to maintain and understand.
5.	Dependency Inversion Principle (DIP):
The game logic now depends on abstractions rather than concrete implementations.
This means we can swap out different implementations without affecting other parts of the game.
How to run the game:
•	Run the Game class, which will handle the game flow.
•	The player will engage in combat, pick up items, and advance through levels.
•	The game ends when the player completes all levels or loses all health.
This refactoring makes the game easier to modify, extend, and maintain.

