# Function Defination
def second_largest(nums):
    # Remove duplicates by converting to a set
    unique_nums = list(set(nums))

    # Check if there are at least two unique numbers
    if len(unique_nums) < 2:
        return None

    unique_nums.sort(reverse=True)

    # Return the second largest
    return unique_nums[1]

# Main Program
if __name__ == "__main__":
    numbers = list(map(int, input("Enter a list of integers separated by spaces: ").split()))
    result = second_largest(numbers)
    
    if result is not None:
        print("Second largest number is:", result)
    else:
        print("Not enough unique numbers to determine a second largest.")
