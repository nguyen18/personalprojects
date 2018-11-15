import time
import random

#FUNCTIONS---------------------------------------------*
def test(answer):
	answer = answer.upper()
	while answer != "YES" and answer != "NO":
		print "whoops! try entering yes or no"
		answer = input()
		answer = answer.upper()
	return answer

#INTRO-------------------------------------------------*
print "Welcome to your 'REALITY CHECK'!"
print "A virtual simulation of a life"
time.sleep(2)
print
print "Will you make the right choices? Hopefully."
print
time.sleep(2)
print "Let's begin."
time.sleep(1)
print

#MENU---------------------------------------------------*
choice = "temp"
while choice != "1":
    print "WELCOME TO YOUR MENU --- please note: you cannot pause/save the game of life"
    print "PLEASE SELECT 1, 2, OR 3"
    print
    print "1: Start"
    print "2: Commands"
    print "3: About Game"

    choice = raw_input()
    if choice == "1":
        break
    if choice == "2":
        print "Use the keywords 'yes' and 'no' or option varaiables (ex: A, B, C, 1, 2, 3...etc) to progress through the game"
        print "only use custom responses when implied (ex: please type character name"

    if choice == "3":
        print "Reality Check was a text adventure was originally thought of/developed by 4 girls " \
              "in the Foster City branch of Girls Who Code."
        print "Alexis, Kirsten, Mandy, and Taylor."
        print
        print "I have decided to finish the game on my own, and this is my own take on the concept and storyline. I hope you enjoy!"
        print "-Taylor"
        print "(PROTOTYPE/ROUGH OUTLINE OF GAME--NOT FINAL PRODUCT!!) Reality check  is about a character you customize "
        print "who goes through the stages of life. You can choose the beginning difficulty through your living situation. "
        print "There will be 5 levels: childhood, young adult, your prime, mid-life crisis and road to afterlife. There will "
        print "be multiple different endings all depending on the choices you make. Your choices range from what your"
        print " relationships you make to general life choices, so choose wisely! You will choose life objectives at the beginning"
        print " of the game in order to complete throughout the game. If you complete your life goals, you win at life! :) However, "
        print "be careful! Like real life, 'Reality Check' contains random curveballs at any point in the game, so be prepared. "
        print "How will you live your life? What does happiness mean to you? And remember, where you begin may not be where you end."
    print
    time.sleep(3)
    print "Try again/Return to menu now?"
    while choice != "yes":
        print "please type yes when ready"
        choice = raw_input()
#START GAME-------------------------------------------------------------*
# CHARACTER NAME***
print "Please type your character's name"
name = raw_input()
name = name.upper()
print
print "Would you like to name your character " + name + "?"
answer = raw_input()
answer = test(answer)

while answer == "no":
    print
    print "Please input character name"
    name = raw_input()
    name = name.upper()
    print
    print("Would you like to name your character " + name + "?")
    answer = raw_input()
    answer = test(answer)

print
print("Perfect! Welcome " + name + "!")
print("Time to pick your demographics")
time.sleep(1)
print
print("Processing... Please wait")
time.sleep(2)
print("Processing... Please wait")
time.sleep(2)
print("Processing... Please wait")
time.sleep(2)
print


# DEMOGRAPHICS***
def sexPicker():
    sexes = ["boy", "girl"]
    return random.choice(sexes)


sex = sexPicker().upper()


def racePicker():
    races = ["Caucasian", "African", "Asian", "Spanish", "Pacific Islander"]
    return random.choice(races)


race = racePicker().upper()
print ("You were born as a(n) " + race + " " + sex)
print()


def levelPicker():
    levels = ["easy", "normal", "hard"]
    return random.choice(levels)


level = levelPicker().upper()
print("By society's standards, your life will start off on " + level + " mode")
richness = ""
if level == "EASY":
    richness = "RICH"

if level == "NORMAL":
    richness = "MIDDLE CLASS"

if level == "HARD":
    richness = "POOR"

print()
time.sleep(2)

# PLAYER PROFILE***
print("PLAYER PROFILE:")
print("Name: " + name)
print("Gender: " + sex)
print("Ethnicity: " + race)
print("Economic background: " + richness)
print()
time.sleep(1)
print("Ready? Let's begin!")
