require 'csv'

f_name = "feature_scenarios_times.csv"
f_name2 = "izpit_result.txt"

count = 0

 File.open(f_name2, 'w') do |f2|  
    CSV.foreach(f_name) do |row|
        if row[1] == "features/facebook_share.feature"
            count += row[0].to_f
        end
    end
 f2.puts count.to_s
 end         


