
from random import *

def show_flashcard():
    """ Show the user a random word and ask them
        to define it. Show the definition
        when the user presses return.    
    """
    random_key = choice(list(glossary))
    print('Define: ', random_key)# Define box for example 
    input('Press return to see the flashcard')
    print(glossary[random_key])
    
#Instead of having just word or definition I decided to reflect a dictionary style program with objects and places for example. 
glossary = {'Paris':'The captial city of France',
            'Bicycle':'A two wheeled human powered land vehicle',
            'Box':'A container with a flat base and sides that enables the safe storage of an item'}

# Entering s and enter for flashcard would show paris and its definition, and entering m for more options leads to the show definition loop and quit program.
exit = False
while not exit:
    user_input = input('Enter s to show a flashcard, or enter m for more options: ') 
    if user_input == 'm':
        exit = True
    elif user_input == 's':
        show_flashcard()
    else:
        print('You need to enter either s, or m.')

from random import *

def show_definition():
    """ Show the user the definition of the flashcard without entering
entering the first string.    
    """
    random_key = choice(list(glossary))
    print('Definition: ', random_key)# Shows the definition of a box. 
    input('Press enter to see the flashcard')
    print(glossary[random_key])

# Changed to the opposite way from the first glossary to reflect the definition of paris for example.    
glossary = {'The captial city of France':'Paris',
            'A two wheeled human powered land vehicle':'Bicycle',
            'A container with a flat base and sides that enables the safe storage of an item':'Box'}

# This interactive loop ehas been designed go through the show_definition cycle after the user inputs 'm' for more options. 
exit = False
while not exit:
    user_input = input('Enter d to show definition, or q to quit: ')
    if user_input == 'q': 
        exit = True
    elif user_input == 'd':
        show_definition()
    else:
        print('You need to enter either d, or q.')
        
                       
