import random

def comparison_count_sort(unordered_lst):
    """Sorts a list by comparison counting.

       pre: unordered_lst is an unordered list of numbers
       post: sorted_lst which comprises of unordered_lst's elements
             sorted in an increasing order.
    """

    lst_size = len(unordered_lst)

    # create a list of counts, and a list to create a sorted list
    # append zeros to count_lst and sorted_lst to make them of lst_size
    count_lst = [0 for i in range(lst_size)]
    sorted_lst = [0 for i in range(lst_size)]

    # count how many numbers are smaller/greater than each number
    for i in range(lst_size - 1):    

        for j in range(i + 1, lst_size):

            # increase count of item which is larger
            if unordered_lst[i] < unordered_lst[j]:
                count_lst[j] += 1

            else:
                count_lst[i] += 1

    #assign values to sorted_lst by index based on their count_lst values
    for i in range(lst_size):
        sorted_lst[count_lst[i]] = unordered_lst[i]

    return sorted_lst

def main():
    lst_size = int(input("Enter the list size: "))
    unordered_lst = []
    num = len(list(str(lst_size))) - 1
    
    for i in range(lst_size):
            unordered_lst.append(round(random.random() * (10 ** random.randrange(0, num)), 2))
    
    print(comparison_count_sort(unordered_lst))

main()