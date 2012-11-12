import csv
a=0
b=0
with open('test.csv', newline='') as f:
    reader = csv.reader(f)
    for row in reader:
        if row[2] == "Ruby":    a=a+int(row[1])
        elif row[2] == "Python": b=b+int(row[1])
        print("Ruby: ", a)
        print("Python ", b)

