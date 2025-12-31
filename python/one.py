# Original array
arr1 = [2, 7, 5, 9, 5, 3, 4]

# Find max value and its index (based on original array)
max_value = arr1[0]
max_index = 0

for i in range(len(arr1)):
    if max_value < arr1[i]:
        max_value = arr1[i]
        max_index = i

# Sort array in ascending order
sorted_arr = sorted(arr1)
print("Sorted Array:", sorted_arr)

# Sort array in descending order
reverse_sorted_arr = sorted(arr1, reverse=True)
print("Reversed Sorted Array:", reverse_sorted_arr)

# Print max value and index
print("Max number of the Array:", max_value)
print(f"Max number: {max_value}'s index of the Array:", max_index)
