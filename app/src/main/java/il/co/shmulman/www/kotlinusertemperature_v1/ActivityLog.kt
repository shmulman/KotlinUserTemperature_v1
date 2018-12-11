package il.co.shmulman.www.kotlinusertemperature_v1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_log.*

class ActivityLog : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log)

        // Read the Log data from the Main Activity
        val logDataArrayList : ArrayList<String> = intent.getStringArrayListExtra ("textLogData")
        if (logDataArrayList.isEmpty()) {
            LogOutput.append("No sensors data found")
        } else{
            LogOutput.append(logDataArrayList.toString())
        }

        // Go back to Main Activity
        LogBackBtn.setOnClickListener {
            val intentBackToMain = Intent (applicationContext, MainActivity::class.java)
            startActivity(intentBackToMain)
        }
    }
}
