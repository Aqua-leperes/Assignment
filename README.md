# Invoice Generator – README

## Overview

This is a Java console-based Invoice Generator program.  
It allows the user to enter:

- Bill To customer details  
- Ship To customer details  
- 7 different products, each with:  
  - Product code  
  - Product name  
  - HSN code  
  - Quantity  
  - Units  
  - Rate  
  - Tax percentage  

The program then calculates:

- Amount for each item  
- Total before discount  
- Discount (0.6368%)  
- Final Grand Total  

Finally, it prints a formatted Sales Invoice on the console.

---

## How It Works

1. The program uses a `Scanner` to read input.
2. You enter customer details.
3. You enter all product details for 7 products.
4. The program multiplies each item’s **quantity × rate**.
5. All item totals are added.
6. Discount is applied.
7. A full invoice prints out.

---

## Calculations

For each product:


Totals:


--

---

## How to Run the Program

### 1. Install Java
You need JDK 17 or higher installed.

Check Java version:


### 2. Compile the Program


### 3. Run It


---

## Input Requirements

The program will ask for:

### Bill To:
- Name  
- Address  
- City  
- Contact  
- Email  
- GSTIN  

### Ship To:
- Name  
- Address  
- City  
- Contact  
- Email  
- GSTIN  

### Product Details (7 times):

| Field | Description |
|-------|-------------|
| Code | Product code |
| Name | Product name |
| HHSN | Harmonized System Number |
| Quantity | Integer |
| Units | e.g., "nos" |
| Rate | Price per unit |
| Tax % | GST or VAT % |

---

## Example Output


---

## Known Limitations

- Product count is fixed at 7.
- Does not calculate tax amount separately.
- Formatting depends on console width.
- No input validation.

---

## Future Improvements

- Use loops/arrays to remove repetition  
- Add tax breakdown per item  
- Export invoice as PDF  
- Add GUI using JavaFX or Swing  
- Apply currency formatting  

