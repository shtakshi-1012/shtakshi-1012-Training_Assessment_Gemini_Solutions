from selenium import webdriver
from selenium.webdriver.common.by import By
import os
import time

# Set up the Chrome driver
driver = webdriver.Chrome()

# Load the local Assignment.html file
html_file = os.path.abspath("Assignment.html")
driver.get("file://" + html_file)

time.sleep(1)  # Wait for the page to load

# Locate all rows in the table (excluding header if any)
rows = driver.find_elements(By.XPATH, "//table//tr")

# Extract text content from each row and store in a set to remove duplicates
row_data = set()

for row in rows:
    cells = row.find_elements(By.TAG_NAME, "td")
    if cells:  # Skip if it's a header or empty
        row_text = " | ".join([cell.text.strip() for cell in cells])
        row_data.add(row_text)

# Print unique rows
print("\n Unique Rows Found in Table:")
for i, unique_row in enumerate(row_data, start=1):
    print(f"{i}. {unique_row}")

# Close the browser
driver.quit()
