package main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SweepstakesWithHashSet {
	private Set<String> sweepstakesHashSet = new HashSet<String>();
	
	public boolean addLotteryCode (String lotteryCode) {
		return this.sweepstakesHashSet.add(lotteryCode);
	}
	public boolean deleteLotteryCode (String lotteryCode) {
		return this.sweepstakesHashSet.remove(lotteryCode);
	}
	public boolean lotteryCodeIsExistence (String lotteryCode) {
		return this.sweepstakesHashSet.contains(lotteryCode);
	}
	public void deleteAllLotteryCode () {
		this.sweepstakesHashSet.clear();
	}

	public int getNumberLotteryCode () {
		return this.sweepstakesHashSet.size();
	}
	public String findWinner () {
		Random rd = new Random();
		int postion = rd.nextInt(this.sweepstakesHashSet.size());
		return (String)this.sweepstakesHashSet.toArray()[postion];
	}
	public void printAllLotteryCode () {
		System.out.println(Arrays.toString(this.sweepstakesHashSet.toArray()));
	}
}
