require 'csv'

f_name = ARGV[0]
f_name2 = "{" + f_name[0...f_name.length-4] + "}_result_ruby.csv"

CSV.open(f_name2, "w") do |csv|
	CSV.foreach(f_name) do |row|
		rnd = rand(row[1].to_i)+1
		while rnd.to_i > (row[1].to_i/2).to_i
			rnd = rand(row[1].to_i)+1
			rnd2 = rand(row[1].to_i)+2
			rnd -=  rnd2
		end
		csv << [row[0].to_i, row[1].to_i, rnd.to_i]
	end
end


