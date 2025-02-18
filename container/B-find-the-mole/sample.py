# returns the name of the mole
# datapoints is a list of tuples, where the first element is a string and the second element is the number of missions
def find_mole(datapoints):
    #### WRITE CODE HERE ####
    pass




















# parsing code, DO NOT MODIFY
testcases = int(input())
for _ in range(testcases):
    num_datapoints = int(input())
    datapoints = []
    for _ in range(num_datapoints):
        datapoint = input().split(",")
        datapoints.append((datapoint[0], int(datapoint[1])))
    print(find_mole(datapoints))
