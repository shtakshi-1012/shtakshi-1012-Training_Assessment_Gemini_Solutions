from selenium import webdriver
from selenium.webdriver.common.by import By
import time
import pandas as pd

# Launch Chrome
driver = webdriver.Chrome()

# Open ECI results page (you can replace constituency/state ID in URL later)
url = "https://results.eci.gov.in/ResultAcGenMar2022/ConstituencywiseS0510.htm?ac=10"
driver.get(url)

time.sleep(3)  # Let page load fully

# Extract Constituency name
constituency_name = driver.find_element(By.CLASS_NAME, "heading").text.strip()

# Locate the result table
rows = driver.find_elements(By.XPATH, "//table[@class='table-party']//tr")

data = []

for row in rows[1:]:  # skip header
    cells = row.find_elements(By.TAG_NAME, "td")
    if len(cells) >= 4:
        candidate = cells[0].text.strip()
        party = cells[1].text.strip()
        votes = cells[2].text.strip().replace(",", "")
        percentage = cells[3].text.strip().replace("%", "")
        data.append([constituency_name, candidate, party, int(votes), float(percentage)])

driver.quit()

# Convert to DataFrame
df = pd.DataFrame(data, columns=["Constituency", "Candidate", "Party", "Votes", "Percentage"])

# Save to Excel
excel_file = "eci_results_ac10.xlsx"
df.to_excel(excel_file, index=False)

print(f"Data saved to {excel_file}")
