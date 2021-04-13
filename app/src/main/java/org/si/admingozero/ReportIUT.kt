package org.si.admingozero

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.anychart.AnyChart
import com.anychart.AnyChartView
import com.anychart.chart.common.dataentry.DataEntry
import com.anychart.chart.common.dataentry.ValueDataEntry
import java.util.*

class ReportIUT : AppCompatActivity() {

    var anyChartView: AnyChartView? = null

    var months = arrayOf("Perbaikan", "Pencegahan")
    var earnings = intArrayOf(14, 86)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        setContentView(R.layout.activity_report)

        anyChartView = findViewById(R.id.chart)

        setupPieChart()
    }

    private fun setupPieChart() {

        val pie = AnyChart.pie()
        val dataEntries: MutableList<DataEntry> = ArrayList()

        for (i in months.indices) {
            dataEntries.add(ValueDataEntry(months[i], earnings[i]))
        }

        pie.data(dataEntries)
        pie.title("Corrective Inspection")
        anyChartView!!.setChart(pie)
    }
}