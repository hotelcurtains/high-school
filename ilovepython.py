from turtle import Turtle
t=Turtle()
t.speed(2)

#head shape
for i in range(4):
	t.forward(20)
	t.left(45)
t.forward(40)
for i in range(4):
	t.left(45)
	t.forward(20)

#right ear
t.penup()
t.home()
t.setheading(90)
t.forward(48)
t.setheading(0)
t.forward(5)
t.left(45)
t.pendown()
t.forward(30)
t.right(125)
t.forward(33)

#left ear
t.penup()
t.home()
t.setheading(90)
t.forward(48)
t.setheading(180)
t.forward(5)
t.right(45)
t.pendown()
t.forward(30)
t.left(125)
t.forward(33)

#right eye
t.penup()
t.home()
t.setheading(90)
t.forward(25)
t.right(90)
t.forward(10)
t.pendown()
t.circle(8)

#left eye
t.penup()
t.home()
t.setheading(90)
t.forward(25)
t.left(90)
t.forward(10)
t.right(180)
t.pendown()
t.circle(8)

#nose
t.penup()
t.home()
t.setheading(90)
t.forward(17)
t.left(90)
t.forward(3)
t.setheading(0)
t.pendown()
t.forward(5)
t.left(120)
t.forward(5)
t.left(120)
t.forward(5)

#right mouth
t.penup()
t.home()
t.setheading(90)
t.forward(17)
t.right(180)
t.pendown()
t.forward(5)
t.left(45)
t.forward(5)

#left mouth
t.penup()
t.home()
t.setheading(90)
t.forward(17)
t.right(180)
t.pendown()
t.forward(5)
t.right(45)
t.forward(5)

#all artists sign their work
t.penup()
t.home()
t.setheading(270)
t.forward(30)
t.pendown()
t.write("\"i love python\" - dan", font=('Comic Sans MS', 9, 'italic'), align="center")

#bye
t.hideturtle()