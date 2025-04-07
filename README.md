# OOP2 - Homework

This project is part of the **Object-Oriented Programming 2** course. It consists of two assignments:


# Svemir Simulator

This project simulates a **universe** with various **celestial bodies** (like comets) moving across the screen. The simulation involves dynamic object generation, rendering, and movement, and demonstrates the use of Java's graphical and threading capabilities.

## Key Features

- **Generator**: A class that generates random celestial bodies (like comets) and adds them to the universe.
- **NebeskoTelo (CelestialBody)**: An abstract class representing celestial bodies in space (such as comets), with properties like position and radius.
- **Kometa (Comet)**: A subclass of `NebeskoTelo`, representing a comet, and providing the logic to render it as a polygon.
- **Simulator**: A GUI application that allows the user to start the simulation and see celestial bodies moving across the screen.
- **Svemir (Universe)**: A canvas that displays the celestial bodies and controls their movement over time using a separate thread.

### Concepts Demonstrated

- **Classes and Inheritance**: The project uses object-oriented principles with classes like `NebeskoTelo` (CelestialBody) and `Kometa` (Comet), demonstrating inheritance and method overriding.
- **Threading**: The simulation runs on a separate thread (`Svemir` and `Generator`), handling movement and object generation asynchronously.
- **Graphics and Rendering**: The project uses Java's AWT library for rendering celestial bodies on a graphical canvas.
- **Synchronization**: Threads are properly synchronized to ensure thread safety when adding new celestial bodies to the universe.

### Key Classes

1. **Generator**: Generates random comets and adds them to the universe. It runs in its own thread.
2. **NebeskoTelo**: Abstract class representing celestial bodies (comets, planets, etc.). It contains properties like position and radius.
3. **Kometa**: Subclass of `NebeskoTelo`, specifically for comets. It overrides the `iscrtaj` method to render the comet as a polygon.
4. **Svemir**: The universe class that holds all celestial bodies and updates their positions over time.
5. **Simulator**: The main graphical user interface (GUI) for starting the simulation and controlling the simulation's execution.

### Example Usage

1. **Start the simulation**: Press the "Pokreni!" button in the simulator window to start generating comets and move them across the screen.
2. **Celestial bodies**: Comets are generated at random positions with random sizes and move vertically across the screen.

### Technologies Used

- Java (AWT for graphics and threading)

# Energetski Sistem

This project simulates an **energy system** where energy producers (such as hydroelectric power plants) generate energy to charge batteries. The simulation involves managing a **grid of plots** where energy producers are placed, and each producer interacts with the environment, such as water surfaces, to generate power.

## Key Features

1. **Baterija (Battery)**:
   - Manages energy storage with methods to charge and drain energy, and checks if the battery is full.

2. **EnergetskiSistem (Energy System)**:
   - Manages the entire energy system, including energy producers and the grid layout.
   - Displays the energy system in a GUI, allowing interaction with producers and energy sources.

3. **Hidroelektrana (Hydroelectric Power Plant)**:
   - A type of energy producer that generates energy based on nearby water surfaces.
   - Can be placed on the grid, where it produces energy and charges the connected battery.

4. **Parcela (Plot)**:
   - A graphical representation of a plot on the grid, which can either be a **TravnataPovrs (Grass Surface)** or **VodenaPovrs (Water Surface)**.
   - Water surfaces interact with hydroelectric power plants to enable energy generation.

5. **Plac (Grid)**:
   - Represents the grid of plots. The user can add producers to the grid and interact with them by clicking on the plots.
   - The grid updates energy generation based on the proximity of hydroelectric plants to water surfaces.

6. **Proizvodjac (Energy Producer)**:
   - An abstract class for all energy producers. It defines the basic structure for generating energy and updating the battery.

### Concepts Demonstrated

- **Object-Oriented Programming**: The project demonstrates the use of **classes**, **inheritance**, and **polymorphism**. For example, `Hidroelektrana` inherits from `Proizvodjac` and implements the energy production functionality.
- **Threading**: The simulation uses threads to manage energy production and updates in real-time.
- **Event-Driven Programming**: User interactions are handled through event listeners (e.g., clicking on a plot to add an energy producer).
- **Graphical User Interface**: The GUI is built using Java AWT, allowing for dynamic updates of the energy system.

### Example Usage

1. **Start the Simulation**: The energy system GUI is initialized with a grid of plots. Users can add hydroelectric plants by clicking on the grid.
2. **Energy Production**: The hydroelectric plant generates energy based on the nearby water surface. This energy is used to charge the battery.

### Technologies Used

- Java (AWT for graphics and threading)
