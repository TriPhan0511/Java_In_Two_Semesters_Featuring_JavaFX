package com.triphan.exercises.equipmentManagementApp;

// Exercise: chapter 08 Implementing classes / exercise 08
public class TimeTable
{
  private Booking[][] times;

//  The constructor
  public TimeTable(int numberOfDays, int numberOfPeriod)
  {
    times = new Booking[numberOfDays][numberOfPeriod];
  }

  /**
   * Accepts the booking details for a particular day and period, as long as
   * this slot is not previously booked and the day and period numbers are valid,
   * updates the timetable accordingly.
   * @param day An integer representing a particular day.
   * @param period An integer representing a particular period within a day.
   * @param booking A Booking object.
   * @return true if the booking was recorded successfully and false if not.
   */
  public boolean makeBooking(int day, int period, Booking booking)
  {
    if (day >= numberOfDays()
        || period >= numberOfPeriods()
        || times[day][period] != null)
    {
      return false;
    }
    times[day][period] = booking;
    return true;
  }

  /**
   * Cancels the booking details for a particular day and period.
   * @param day An integer representing a particular day.
   * @param period An integer representing a particular period within a day.
   * @return false if the given slot was not previously booked or the day
   * and period number are invalid, and true if the slot was cancelled successfully.
   */
  public boolean cancelBooking(int day, int period)
  {
    if (day >= numberOfDays()
        || period >= numberOfPeriods()
        || times[day][period] == null)
    {
      return false;
    }
    times[day][period] = null;
    return true;
  }

  /**
   * Accepts a day and period number and returns true if the day and period
   * numbers are valid and the given slot is free, and false otherwise.
   * @param day
   * @param period
   * @return true or false.
   */
  public boolean isFree(int day, int period)
  {
    if (day >= numberOfDays()
        || period >= numberOfPeriods()
        || times[day][period] != null)
    {
      return false;
    }
    return true;
  }

  /**
   * Accepts a day and period number and returns the booking for the given slot
   * if the day and period number are valid and the slot has been booked or
   * null otherwise.
   * @param day
   * @param period
   * @return A Booking object or null.
   */
  public Booking getBooking(int day, int period)
  {
    if (day >= numberOfDays()
        || period >= numberOfPeriods()
        || times[day][period] == null)
    {
      return null;
    }
    return times[day][period];
  }

  /**
   * Returns the number of days associated with this timetable.
   * @return An integer.
   */
  public int numberOfDays()
  {
    return times.length;
  }

  /**
   * Returns the number of periods associated with this timetable.
   * @return An integer.
   */
  public int numberOfPeriods()
  {
    return times[0].length;
  }
}


































