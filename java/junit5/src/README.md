/*

Black Friday Deals: Given a deal with id, product name and price. Build a history of N most recently viewed deals with the following

1) constructor
2) get method to return a deal if exists
3) add/update method to add/update a deal into history


Deal
id
name
price

Deals: 1, 2, 3, 4, 5

0      t
[1 2 1 3]

[]

view: 1 -> [1]
view: 2 -> [2 1]
view: 3 -> [3 2 1]
view: 2 -> [2 3 1]

View
deal

*/

