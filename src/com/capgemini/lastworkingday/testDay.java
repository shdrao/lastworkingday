package com.capgemini.lastworkingday;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testDay {

	@Test
	void testLastWorkingDay() {
		assertEquals("Last Working Day is WEDNESDAY:2018-10-31", DisplayLastWorkingDay.displayDate(10, 2018));
		assertEquals("Last Working Day is FRIDAY:2018-09-28", DisplayLastWorkingDay.displayDate(9, 2018));
		assertEquals("Last Working Day is FRIDAY:2018-03-30", DisplayLastWorkingDay.displayDate(3, 2018));
		assertEquals("Last Working Day is FRIDAY:2018-11-30", DisplayLastWorkingDay.displayDate(11, 2018));
	}

}
