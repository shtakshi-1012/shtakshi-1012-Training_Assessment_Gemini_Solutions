from selenium import webdriver
from selenium.webdriver.support.ui import Select
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.chrome.options import Options
import os
import time

# Setup to suppress warnings
options = Options()
options.add_experimental_option('excludeSwitches', ['enable-logging'])

# Open dropdown.html
html_file_path = os.path.abspath("./dropdown.html")
driver = webdriver.Chrome(options=options)
driver.get("file://" + html_file_path)

# Give the browser time to load
time.sleep(1)

# Step 1: Locate the dropdowns by their name or id (replace with actual values)
day_dropdown = Select(driver.find_element("id", "dob-day"))
month_dropdown = Select(driver.find_element("id", "dob-month"))
year_dropdown = Select(driver.find_element("id", "dob-year"))

# Step 2: Select date 05-05-2005
day_dropdown.select_by_visible_text("05")
month_dropdown.select_by_visible_text("May")
year_dropdown.select_by_visible_text("2005")

# Step 3: Validate selected values
selected_day = day_dropdown.first_selected_option.text
selected_month = month_dropdown.first_selected_option.text
selected_year = year_dropdown.first_selected_option.text

assert selected_day == "05", "Day is not selected correctly"
assert selected_month == "May", "Month is not selected correctly"
assert selected_year == "2005", "Year is not selected correctly"

print(f"Selected date: {selected_day}-{selected_month}-{selected_year} ✅")

# Optional wait
time.sleep(2)

# Close browser
driver.quit()
