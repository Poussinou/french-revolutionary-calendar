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

import java.util.Locale;

import ca.rmen.lfrc.FrenchRevolutionaryCalendar;
import junit.framework.TestCase;

/**
 * These tests make sure that we have the correct names for the days in the year.
 * 
 */
public class FrenchRevolutionaryCalendarDaysOfYearTest extends TestCase {

    public FrenchRevolutionaryCalendarDaysOfYearTest(String name) {
        super(name);
        System.out.println(name);
    }

    @Override
    protected void setUp() {}

    @Override
    protected void tearDown() {}

    public void testNumberOfDaysOfYearFR() {
        assertEquals(FrenchRevolutionaryCalendarLabelsFR.DAY_OF_YEAR.length, 13);
        for (int i = 0; i < 12; i++) {
            assertEquals(FrenchRevolutionaryCalendarLabelsFR.DAY_OF_YEAR[i].length, 30);
        }
        assertEquals(FrenchRevolutionaryCalendarLabelsFR.DAY_OF_YEAR[12].length, 6);
    }

    public void testNumberOfDaysOfYearEN() {
        assertEquals(FrenchRevolutionaryCalendarLabelsEN.DAY_OF_YEAR.length, 13);
        for (int i = 0; i < 12; i++) {
            assertEquals(FrenchRevolutionaryCalendarLabelsEN.DAY_OF_YEAR[i].length, 30);
        }
        assertEquals(FrenchRevolutionaryCalendarLabelsEN.DAY_OF_YEAR[12].length, 6);
    }

    public void testNumberOfDaysOfYearES() {
        assertEquals(FrenchRevolutionaryCalendarLabelsES.DAY_OF_YEAR.length, 13);
        for (int i = 0; i < 12; i++) {
            assertEquals(FrenchRevolutionaryCalendarLabelsES.DAY_OF_YEAR[i].length, 30);
        }
        assertEquals(FrenchRevolutionaryCalendarLabelsES.DAY_OF_YEAR[12].length, 6);
    }

    public void testNumberOfDaysOfYearCA() {
        assertEquals(FrenchRevolutionaryCalendarLabelsCA.DAY_OF_YEAR.length, 13);
        for (int i = 0; i < 12; i++) {
            assertEquals(FrenchRevolutionaryCalendarLabelsCA.DAY_OF_YEAR[i].length, 30);
        }
        assertEquals(FrenchRevolutionaryCalendarLabelsCA.DAY_OF_YEAR[12].length, 6);
    }

    public void testNumberOfDaysOfYearIT() {
        assertEquals(FrenchRevolutionaryCalendarLabelsIT.DAY_OF_YEAR.length, 13);
        for (int i = 0; i < 12; i++) {
            assertEquals(FrenchRevolutionaryCalendarLabelsIT.DAY_OF_YEAR[i].length, 30);
        }
        assertEquals(FrenchRevolutionaryCalendarLabelsIT.DAY_OF_YEAR[12].length, 6);
    }

    public void testDayOfYear1() {
        testDayOfYear(Locale.ENGLISH, 69, "Juniper");
    }

    public void testDayOfYear2() {
        testDayOfYear(Locale.ENGLISH, 125, "Bull");
    }

    public void testDayOfYear3() {
        testDayOfYear(Locale.ENGLISH, 366, "Revolution");
    }

    public void testDayOfYear4() {
        testDayOfYear(Locale.ENGLISH, 1, "Grape");
    }

    public void testDayOfYear5() {
        testDayOfYear(Locale.FRENCH, 360, "Panier");
    }

    public void testDayOfYear6() {
        testDayOfYear(Locale.FRENCH, 302, "Bouillon blanc");
    }

    public void testDayOfYear7() {
        testDayOfYear(Locale.FRENCH, 91, "Tourbe");
    }

    public void testDayOfYear8() {
        testDayOfYear(Locale.FRENCH, 1, "Raisin");
    }

    public void testDayOfYear9() {
        testDayOfYear(new Locale("es", "MX"), 31, "Manzana");
    }

    public void testDayOfYear10() {
        testDayOfYear(new Locale("es", "MX"), 158, "Violeta");
    }

    public void testDayOfYear11() {
        testDayOfYear(new Locale("es", "ES"), 211, "Rosa");
    }

    public void testDayOfYear12() {
        testDayOfYear(new Locale("es", "ES"), 358, "Maíz");
    }

    public void testDayOfYear13() {
        testDayOfYear(new Locale("ca", "ES"), 2, "Safrà");
    }

    public void testDayOfYear14() {
        testDayOfYear(new Locale("ca", "ES"), 34, "Remolatxa");
    }

    public void testDayOfYear15() {
        testDayOfYear(new Locale("ca", "ES"), 5, "Cavall");
    }

    public void testDayOfYear16() {
        testDayOfYear(new Locale("ca", "ES"), 9, "Xirivia");
    }

    public void testDayOfYear17() {
        testDayOfYear(new Locale("it", "IT"), 364, "Opinione");
    }

    public void testDayOfYear18() {
        testDayOfYear(new Locale("it", "IT"), 79, "Sabina");
    }

    public void testDayOfYear19() {
        testDayOfYear(new Locale("it", "IT"), 203, "Ippocastano");
    }

    public void testDayOfYear20() {
        testDayOfYear(new Locale("de", "DE"), 49, "Granatapfel");
    }

    public void testDayOfYear21() {
        testDayOfYear(new Locale("de", "DE"), 83, "Schilfrohr");
    }

    public void testDayOfYear22() {
        testDayOfYear(new Locale("de", "DE"), 354, "Sorghum");
    }

    public void testNumberDailyObjectTypeEN() {
        assert(FrenchRevolutionaryCalendarLabelsEN.DAILY_OBJECT_TYPES.length == FrenchRevolutionaryCalendar.DailyObjectType.values().length);
    }

    public void testNumberDailyObjectTypeFR() {
        assert(FrenchRevolutionaryCalendarLabelsFR.DAILY_OBJECT_TYPES.length == FrenchRevolutionaryCalendar.DailyObjectType.values().length);
    }

    public void testNumberDailyObjectTypeES() {
        assert(FrenchRevolutionaryCalendarLabelsES.DAILY_OBJECT_TYPES.length == FrenchRevolutionaryCalendar.DailyObjectType.values().length);
    }

    public void testNumberDailyObjectTypeIT() {
        assert(FrenchRevolutionaryCalendarLabelsIT.DAILY_OBJECT_TYPES.length == FrenchRevolutionaryCalendar.DailyObjectType.values().length);
    }

    public void testNumberDailyObjectTypeCA() {
        assert(FrenchRevolutionaryCalendarLabelsCA.DAILY_OBJECT_TYPES.length == FrenchRevolutionaryCalendar.DailyObjectType.values().length);
    }

    private void testDayOfYear(Locale locale, int dayOfYear, String expectedName) {
        FrenchRevolutionaryCalendarLabels labels = FrenchRevolutionaryCalendarLabels.getInstance(locale);
        assertEquals(expectedName, labels.getDayOfYear(dayOfYear));
    }

}
