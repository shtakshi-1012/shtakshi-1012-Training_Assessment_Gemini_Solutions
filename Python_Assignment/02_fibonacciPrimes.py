def is_prime(n):
    # Filtering Prime numbers
    if n < 2:
        return False
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            return False
    return True

def fibonacci_primes_upto_n(N):
    # Fibonacci sequence generation
    fib_sequence = []
    a, b = 0, 1
    while a <= N:
        fib_sequence.append(a)
        a, b = b, a + b

    print(f"Fibonacci sequence up to {N}:")
    print(fib_sequence)

    prime_fibs = [num for num in fib_sequence if is_prime(num)]

    print("\nPrime numbers in the Fibonacci sequence:")
    print(prime_fibs)

# Main Program
if __name__ == "__main__":
    N = int(input("Enter the value of N: "))
    fibonacci_primes_upto_n(N)
