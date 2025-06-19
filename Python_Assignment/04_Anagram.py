import re

# Function Defination
def is_valid_anagram(str1, str2):
    # Remove non-alphanumeric characters and convert to lowercase
    clean_str1 = re.sub(r'[^a-zA-Z0-9]', '', str1).lower()
    clean_str2 = re.sub(r'[^a-zA-Z0-9]', '', str2).lower()

    # Check if sorted characters of both strings are equal
    return sorted(clean_str1) == sorted(clean_str2)

# Main Program
if __name__ == "__main__":
    s1 = input("Enter the first string: ")
    s2 = input("Enter the second string: ")

    if is_valid_anagram(s1, s2):
        print("The strings are valid anagrams.")
    else:
        print("The strings are not anagrams.")
