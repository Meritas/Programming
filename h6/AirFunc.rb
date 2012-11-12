require 'csv'


@m_row = 0
@mx_row = 27
@seats = Array.new(27) { Array.new(6){0} }
@s_lines = Array.new(2){3}
@g_size = 3

@sum = 0
@g_size2 = @g_size

@f_name = "AirFunc_report.csv"

	def print_seats
		CSV.open(@f_name, "w") do |csv|
			for r in 0...27
				str = Array.new(@s_lines.size)
				csv <<([r+1])
				pointer = 0
				for c in 0...6
					print @seats[r][c]
					if c == 2
						print " "
					end
				end
				print "\n"
			for i in 0...@s_lines.size
				pointer2 = pointer
				pointer += @s_lines[i]
				for i2 in (pointer-1).downto(pointer2)
					p "asfasf"
					if i2 == pointer-1
						string = (@seats[r][i2]).to_s
						p string
						next
					end
					string>>(@seats[r][i2]).to_s
				end
				
			end
			end
		end
		
	end 

	def add_seats
		while @sum < 162
			@g_size2 = @g_size
			rvalue = 1 + rand(@g_size)
			if @sum + rvalue > 162
				next
			end
			@sum += rvalue
			distribute(rvalue)
			if @g_size2 != @g_size
				@sum -= rvalue
				next
			end
			print "\n"
			p rvalue.to_s + " passengers have entered the airplane."
			print_seats
			p (162-@sum).to_s + ' seats remaining.'
		end
	end

	def distribute(group)
		for m_rowT in @m_row...@mx_row
			if group == 1 and m_rowT != @m_row
				@m_row += 1
			end
			pointer = 0-@s_lines[0]
			for i in 0...@s_lines.length
				pointer += @s_lines[i]
				if group > @s_lines[i]
					next
				end
				res = seats_taken(pointer, i, m_rowT)
				if group > @s_lines[i] - res
					next
				end
				p_res = pointer+res
				for i2 in p_res...(p_res+group)
					@seats[m_rowT][i2] = 1
				end
				return
			end
		end
			@g_size = group-1
			return
	end
	
	def seats_taken(pointer,i,m_rowT)
		counter = 0
		for i3 in pointer...(pointer+@s_lines[i])
			if @seats[m_rowT][i3] == 1
				counter += 1
			end
		end
		return counter
	end



add_seats
