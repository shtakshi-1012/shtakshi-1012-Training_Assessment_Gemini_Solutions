from selenium import webdriver
import os
import time
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.chrome.options import Options

# Setup to suppress warnings
options = Options()
options.add_experimental_option('excludeSwitches', ['enable-logging'])

# Open dropdown.html
html_file_path = os.path.abspath("./dropdown.html")
driver = webdriver.Chrome(options=options)
driver.get("file://" + html_file_path)


# Wait for a few seconds so the page stays open
time.sleep(5)

# Close the browser
driver.quit()
