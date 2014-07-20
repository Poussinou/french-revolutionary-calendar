/*
 * French Revolutionary Calendar Library
 * 
 * Copyright (2012-2014) Carmen Alvarez
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301
 */
package ca.rmen.lfrc;

import java.io.FileNotFoundException;

import junit.framework.TestCase;

/**
 * These tests make sure that we have the correct names for the days in the year.
 * 
 */
public class FrenchRevolutionaryCalendarDaysOfYearTest extends TestCase {

    public FrenchRevolutionaryCalendarDaysOfYearTest(String name) throws FileNotFoundException {
        super(name);
        System.out.println(name);
    }

    protected void setUp() {}

    protected void tearDown() {}

    public void testNumberOfDaysOfYearFR() throws Exception {
        assertEquals(FrenchRevolutionaryCalendar.DAY_OF_YEAR.length, 13);
        for (int i = 0; i < 12; i++) {
            assertEquals(FrenchRevolutionaryCalendar.DAY_OF_YEAR[i].length, 30);
        }
        assertEquals(FrenchRevolutionaryCalendar.DAY_OF_YEAR[12].length, 6);
    }

    public void testNumberOfDaysOfYearEN() throws Exception {
        assertEquals(FrenchRevolutionaryCalendar.DAY_OF_YEAR_EN.length, 13);
        for (int i = 0; i < 12; i++) {
            assertEquals(FrenchRevolutionaryCalendar.DAY_OF_YEAR_EN[i].length, 30);
        }
        assertEquals(FrenchRevolutionaryCalendar.DAY_OF_YEAR_EN[12].length, 6);
    }

}
