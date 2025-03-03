package ru.calendar.feature.calendar.ui.calendar.mapper

import kotlinx.datetime.Month
import ru.calendar.core.tools.formatter.LocalDateFormatter
import ru.calendar.feature.calendar.ui.calendar.delegates.CalendarProvider
import ru.calendar.feature.calendar.ui.calendar.delegates.daysOfWeek.CalendarDaysOfWeekDelegateView
import ru.calendar.feature.calendar.ui.calendar.delegates.params.CalendarDaysOfWeekParams
import ru.calendar.feature.calendar.ui.calendar.delegates.params.CalendarDefaultParams
import ru.calendar.feature.calendar.ui.calendar.delegates.params.CalendarParams
import ru.calendar.feature.calendar.ui.calendar.model.WeekBuilderModel
import ru.calendar.feature.calendar.ui.calendar.week.WeekItem

interface CalendarItemMapper {

    fun mapDayOfWeekParams(
        width: Int,
        stepWidth: Float,
        cellWidth: Float,
    ): CalendarDaysOfWeekParams

    fun mapCalendarParams(
        width: Int,
        startY: Int,
        stepWidth: Float,
        stepHeight: Float,
        cellWidth: Float,
        cellHeight: Float,
    ): CalendarParams

    fun mapWeekItemByCount(
        weekList: List<WeekItem.State>,
        focus: LocalDateFormatter,
        month: Month,
        count: Int?,
        calendarParams: CalendarParams,
    ): WeekItem.State?

    fun mapWeekList(
        width: Int,
        heightWithoutWeek: Int,
        calendarParams: CalendarParams,
        date: LocalDateFormatter,
        focus: LocalDateFormatter?,
        daysOfWeekDelegateView: CalendarDaysOfWeekDelegateView,
        provider: CalendarProvider
    ): WeekBuilderModel

    fun mapDefaultParams(): CalendarDefaultParams
}