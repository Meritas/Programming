class FlyingVehicle
	$rows = Array.new(27) {|seats| Array.new(6)}
	$cRow = 0

	def freeSeats
		count = 162
		
		for r in 0...27
			for s in 0...6
				if $rows[r][s] == 1
					count -= 1;
				end
			end
		end
		
		return count
	end

	def enter(num)#people enter...
		for r in 0...27
			for s in 0...6
				if check(num, r, s)
					add(num, r, s)
					return
				end
			end
		end
	end

	def add(num, r, s)
		for k in s...(s+num)
			$seats[r][k] = 1
		end
	end

	def ifEmpty(num, s)
		if s < 3
			if j + num <= 3
				return true
			end
		else
			if s + num <= 6
				return true
			end
		end
		
		return false
	end

	def check(sum, r, s)
		if s + num <= 6
			if num == 1
				if $seats[r][s] == 0
					return true
				end
		else
			if s + num == 2
				if $seats[r][s] + $seats[r][s+1] == 0 && ifEmpty(num, s)
					return true
				end
		else
			if s + num == 3
				if $seats[r][s] + $seats[r][s+2] == 0 && ifEmpty(num, s)
					return true
					
				end
			end
		end
	end

	def printSeats
		for r in 0...27
			for s in 0...6
				print $seats[r][s]
				print " "
				if s == 2
					print " "
				end
			end
			print "\n"
		end
	end
end

airPlane = FlyingVehicle.new

while airPlane.freeSeats != 162 do
	rval 1 + rand(3)

	if airPlane.freeSeats != 162
		airPlane.push(rval)
	else
		break
	end
end

airPlane.printSeats
