f = File.open("Sheet1.csv", "r")

content = f.read
python = 0
ruby = 0
java = 0
content.each_line do |line|
array = line.split(",")
	if array[2] == "Ruby\n" 
		ruby += array[1].to_i
		end
	if array[2] == "Python\n"
		python += array[1].to_i
		end
	if array[2] == "Java\n"
		java += array[1].to_i
		end
	end

p python
p ruby
p java
