#  Arimaa – Java Game

**Arimaa** is a strategic, turn-based board game that has logic, spatial thinking, and long-term planning. Inspired by chess but designed to be impossible to brute-force usign AI, Arimaa is played on an 8×8 board with animal-themed pieces, each with own strength and movements.

This Java implementation has main focus on **low-level logic and modular architecture**, as well as UI implementation in CSS. The game supports both **Human vs Human** and **Human vs AI** modes.

---

##  Features

- **Player Roles**  
  Two players (White and Black) take turns. Play against another human or a basic AI opponent.

- **Custom Game Engine**  
  Animal pieces (Rabbit, Cat, Dog, Horse, Camel, Elephant) are implemented using a  `Piece` class, with appropriate strength and movement logic.

- **Game Mechanics**
  - Dynamic move generation per piece.
  - Directional movement restrictions for Rabbits.
  - Strength-based rules and board constraints enforced via the `Board` class.

- **Board Management**  
  Tracks piece positions, tile availability, and move validation manually — no external engine.

- **Turn Management & Timer**  
  Each player has a built-in `Timer`, supporting future enhancements like timed moves.

- **AI Support**  
  The `AIPlayer` class provides the structure for automated opponent logic (basic implementation).

- **JavaFX GUI**  
  The game features a graphical interface built with JavaFX and CSS, including a main menu and interactive board.

- **Extensible Design**  
  Modular architecture makes it easy to extend features — such as smarter AI, advanced rules (freezing, trapping), or saving/loading games.

---

##  Technical Highlights

- Focus on **low-level, C-style logic**: manual tile tracking, position math, and move validation.
- Core components:  
  - `Position`, `Piece`, `Board`, `Move`, `Player`, `Timer`, `Game`
- Follows **clean OOP principles**, with clear class separation and modularity.

---

##  Technologies Used

- Java 21+
- JavaFX
- CSS
- Object-Oriented Programming
- Basic AI design pattern

