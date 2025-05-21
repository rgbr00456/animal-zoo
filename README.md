# 🐘 Zoo Animal Management System

A Java application for managing zoo animals with specific behaviors and characteristics. Demonstrates OOP concepts including inheritance, interfaces, and polymorphism.

![Java](https://img.shields.io/badge/Java-17-blue)
![OOP](https://img.shields.io/badge/Paradigm-OOP-brightgreen)

## 🌟 Features
- **3 Animal Types**
  
  `Tiger` | `Dolphin` | `Penguin`
  
- **Core Functionalities**
    
  ✅ Create animals with custom properties  
  ✅ Set/display physical attributes (weight, height, age)  
  ✅ Animal-specific behaviors:
   
  - 🐅 Tigers: Roar, walk
  - 🐬 Dolphins: Swim
  - 🐧 Penguins: Swim, waddle
    
- **Interactive CLI Menu**
  
  📋 Multi-level menu system for user interaction

## 🛠️ Tech Stack

- **Core**: Java 17
- **Paradigms**: OOP (Inheritance, Interfaces, Polymorphism)
- **Tools**: Maven/Gradle compatible

## 🚀 Getting Started

### Prerequisites
- JDK 17+
- Terminal/IDE (IntelliJ/Eclipse recommended)

### Installation
```bash
git clone https://github.com/yourusername/zoo-animal-system.git
cd zoo-animal-system
javac -d bin src/*.java
java -cp bin Main
```

---

# 📂 Project Structure

```
zoo-animal-system/
├── src/
│   ├── Main.java            # Entry point with menu system
│   ├── Animal.java          # Abstract base class
│   ├── Tiger.java           # Implements Walk + Eat
│   ├── Dolphin.java         # Implements Swim + Eat
│   ├── Penguin.java         # Implements Swim + Walk
│   ├── Eat.java             # Interface: eatingFood(), eatingCompleted()
│   ├── Walk.java            # Interface: walking()
│   └── Swim.java            # Interface: swimming()
```
---

# 🖥️ Usage Example

```
******* ZOO MENU *******
1. Tiger
2. Dolphin
3. Penguin
Choose an animal: 3

Penguin name: Pingu
Color: Black
Swim speed (km/h): 7.5

******* DETAILS MENU *******
1. Set properties
2. Display properties
3. Display movement
4. Feed animal
Choice: 4

Pingu is eating fish.
Pingu finished eating.
```
---

# 🧪 Testing

## Test cases validate:

- Class property existence

- Interface implementation

- Method signatures

---

# 🤝 Contributing

- Fork the project

- Create your feature branch (git checkout -b feature/amazing-feature)

- Commit changes (git commit -m 'Add amazing feature')

- Push to branch (git push origin feature/amazing-feature)

- Open Pull Request

---

# 📄 License

MIT License - see LICENSE

---

# 📧 Contact
Developer: Ricardo Pedrosa

Email: rpramos2005@gmail.com

Project Link: https://github.com/rgbr00456/animal-zoo
