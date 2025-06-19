# Function Defination
def analyze_file(file_path):
    try:
        with open(file_path, 'r', encoding='utf-8') as file:
            lines = file.readlines()
            
            total_lines = len(lines)
            total_words = sum(len(line.split()) for line in lines)
            total_characters = sum(len(line) for line in lines)

            print(f"Total number of lines: {total_lines}")
            print(f"Total number of words: {total_words}")
            print(f"Total number of characters: {total_characters}")
    
    # Error Handling
    except FileNotFoundError:
        print("Error: The file was not found. Please check the path and try again.")
    except Exception as e:
        print(f"An unexpected error occurred: {e}")

# Main program
if __name__ == "__main__":
    path = input("Enter the file path: ")
    analyze_file(path)
