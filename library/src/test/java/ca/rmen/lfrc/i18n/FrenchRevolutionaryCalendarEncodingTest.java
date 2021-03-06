/*
 * French Revolutionary Calendar Library
 * 
 * Copyright (c) 2012-2014 Carmen Alvarez
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
package ca.rmen.lfrc.i18n;

import java.io.FileNotFoundException;

import junit.framework.TestCase;

/**
 * These tests make sure that the weekday names and month names are encoded in UTF-8
 * 
 */
public class FrenchRevolutionaryCalendarEncodingTest extends TestCase {

    public FrenchRevolutionaryCalendarEncodingTest(String name) throws FileNotFoundException {
        super(name);
        System.out.println(name);
    }

    protected void setUp() {}

    protected void tearDown() {}

    public void testEncodingWeekday() {
        assertEquals("D\u00e9cadi", FrenchRevolutionaryCalendarLabelsFR.WEEKDAYS[9]);
    }

    public void testEncodingMonth() {
        assertEquals("Niv\u00f4se", FrenchRevolutionaryCalendarLabelsFR.MONTHS[3]);
    }

    public void testEncodingDayOfYear() {
        assertEquals("M\u00e9l\u00e8ze", FrenchRevolutionaryCalendarLabelsFR.DAY_OF_YEAR[6][16]);
    }

    public void testEncodingES() {
        assertEquals("Azafr\u00e1n", FrenchRevolutionaryCalendarLabelsES.DAY_OF_YEAR[0][1]);
    }

    public void testEncodingCA() {
        assertEquals("Niv\u00f3s", FrenchRevolutionaryCalendarLabelsCA.MONTHS[3]);
    }

    public void testEncodingIT() {
        assertEquals("Primid\u00ec", FrenchRevolutionaryCalendarLabelsIT.WEEKDAYS[0]);
    }

    public void testEncodingDE() {
        assertEquals("Gei\u00dfblatt", FrenchRevolutionaryCalendarLabelsDE.DAY_OF_YEAR[8][22]);
    }
}
