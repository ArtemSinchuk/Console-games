# Island Survival Game

Welcome to the **Island Survival Game**! This is a text-based survival game where your goal is to gather resources, craft tools, and ultimately build a boat to escape the island. Along the way, you'll complete various advancements and challenges. 

## Gameplay Overview

You start the game stranded on an island with only a knife in your inventory. You can use this knife to chop trees and gather wood. As you gather resources, you can craft better tools, such as axes and pickaxes, which will help you gather resources more efficiently.

As you progress, you can unlock and complete various advancements, which are in-game achievements that track your progress. The ultimate goal is to build a boat and escape the island, but if you're up for a challenge, you can try to complete all the advancements before crafting the boat.

## How to Play

1. **Start the Game**: 
   - Run the `MainClass` to start the game.
   - Enter your nickname when prompted.

2. **Game Instructions**:
   - The game will provide you with instructions on how to play. You'll be told that instruments are stackable and that crafting a boat will end the game. If you wish to continue playing and completing advancements, do not craft the boat right away.

3. **Actions**:
   - You will be prompted to choose your actions:
     1. Chop a tree
     2. Mine stone
     3. Craft items
     4. View your inventory
     5. View your profile
     6. View your advancements

4. **Advancements**:
   - As you progress through the game, you will unlock various advancements based on your actions, such as collecting your first wood, stone, or iron, or crafting a boat. There are also special challenges like collecting 1000 units of wood, stone, or iron, and reaching level 50.

5. **Escape the Island**:
   - Once you've gathered enough wood, you can craft a boat and escape the island, winning the game. 

## Classes and Structure

### `MainClass`
The main class that runs the game loop. It handles user input and manages the flow of the game.

### `Player`
This class represents the player character. It manages the player's inventory, experience, level, and interactions with the game world.

### `Resources`
This class tracks the player's collected resources, such as wood, stone, iron, gold, and fiber.

### `Crafting`
This class handles crafting mechanics. It allows the player to craft various tools and the boat necessary to escape the island.

### `Items`
This class tracks special items that the player can craft, like the boat.

### `Advancements`
This class tracks and manages the player's progress through various in-game achievements.

### `Instruments`
This class manages the player's tools, such as axes and pickaxes. It handles adding tools to the inventory and using them during resource gathering.

### `Axe` and `Pickaxe`
These classes represent specific tools that the player can craft and use. They include properties like durability and efficiency.

## Advancements

Advancements are a core part of the game. They track your progress and reward you for reaching specific milestones. Here are the advancements you can unlock:

- **My First Wood**: Collect 1 wood.
- **My First Stone**: Collect 1 stone.
- **My First Iron**: Collect 1 iron.
- **Escape**: Craft a boat and escape the island.
- **Wooden Pile**: Collect 1000 wood.
- **Stone Reserve**: Collect 1000 stone.
- **Iron Supply**: Collect 1000 iron.
- **Survivalist**: Level up to 50.
- **Ultra-Survivalist**: Complete all advancements.
---
