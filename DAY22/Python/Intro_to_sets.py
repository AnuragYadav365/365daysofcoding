def average(array):
    # your code goes here
    sum = 0
    set1 = set(array)
    for i in set1:
        sum += i
    avg = sum/len(set1)
    return round(avg, 3)


if __name__ == '__main__':
    n = int(input())
    arr = list(map(int, input().split()))
    result = average(arr)
    print(result)