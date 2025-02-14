## Number Guessing Game 🎯  

### Description  
This is a simple Number Guessing Game implemented in Java. The game generates a random number between 1 and 100, and the player has 5 attempts to guess it correctly. After each guess, the game provides hints to help the player guess the correct number.  

### How to Play?  
1. The game starts by generating a random number between 1 and 100.  
2. The player enters a guess.  
3. The program provides hints:  
   - "Too low" if the guessed number is smaller.  
   - "Too high" if the guessed number is larger.  
4. The player gets **5 chances** to guess the correct number.  
5. If the correct number is guessed within **5 attempts**, the player wins.  
6. If all attempts are used, the correct number is revealed, and the game ends.  
7. The player can **choose to play again or exit**.  

### Example Gameplay
```
-----------------
NEW GAME
-----------------
Pick a number between 1-100! You will get 5 turns
Player guesses 30
Sorry, that number is too low

Pick a number between 31-100! You will get 4 turns
Player guesses 50
Sorry, that number is too high

Pick a number between 31-49! You will get 3 turns
Player guesses 40
YOU WIN! The SECRET number was 40
Do you want to play again? (yes/no)
```

### Technologies Used  
- Java  
- Scanner Class (for user input)
- Math.random() (to generate random numbers)  

### How to Run the Program?
1. Compile the program using:  
   ```bash
   javac Main.java
   ```
2. Run the program using:  
   ```bash
   java Main
   ```

### Contributions 
Feel free to fork this repository and improve the game by adding new features like:  
✅ Difficulty levels  
✅ A scoring system  
✅ A graphical user interface (GUI)  
