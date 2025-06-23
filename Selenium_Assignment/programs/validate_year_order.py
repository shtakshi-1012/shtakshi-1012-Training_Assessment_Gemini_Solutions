from selenium import webdriver
from selenium.webdriver.support.ui import Select
from selenium.webdriver.chrome.options import Options
import os
import time

# Optional: to suppress ChromeDriver logs
options = Options()
options.add_experimental_option('excludeSwitches', ['enable-logging'])

# Load dropdown.html
html_file_path = os.path.abspath("./dropdown.html")
driver = webdriver.Chrome(options=options)
driver.get("file://" + html_file_path)
time.sleep(1)

# Select and validate date
day_dropdown = Select(driver.find_element("id", "dob-day"))
month_dropdown = Select(driver.find_element("id", "dob-month"))
year_dropdown = Select(driver.find_element("id", "dob-year"))

day_dropdown.select_by_visible_text("05")
month_dropdown.select_by_visible_text("May")
year_dropdown.select_by_visible_text("2005")

selected_day = day_dropdown.first_selected_option.text
selected_month = month_dropdown.first_selected_option.text
selected_year = year_dropdown.first_selected_option.text

assert selected_day == "05"
assert selected_month == "May"
assert selected_year == "2005"

print(f"Selected Date: {selected_day}-{selected_month}-{selected_year}")

# -------------------------------
# Step 3: Validate year order
# -------------------------------

# Get all year <option> values
year_options = year_dropdown.options
year_values = [int(option.text) for option in year_options if option.text.isdigit()]

# Check if list is in ascending order
if year_values == sorted(year_values):
    print("Year dropdown is in ascending order.")
else:
    print("Year dropdown is NOT in ascending order.")

# Optional wait to observe result
time.sleep(2)
driver.quit()
