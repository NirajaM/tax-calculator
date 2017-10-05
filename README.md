Problem statement This assessment consists in writing a simple application that prints out the details of a receipt containing items purchased by a customer. The receipt should list the number of items, the name, the final price (including taxes) of each of the item purchased, plus two extra lines showing the total amount of the receipt and the total amount of taxes.

Taxes are calculated with a rate of 17.5%, rounding the tax result to the upper 0.05. Please note that medical products are exempt and an additional 1.25 fixed amount is added as an extra tax on CDs

Input JSON: 

[
  {
    "name": "book",
    "type": "OTHERS",
    "quantity": 1,
    "price": 29.49
  },
  {
    "name": "music",
    "type": "CD",
    "quantity": 1,
    "price": 15.99
  },
  {
    "name": "chocolate snack",
    "type": "OTHERS",
    "quantity": 1,
    "price": 0.75
  }
]

Output JSON:

{
  "purchases": [
    {
      "item": {
        "name": "book",
        "type": "OTHERS",
        "quantity": 1,
        "price": 29.49
      },
      "taxes": 5.2,
      "total": 34.7
    },
    {
      "item": {
        "name": "music",
        "type": "CD",
        "quantity": 1,
        "price": 15.99
      },
      "taxes": 4.05,
      "total": 20.05
    },
    {
      "item": {
        "name": "chocolate snack",
        "type": "OTHERS",
        "quantity": 1,
        "price": 0.75
      },
      "taxes": 0.15,
      "total": 0.9
    }
  ],
  "taxes": 9.35,
  "total": 55.6
}
