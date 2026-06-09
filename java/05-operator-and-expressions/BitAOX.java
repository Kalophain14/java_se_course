/*
Bitwise operators = they can only perfomed on integer values (doesnt work on float and double)

Works only on byte, short, int & long

AND & = Sets each bit to 1 if both corresponding bits are 1.
OR | = Sets each bit to 1 if at least one corresponding bit is 1.
INVERTS ~ = Inverts all bits.
XOR (exclusive or) ^ = Sets each bit to 1 if only one of the corresponding bits is 1.
RIGHT SHIFT >> Shifts bits right, preserving the sign bit.
LEFT SHIFT << Shifts bits left, filling new positions with zeros.
UNSIGNED RIGHT SHIFT >>> Shifts bits right, filling new positions with zeros.

int x = 10, y = 6, 3;

// Binary form example
x = 0 0 0 0 1 0 1 0
y = 0 0 0 0 0 1 1 0

result = x & y (AND OPERATORS)
r = 0 0 0 0 0 0 1 0 (bit 10)

result2 = x | y (OR OPERATORS)
r2 = 0 0 0 0 1 1 1 0 (bit 14)

result3 = x ^ y (XOR Operators)
r3 = 0 0 0 0 1 1 0 0 (bit 12)

 */