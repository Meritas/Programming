import csv
a=0
with open('test2.csv', newline='') as f:
    reader = csv.reader(f)
    for row in reader:    a=a+int(row[5])
    print(a)
