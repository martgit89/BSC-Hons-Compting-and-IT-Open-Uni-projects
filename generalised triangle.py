from turtle import*

def draw_triangle(length):
    """Draw an eqilateral triangle with sides of length units"""
    for sides in range(0,3):
        forward (length)
        left (120)

# Draw a triangle with sides of 60 units
draw_triangle(60)

# Move to position for second triangle
penup()
forward (100)
pendown()

#Draw a triangle with sides of 70 units
draw_triangle(70)

# Move to position for third triangle
penup()
left(180)
forward(100)
right(90)
forward(100)
right(90)
pendown()

# Draw triangle with sides of 80 units
draw_triangle(80)

