## Exercise 4: RPGInheritance

### Requirements

- Note: *No tests are required for this Exercise!*

In this exercise, you will design an inheritance hierarchy for characters in a video game. Your design must include a common base class for the following three character types:

- Farmer

- Constable

- Warrior

### Instructions

Create your solution in an IntelliJ project called (`RPGInheritance`).

- Farmer

    - Properties:
        - name
        - strength (initial value = 75)
        - health (initial value = 100)
        - stamina (initial value = 75)
        - speed (initial value = 10)
        - attackPower (initial value = 1)

    - Abilities:
        - run
        - plow
        - harvest
        - attack
        - heal
        - decreaseHealth
        - increaseStamina
        - decreaseStamina

- Constable

    - Properties
        - name
        - strength (initial value = 60)
        - health (initial value = 100)
        - stamina (initial value = 60)
        - speed (initial value = 20)
        - attackPower (initial value = 5)
        - jurisdiction

    - Abilities:
        - run
        - arrest
        - attack
        - heal
        - decreaseHealth
        - increaseStamina
        - decreaseStamina

- Warrior

    - Properties
        - name
        - strength (initial value = 75)
        - health (initial value = 100)
        - stamina (initial value = 100)
        - speed (initial value = 50)
        - attackPower (initial value = 10)
        - shieldStrength (initial value = 100)

    - Abilities:
        - run
        - attack
        - heal
        - decreaseHealth
        - increaseStamina
        - decreaseStamina
        - decreaseShieldStrength