import random
print("Heitetään kolikkoa viidesti:")
for line in range (5):
    luku = random.randint(0,1)
    if luku == 0:
        print("Klaava!")
    if luku == 1:
        print("Kruuna!")